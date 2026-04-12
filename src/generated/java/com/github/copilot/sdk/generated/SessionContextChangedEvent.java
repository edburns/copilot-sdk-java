/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.sdk.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;

/** The {@code session.context_changed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionContextChangedEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionContextChangedEventData data;

    public SessionContextChangedEventData getData() { return data; }
    public void setData(SessionContextChangedEventData data) { this.data = data; }

    /** Data payload for {@link SessionContextChangedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionContextChangedEventData {

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
        private SessionContextChangedEventDataHostType hostType;

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

        public SessionContextChangedEventDataHostType getHostType() { return hostType; }
        public void setHostType(SessionContextChangedEventDataHostType hostType) { this.hostType = hostType; }

        public String getBranch() { return branch; }
        public void setBranch(String branch) { this.branch = branch; }

        public String getHeadCommit() { return headCommit; }
        public void setHeadCommit(String headCommit) { this.headCommit = headCommit; }

        public String getBaseCommit() { return baseCommit; }
        public void setBaseCommit(String baseCommit) { this.baseCommit = baseCommit; }


        /** Hosting platform type of the repository (github or ado) */
        public enum SessionContextChangedEventDataHostType {
            /** The {@code github} variant. */
            GITHUB("github"),
            /** The {@code ado} variant. */
            ADO("ado");

            private final String value;
            SessionContextChangedEventDataHostType(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }
    }
}
