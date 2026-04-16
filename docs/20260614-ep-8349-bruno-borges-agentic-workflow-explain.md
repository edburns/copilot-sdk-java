
## How it works

The repo uses a **three-stage agentic pipeline** to keep the Java SDK in sync with the upstream [github/copilot-sdk](https://github.com/github/copilot-sdk):

### Actors

| Actor | Role |
|---|---|
| **Weekly Upstream Sync Workflow** | Cron-triggered (Mondays). Detects new upstream commits by comparing `.lastmerge` against upstream HEAD. Creates a GitHub issue and assigns it to Copilot. |
| **Copilot Coding Agent** (`copilot-swe-agent`) | Picks up the assigned issue, follows the detailed [`agentic-merge-upstream.prompt.md`](https://github.com/github/copilot-sdk-java/blob/main/.github/prompts/agentic-merge-upstream.prompt.md) instructions to port .NET changes to idiomatic Java, runs tests, and pushes a PR. |
| **Utility Scripts** (`.github/scripts/`) | Automate repeatable tasks: cloning upstream, generating diffs, formatting code, running tests, updating `.lastmerge`, and pushing. |
| **Agentic Maintenance Workflow** | Runs daily. Closes expired issues/PRs (upstream-sync issues expire after 6 days) to prevent stale work from accumulating. |
| **Copilot Setup Steps Workflow** | Configures the agent's environment (JDK 17, Node.js, Maven, `gh-aw` CLI, git hooks) so the coding agent can build and test. |
| **Human Reviewer** | Reviews and merges the PR created by Copilot. |

### Key design decisions
- The **detection agent** (weekly sync) is deliberately separated from the **porting agent** (Copilot coding agent) — the sync workflow only creates issues, never touches code.
- The `.lastmerge` file acts as a simple **cursor/bookmark** tracking the last upstream commit successfully merged.
- Expired issue cleanup (6-day TTL) ensures that if Copilot fails or a newer sync supersedes the old one, stale issues are automatically closed.