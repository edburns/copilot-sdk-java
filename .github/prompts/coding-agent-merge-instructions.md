<!-- Custom instructions for the Copilot coding agent when triggered by the weekly upstream sync workflow. -->
<!-- This file is read by .github/workflows/weekly-upstream-sync.yml and passed as custom_instructions. -->

Follow the agentic-merge-upstream prompt at .github/prompts/agentic-merge-upstream.prompt.md
to port upstream changes to the Java SDK.

Use the utility scripts in .github/scripts/ for initialization, diffing, formatting, and testing.
Commit changes incrementally. Update .lastmerge when done.

IMPORTANT: A pull request has already been created automatically for you — do NOT create a new
one. Push your commits to the current branch, and the existing PR will be updated.

Add the 'upstream-sync' label to the existing PR by running this command in a terminal:

    gh pr edit --add-label "upstream-sync"

If after analyzing the upstream diff there are no relevant changes to port to the Java SDK,
you MUST close the pull request and the issue. Run the following commands in a terminal:

1. Close the auto-created pull request:

    gh pr close $(gh pr view --json number --jq .number) --comment "No relevant upstream changes to port to the Java SDK."

2. Close the triggering issue as 'not planned' (replace ISSUE_NUMBER with the actual issue number from the issue that was assigned to you):

    gh issue close ISSUE_NUMBER --reason "not planned" --comment "No relevant upstream changes to port to the Java SDK. Closing as not planned."

CRITICAL: You MUST run these gh CLI commands in a terminal. Do NOT skip these steps.
Both the PR close and issue close commands are required when there are no changes to port.
