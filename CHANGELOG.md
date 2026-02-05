# Changelog

All notable changes to the Copilot SDK for Java will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.7] - 2026-02-05

### Added

#### Session Lifecycle Hooks
Extended the hooks system with three new hook types for session lifecycle control:
- **`onSessionStart`** - Called when a session starts (new or resumed)
- **`onSessionEnd`** - Called when a session ends
- **`onUserPromptSubmitted`** - Called when the user submits a prompt

New types:
- `SessionStartHandler`, `SessionStartHookInput`, `SessionStartHookOutput`
- `SessionEndHandler`, `SessionEndHookInput`, `SessionEndHookOutput`
- `UserPromptSubmittedHandler`, `UserPromptSubmittedHookInput`, `UserPromptSubmittedHookOutput`

#### Session Lifecycle Events (Client-Level)
Added client-level lifecycle event subscriptions:
- `client.onLifecycle(handler)` - Subscribe to all session lifecycle events
- `client.onLifecycle(eventType, handler)` - Subscribe to specific event types
- `SessionLifecycleEventTypes.CREATED`, `DELETED`, `UPDATED`, `FOREGROUND`, `BACKGROUND`

New types: `SessionLifecycleEvent`, `SessionLifecycleEventMetadata`, `SessionLifecycleHandler`

#### Foreground Session Control (TUI+Server Mode)
For servers running with `--ui-server`:
- `client.getForegroundSessionId()` - Get the session displayed in TUI
- `client.setForegroundSessionId(sessionId)` - Switch TUI display to a session

New types: `GetForegroundSessionResponse`, `SetForegroundSessionResponse`

#### New Event Types
- **`SessionShutdownEvent`** - Emitted when session is shutting down, includes reason and exit code
- **`SkillInvokedEvent`** - Emitted when a skill is invoked, includes skill name and context

#### Extended Event Data
- `AssistantMessageEvent.Data` - Added `id`, `isLastReply`, `thinkingContent` fields
- `AssistantUsageEvent.Data` - Added `outputReasoningTokens` field
- `SessionCompactionCompleteEvent.Data` - Added `success`, `messagesRemoved`, `tokensRemoved` fields
- `SessionErrorEvent.Data` - Extended with additional error context

#### Documentation
- New **[hooks.md](src/site/markdown/hooks.md)** - Comprehensive guide covering all 5 session hooks with examples for security gates, logging, result enrichment, and lifecycle management
- Expanded **[documentation.md](src/site/markdown/documentation.md)** with all 33 event types, `getMessages()`, `abort()`, and custom timeout examples
- Enhanced **[advanced.md](src/site/markdown/advanced.md)** with session hooks, lifecycle events, and foreground session control
- Added **[.github/copilot-instructions.md](.github/copilot-instructions.md)** for AI assistants

#### Testing
- `SessionEventParserTest` - 850+ lines of unit tests for JSON event deserialization
- `SessionEventsE2ETest` - End-to-end tests for session event lifecycle
- `ErrorHandlingTest` - Tests for error handling scenarios
- Enhanced `E2ETestContext` with snapshot validation and expected prompt logging
- Added logging configuration (`logging.properties`)

#### Build & CI
- JaCoCo 0.8.14 for test coverage reporting
- Coverage reports generated at `target/site/jacoco-coverage/`
- New test report action at `.github/actions/test-report/`
- JaCoCo coverage summary in workflow summary
- Coverage report artifact upload

### Changed

- **Copilot CLI**: Minimum version updated from 0.0.400 to **0.0.404**
- Refactored `ProcessInfo` and `Connection` to use records
- Extended `SessionHooks` to support 5 hook types (was 2)
- Renamed test methods to match snapshot naming conventions with Javadoc

### Fixed

- Improved timeout exception handling with detailed logging
- Test infrastructure improvements for proxy resilience

## [1.0.6] - 2026-01-28

### Added

- Initial public release of the Copilot SDK for Java
- Core classes: `CopilotClient`, `CopilotSession`, `JsonRpcClient`
- Session configuration with `SessionConfig`, `ResumeSessionConfig`
- Custom tools with `ToolDefinition` and `ToolHandler`
- Event system with 30+ event types extending `AbstractSessionEvent`
- Pre-tool and post-tool hooks with `SessionHooks`
- Permission handling with `PermissionHandler`
- User input handling with `UserInputHandler`
- BYOK (Bring Your Own Key) support with `ProviderConfig`
- MCP server integration
- Infinite sessions with `InfiniteSessionConfig`
- Skills configuration with `skillDirectories` and `disabledSkills`
- System message customization with `SystemMessageConfig`
- File attachments support
- Streaming responses with delta events

### Documentation

- Getting started guide
- Basic usage documentation
- Advanced usage guide
- MCP servers guide
- Generated Javadoc

[1.0.7]: https://github.com/copilot-community-sdk/copilot-sdk-java/compare/v1.0.6...v1.0.7
[1.0.6]: https://github.com/copilot-community-sdk/copilot-sdk-java/releases/tag/v1.0.6
