# Advanced Usage

> ⚠️ **Disclaimer:** This is an **unofficial, community-driven SDK** and is **not supported or endorsed by GitHub**. Use at your own risk.

This guide covers advanced scenarios for extending and customizing your Copilot integration.

---

## Custom Tools

Let the AI call back into your application to fetch data or perform actions.

```java
// Define strongly-typed arguments with a record
record IssueArgs(String id) {}

var lookupTool = ToolDefinition.create(
    "lookup_issue",
    "Fetch issue details from our tracker",
    Map.of(
        "type", "object",
        "properties", Map.of(
            "id", Map.of("type", "string", "description", "Issue identifier")
        ),
        "required", List.of("id")
    ),
    invocation -> {
        IssueArgs args = invocation.getArgumentsAs(IssueArgs.class);
        return CompletableFuture.completedFuture(fetchIssue(args.id()));
    }
);

var session = client.createSession(
    new SessionConfig()
        .setTools(List.of(lookupTool))
).get();
```

See [ToolDefinition](apidocs/com/github/copilot/sdk/ToolDefinition.html) Javadoc for schema details.

---

## System Messages

Customize the AI's behavior by adding rules or replacing the default prompt.

### Adding Rules

Use `APPEND` mode to add constraints while keeping default guardrails:

```java
var session = client.createSession(
    new SessionConfig()
        .setSystemMessage(new SystemMessageConfig()
            .setMode(SystemMessageMode.APPEND)
            .setContent("""
                <rules>
                - Always check for security vulnerabilities
                - Suggest performance improvements
                </rules>
            """))
).get();
```

### Full Control

Use `REPLACE` mode for complete control (removes default guardrails):

```java
var session = client.createSession(
    new SessionConfig()
        .setSystemMessage(new SystemMessageConfig()
            .setMode(SystemMessageMode.REPLACE)
            .setContent("You are a helpful coding assistant."))
).get();
```

---

## File Attachments

Include files as context for the AI to analyze.

```java
session.send(new MessageOptions()
    .setPrompt("Review this file for bugs")
    .setAttachments(List.of(
        new Attachment()
            .setType("file")
            .setPath("/path/to/file.java")
            .setDisplayName("MyService.java")
    ))
).get();
```

---

## Bring Your Own Key (BYOK)

Use your own OpenAI or Azure OpenAI API key instead of GitHub Copilot.

```java
var session = client.createSession(
    new SessionConfig()
        .setProvider(new ProviderConfig()
            .setType("openai")
            .setBaseUrl("https://api.openai.com/v1")
            .setApiKey("sk-..."))
).get();
```

---

## Infinite Sessions

Run long conversations without hitting context limits.

When enabled (default), the session automatically compacts older messages as the context window fills up.

```java
var session = client.createSession(
    new SessionConfig()
        .setInfiniteSessions(new InfiniteSessionConfig()
            .setEnabled(true)
            .setBackgroundCompactionThreshold(0.80)  // Start compacting at 80%
            .setBufferExhaustionThreshold(0.95))     // Block at 95%
).get();

// Access the workspace where session state is persisted
String workspace = session.getWorkspacePath();
```

For short conversations, disable to avoid overhead:

```java
new InfiniteSessionConfig().setEnabled(false)
```

---

## MCP Servers

Extend the AI with external tools via the Model Context Protocol.

```java
Map<String, Object> server = Map.of(
    "type", "local",
    "command", "npx",
    "args", List.of("-y", "@modelcontextprotocol/server-filesystem", "/tmp"),
    "tools", List.of("*")
);

var session = client.createSession(
    new SessionConfig()
        .setMcpServers(Map.of("filesystem", server))
).get();
```

📖 **[Full MCP documentation →](mcp.html)** for local/remote servers and all options.

---

## Permission Handling

Approve or deny permission requests from the AI.

```java
var session = client.createSession(
    new SessionConfig()
        .setOnPermissionRequest((request, invocation) -> {
            // Inspect request and approve/deny
            var result = new PermissionRequestResult();
            result.setKind("user-approved");
            return CompletableFuture.completedFuture(result);
        })
).get();
```

---

## Manual Server Control

Control the CLI lifecycle yourself instead of auto-start.

```java
var client = new CopilotClient(
    new CopilotClientOptions().setAutoStart(false)
);

client.start().get();   // Start manually
// ... use client ...
client.stop().get();    // Stop manually
```

---

## Error Handling

All SDK methods return `CompletableFuture`. Errors surface via `ExecutionException`:

```java
try {
    session.send(new MessageOptions().setPrompt("Hello")).get();
} catch (ExecutionException ex) {
    System.err.println("Error: " + ex.getCause().getMessage());
}
```

For reactive error handling, use `exceptionally()` or `handle()`:

```java
session.send(new MessageOptions().setPrompt("Hello"))
    .exceptionally(ex -> {
        System.err.println("Failed: " + ex.getMessage());
        return null;
    });
```
