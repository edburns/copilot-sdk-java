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

/** The {@code sampling.requested} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SamplingRequestedEvent extends SessionEvent {

    @JsonProperty("data")
    private SamplingRequestedEventData data;

    public SamplingRequestedEventData getData() { return data; }
    public void setData(SamplingRequestedEventData data) { this.data = data; }

    /** Data payload for {@link SamplingRequestedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SamplingRequestedEventData {

        /** Unique identifier for this sampling request; used to respond via session.respondToSampling() */
        @JsonProperty("requestId")
        private String requestId;

        /** Name of the MCP server that initiated the sampling request */
        @JsonProperty("serverName")
        private String serverName;

        /** The JSON-RPC request ID from the MCP protocol */
        @JsonProperty("mcpRequestId")
        private Object mcpRequestId;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public String getServerName() { return serverName; }
        public void setServerName(String serverName) { this.serverName = serverName; }

        public Object getMcpRequestId() { return mcpRequestId; }
        public void setMcpRequestId(Object mcpRequestId) { this.mcpRequestId = mcpRequestId; }
    }
}
