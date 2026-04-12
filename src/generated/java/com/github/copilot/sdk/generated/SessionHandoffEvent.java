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

/** The {@code session.handoff} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionHandoffEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionHandoffEventData data;

    public SessionHandoffEventData getData() { return data; }
    public void setData(SessionHandoffEventData data) { this.data = data; }

    /** Data payload for {@link SessionHandoffEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionHandoffEventData {

        /** ISO 8601 timestamp when the handoff occurred */
        @JsonProperty("handoffTime")
        private OffsetDateTime handoffTime;

        /** Origin type of the session being handed off */
        @JsonProperty("sourceType")
        private SessionHandoffEventDataSourceType sourceType;

        /** Repository context for the handed-off session */
        @JsonProperty("repository")
        private SessionHandoffEventDataRepository repository;

        /** Additional context information for the handoff */
        @JsonProperty("context")
        private String context;

        /** Summary of the work done in the source session */
        @JsonProperty("summary")
        private String summary;

        /** Session ID of the remote session being handed off */
        @JsonProperty("remoteSessionId")
        private String remoteSessionId;

        /** GitHub host URL for the source session (e.g., https://github.com or https://tenant.ghe.com) */
        @JsonProperty("host")
        private String host;

        public OffsetDateTime getHandoffTime() { return handoffTime; }
        public void setHandoffTime(OffsetDateTime handoffTime) { this.handoffTime = handoffTime; }

        public SessionHandoffEventDataSourceType getSourceType() { return sourceType; }
        public void setSourceType(SessionHandoffEventDataSourceType sourceType) { this.sourceType = sourceType; }

        public SessionHandoffEventDataRepository getRepository() { return repository; }
        public void setRepository(SessionHandoffEventDataRepository repository) { this.repository = repository; }

        public String getContext() { return context; }
        public void setContext(String context) { this.context = context; }

        public String getSummary() { return summary; }
        public void setSummary(String summary) { this.summary = summary; }

        public String getRemoteSessionId() { return remoteSessionId; }
        public void setRemoteSessionId(String remoteSessionId) { this.remoteSessionId = remoteSessionId; }

        public String getHost() { return host; }
        public void setHost(String host) { this.host = host; }


        /** Origin type of the session being handed off */
        public enum SessionHandoffEventDataSourceType {
            /** The {@code remote} variant. */
            REMOTE("remote"),
            /** The {@code local} variant. */
            LOCAL("local");

            private final String value;
            SessionHandoffEventDataSourceType(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }

        /** Repository context for the handed-off session */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionHandoffEventDataRepository {

            /** Repository owner (user or organization) */
            @JsonProperty("owner")
            private String owner;

            /** Repository name */
            @JsonProperty("name")
            private String name;

            /** Git branch name, if applicable */
            @JsonProperty("branch")
            private String branch;

            public String getOwner() { return owner; }
            public void setOwner(String owner) { this.owner = owner; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public String getBranch() { return branch; }
            public void setBranch(String branch) { this.branch = branch; }
        }
    }
}
