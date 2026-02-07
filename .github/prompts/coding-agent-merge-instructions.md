<!-- Custom instructions for the Copilot coding agent when triggered by the weekly upstream sync workflow. -->
<!-- This file is read by .github/workflows/weekly-upstream-sync.yml and passed as custom_instructions. -->

Follow the agentic-merge-upstream prompt at .github/prompts/agentic-merge-upstream.prompt.md
to port upstream changes to the Java SDK.

Use the utility scripts in .github/scripts/ for initialization, diffing, formatting, and testing.
Commit changes incrementally. Update .lastmerge when done.

IMPORTANT: A pull request has already been created automatically for you — do NOT create a new
one. Push your commits to the current branch, and the existing PR will be updated.

Add the 'upstream-sync' label to the existing PR using the GitHub MCP tool:

    mcp_github_add_issue_labels(owner: "copilot-community-sdk", repo: "copilot-sdk-java", issue_number: <PR_NUMBER>, labels: ["upstream-sync"])

If after analyzing the upstream diff there are no relevant changes to port to the Java SDK,
you MUST close the pull request and the issue. Use these exact GitHub MCP tool calls:

1. Close the auto-created pull request:

    mcp_github_update_pull_request(owner: "copilot-community-sdk", repo: "copilot-sdk-java", pullNumber: <PR_NUMBER>, state: "closed")

2. Add a comment to the issue explaining no changes were needed:

    mcp_github_add_issue_comment(owner: "copilot-community-sdk", repo: "copilot-sdk-java", issue_number: <ISSUE_NUMBER>, body: "No relevant upstream changes to port to the Java SDK. Closing as not planned.")

3. Close the issue as 'not planned':

    mcp_github_update_issue(owner: "copilot-community-sdk", repo: "copilot-sdk-java", issue_number: <ISSUE_NUMBER>, state: "closed", state_reason: "not_planned")

Do NOT skip these steps. All three tool calls are required.
