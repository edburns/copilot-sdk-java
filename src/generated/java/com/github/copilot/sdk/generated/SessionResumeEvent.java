/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.sdk.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;

/** The {@code session.resume} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionResumeEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionResumeEventData data;

    public SessionResumeEventData getData() { return data; }
    public void setData(SessionResumeEventData data) { this.data = data; }

    /** Data payload for {@link SessionResumeEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionResumeEventData {

        /** ISO 8601 timestamp when the session was resumed */
        @JsonProperty("resumeTime")
        private OffsetDateTime resumeTime;

        /** Total number of persisted events in the session at the time of resume */
        @JsonProperty("eventCount")
        private Double eventCount;

        /** Model currently selected at resume time */
        @JsonProperty("selectedModel")
        private String selectedModel;

        /** Reasoning effort level used for model calls, if applicable (e.g. "low", "medium", "high", "xhigh") */
        @JsonProperty("reasoningEffort")
        private String reasoningEffort;

        /** Updated working directory and git context at resume time */
        @JsonProperty("context")
        private SessionResumeEventDataContext context;

        /** Whether the session was already in use by another client at resume time */
        @JsonProperty("alreadyInUse")
        private Boolean alreadyInUse;

        /** Whether this session supports remote steering via Mission Control */
        @JsonProperty("remoteSteerable")
        private Boolean remoteSteerable;

        public OffsetDateTime getResumeTime() { return resumeTime; }
        public void setResumeTime(OffsetDateTime resumeTime) { this.resumeTime = resumeTime; }

        public Double getEventCount() { return eventCount; }
        public void setEventCount(Double eventCount) { this.eventCount = eventCount; }

        public String getSelectedModel() { return selectedModel; }
        public void setSelectedModel(String selectedModel) { this.selectedModel = selectedModel; }

        public String getReasoningEffort() { return reasoningEffort; }
        public void setReasoningEffort(String reasoningEffort) { this.reasoningEffort = reasoningEffort; }

        public SessionResumeEventDataContext getContext() { return context; }
        public void setContext(SessionResumeEventDataContext context) { this.context = context; }

        public Boolean getAlreadyInUse() { return alreadyInUse; }
        public void setAlreadyInUse(Boolean alreadyInUse) { this.alreadyInUse = alreadyInUse; }

        public Boolean getRemoteSteerable() { return remoteSteerable; }
        public void setRemoteSteerable(Boolean remoteSteerable) { this.remoteSteerable = remoteSteerable; }


        /** Updated working directory and git context at resume time */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionResumeEventDataContext {

            /** Current working directory path */
            @JsonProperty("cwd")
            private String cwd;

            /** Root directory of the git repository, resolved via git rev-parse */
            @JsonProperty("gitRoot")
            private String gitRoot;

            /** Repository identifier derived from the git remote URL ("owner/name" for GitHub, "org/project/repo" for Azure DevOps) */
            @JsonProperty("repository")
            private String repository;

            /** Hosting platform type of the repository (github or ado) */
            @JsonProperty("hostType")
            private SessionResumeEventDataContextHostType hostType;

            /** Current git branch name */
            @JsonProperty("branch")
            private String branch;

            /** Head commit of current git branch at session start time */
            @JsonProperty("headCommit")
            private String headCommit;

            /** Base commit of current git branch at session start time */
            @JsonProperty("baseCommit")
            private String baseCommit;

            public String getCwd() { return cwd; }
            public void setCwd(String cwd) { this.cwd = cwd; }

            public String getGitRoot() { return gitRoot; }
            public void setGitRoot(String gitRoot) { this.gitRoot = gitRoot; }

            public String getRepository() { return repository; }
            public void setRepository(String repository) { this.repository = repository; }

            public SessionResumeEventDataContextHostType getHostType() { return hostType; }
            public void setHostType(SessionResumeEventDataContextHostType hostType) { this.hostType = hostType; }

            public String getBranch() { return branch; }
            public void setBranch(String branch) { this.branch = branch; }

            public String getHeadCommit() { return headCommit; }
            public void setHeadCommit(String headCommit) { this.headCommit = headCommit; }

            public String getBaseCommit() { return baseCommit; }
            public void setBaseCommit(String baseCommit) { this.baseCommit = baseCommit; }


            /** Hosting platform type of the repository (github or ado) */
            public enum SessionResumeEventDataContextHostType {
                /** The {@code github} variant. */
                GITHUB("github"),
                /** The {@code ado} variant. */
                ADO("ado");

                private final String value;
                SessionResumeEventDataContextHostType(String value) { this.value = value; }
                @com.fasterxml.jackson.annotation.JsonValue
                public String getValue() { return value; }
            }
        }
    }
}
