sequenceDiagram
    participant Cron as ⏰ Cron Schedule<br/>(Monday 10:00 UTC)
    participant WUS as Weekly Upstream Sync<br/>Workflow
    participant Upstream as github/copilot-sdk<br/>(upstream repo)
    participant LastMerge as .lastmerge file
    participant GHIssues as GitHub Issues
    participant Copilot as Copilot Coding Agent<br/>(copilot-swe-agent)
    participant Prompt as agentic-merge-upstream<br/>prompt
    participant Scripts as Utility Scripts<br/>(.github/scripts/)
    participant JavaSDK as copilot-sdk-java<br/>repo (main branch)
    participant PR as Pull Request
    participant Maint as Agentic Maintenance<br/>Workflow (daily)

    Note over Cron,Maint: Phase 1 — Detect upstream changes (weekly-upstream-sync.yml)
    Cron->>WUS: Trigger (or manual workflow_dispatch)
    WUS->>LastMerge: Read last merged commit SHA
    LastMerge-->>WUS: e.g. c3fa6cb...
    WUS->>Upstream: git clone & rev-parse HEAD
    Upstream-->>WUS: UPSTREAM_HEAD SHA
    
    alt No new changes
        WUS->>GHIssues: Close any stale "upstream-sync" issues
        Note over WUS: Done — no further action
    else New commits detected
        WUS->>GHIssues: Close superseded "upstream-sync" issues
        WUS->>GHIssues: Create new issue:<br/>"Upstream sync: N new commits (date)"<br/>with commit summary & instructions
        WUS->>Copilot: Assign issue to copilot-swe-agent
    end

    Note over Copilot,PR: Phase 2 — Copilot Coding Agent ports changes
    Copilot->>GHIssues: Picks up assigned issue
    Copilot->>Prompt: Reads agentic-merge-upstream.prompt.md
    Copilot->>Scripts: Run merge-upstream-start.sh
    Scripts->>Upstream: Clone upstream repo
    Scripts->>LastMerge: Read last merge SHA
    Scripts-->>Copilot: Branch created, commit summary

    Copilot->>Scripts: Run merge-upstream-diff.sh
    Scripts-->>Copilot: Grouped diff (.NET src, tests, docs, etc.)

    Copilot->>Copilot: Analyze diff: identify features,<br/>bug fixes, protocol changes to port
    
    loop For each change to port
        Copilot->>JavaSDK: Adapt .NET code → idiomatic Java<br/>(types, tests, docs)
        Copilot->>Scripts: Run format-and-test.sh
        Scripts-->>Copilot: Spotless + mvn verify results
        Copilot->>Copilot: git commit (incremental)
    end

    Copilot->>Scripts: Run merge-upstream-finish.sh
    Scripts->>LastMerge: Update .lastmerge → UPSTREAM_HEAD
    Scripts->>JavaSDK: Final build + push branch

    Copilot->>PR: Push to auto-created PR branch
    Copilot->>PR: Update PR body with ported/skipped<br/>changes table, add "upstream-sync" label

    Note over PR,JavaSDK: Phase 3 — Human review & merge
    PR->>JavaSDK: Human reviews & merges to main

    Note over Maint: Phase 4 — Housekeeping (agentics-maintenance.yml)
    Maint->>GHIssues: Daily: close expired issues<br/>(upstream-sync issues expire after 6 days)
    Maint->>PR: Daily: close expired PRs