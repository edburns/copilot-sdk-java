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

/** The {@code session.start} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionStartEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionStartEventData data;

    public SessionStartEventData getData() { return data; }
    public void setData(SessionStartEventData data) { this.data = data; }

    /** Data payload for {@link SessionStartEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionStartEventData {

        /** Unique identifier for the session */
        @JsonProperty("sessionId")
        private String sessionId;

        /** Schema version number for the session event format */
        @JsonProperty("version")
        private Double version;

        /** Identifier of the software producing the events (e.g., "copilot-agent") */
        @JsonProperty("producer")
        private String producer;

        /** Version string of the Copilot application */
        @JsonProperty("copilotVersion")
        private String copilotVersion;

        /** ISO 8601 timestamp when the session was created */
        @JsonProperty("startTime")
        private OffsetDateTime startTime;

        /** Model selected at session creation time, if any */
        @JsonProperty("selectedModel")
        private String selectedModel;

        /** Reasoning effort level used for model calls, if applicable (e.g. "low", "medium", "high", "xhigh") */
        @JsonProperty("reasoningEffort")
        private String reasoningEffort;

        /** Working directory and git context at session start */
        @JsonProperty("context")
        private SessionStartEventDataContext context;

        /** Whether the session was already in use by another client at start time */
        @JsonProperty("alreadyInUse")
        private Boolean alreadyInUse;

        /** Whether this session supports remote steering via Mission Control */
        @JsonProperty("remoteSteerable")
        private Boolean remoteSteerable;

        public String getSessionId() { return sessionId; }
        public void setSessionId(String sessionId) { this.sessionId = sessionId; }

        public Double getVersion() { return version; }
        public void setVersion(Double version) { this.version = version; }

        public String getProducer() { return producer; }
        public void setProducer(String producer) { this.producer = producer; }

        public String getCopilotVersion() { return copilotVersion; }
        public void setCopilotVersion(String copilotVersion) { this.copilotVersion = copilotVersion; }

        public OffsetDateTime getStartTime() { return startTime; }
        public void setStartTime(OffsetDateTime startTime) { this.startTime = startTime; }

        public String getSelectedModel() { return selectedModel; }
        public void setSelectedModel(String selectedModel) { this.selectedModel = selectedModel; }

        public String getReasoningEffort() { return reasoningEffort; }
        public void setReasoningEffort(String reasoningEffort) { this.reasoningEffort = reasoningEffort; }

        public SessionStartEventDataContext getContext() { return context; }
        public void setContext(SessionStartEventDataContext context) { this.context = context; }

        public Boolean getAlreadyInUse() { return alreadyInUse; }
        public void setAlreadyInUse(Boolean alreadyInUse) { this.alreadyInUse = alreadyInUse; }

        public Boolean getRemoteSteerable() { return remoteSteerable; }
        public void setRemoteSteerable(Boolean remoteSteerable) { this.remoteSteerable = remoteSteerable; }


        /** Working directory and git context at session start */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionStartEventDataContext {

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
            private SessionStartEventDataContextHostType hostType;

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

            public SessionStartEventDataContextHostType getHostType() { return hostType; }
            public void setHostType(SessionStartEventDataContextHostType hostType) { this.hostType = hostType; }

            public String getBranch() { return branch; }
            public void setBranch(String branch) { this.branch = branch; }

            public String getHeadCommit() { return headCommit; }
            public void setHeadCommit(String headCommit) { this.headCommit = headCommit; }

            public String getBaseCommit() { return baseCommit; }
            public void setBaseCommit(String baseCommit) { this.baseCommit = baseCommit; }


            /** Hosting platform type of the repository (github or ado) */
            public enum SessionStartEventDataContextHostType {
                /** The {@code github} variant. */
                GITHUB("github"),
                /** The {@code ado} variant. */
                ADO("ado");

                private final String value;
                SessionStartEventDataContextHostType(String value) { this.value = value; }
                @com.fasterxml.jackson.annotation.JsonValue
                public String getValue() { return value; }
            }
        }
    }
}
