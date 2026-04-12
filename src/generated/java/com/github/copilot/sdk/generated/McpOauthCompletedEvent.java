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

/** The {@code mcp.oauth_completed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class McpOauthCompletedEvent extends SessionEvent {

    @JsonProperty("data")
    private McpOauthCompletedEventData data;

    public McpOauthCompletedEventData getData() { return data; }
    public void setData(McpOauthCompletedEventData data) { this.data = data; }

    /** Data payload for {@link McpOauthCompletedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class McpOauthCompletedEventData {

        /** Request ID of the resolved OAuth request */
        @JsonProperty("requestId")
        private String requestId;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }
    }
}
