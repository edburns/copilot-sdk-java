/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: api.schema.json

package com.github.copilot.sdk.generated.rpc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;

/** Request parameters for the {@code session.log} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionLogParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Human-readable message */
    @JsonProperty("message")
    private String message;

    /** Log severity level. Determines how the message is displayed in the timeline. Defaults to "info". */
    @JsonProperty("level")
    private SessionLogParamsLevel level;

    /** When true, the message is transient and not persisted to the session event log on disk */
    @JsonProperty("ephemeral")
    private Boolean ephemeral;

    /** Optional URL the user can open in their browser for more details */
    @JsonProperty("url")
    private String url;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public SessionLogParamsLevel getLevel() { return level; }
    public void setLevel(SessionLogParamsLevel level) { this.level = level; }

    public Boolean getEphemeral() { return ephemeral; }
    public void setEphemeral(Boolean ephemeral) { this.ephemeral = ephemeral; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }


    /** Log severity level. Determines how the message is displayed in the timeline. Defaults to "info". */
    public enum SessionLogParamsLevel {
        /** The {@code info} variant. */
        INFO("info"),
        /** The {@code warning} variant. */
        WARNING("warning"),
        /** The {@code error} variant. */
        ERROR("error");

        private final String value;
        SessionLogParamsLevel(String value) { this.value = value; }
        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() { return value; }
    }
}
