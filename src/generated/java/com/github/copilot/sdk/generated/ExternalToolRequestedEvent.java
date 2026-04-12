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

/** The {@code external_tool.requested} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ExternalToolRequestedEvent extends SessionEvent {

    @JsonProperty("data")
    private ExternalToolRequestedEventData data;

    public ExternalToolRequestedEventData getData() { return data; }
    public void setData(ExternalToolRequestedEventData data) { this.data = data; }

    /** Data payload for {@link ExternalToolRequestedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ExternalToolRequestedEventData {

        /** Unique identifier for this request; used to respond via session.respondToExternalTool() */
        @JsonProperty("requestId")
        private String requestId;

        /** Session ID that this external tool request belongs to */
        @JsonProperty("sessionId")
        private String sessionId;

        /** Tool call ID assigned to this external tool invocation */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** Name of the external tool to invoke */
        @JsonProperty("toolName")
        private String toolName;

        /** Arguments to pass to the external tool */
        @JsonProperty("arguments")
        private Object arguments;

        /** W3C Trace Context traceparent header for the execute_tool span */
        @JsonProperty("traceparent")
        private String traceparent;

        /** W3C Trace Context tracestate header for the execute_tool span */
        @JsonProperty("tracestate")
        private String tracestate;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public String getSessionId() { return sessionId; }
        public void setSessionId(String sessionId) { this.sessionId = sessionId; }

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

        public String getToolName() { return toolName; }
        public void setToolName(String toolName) { this.toolName = toolName; }

        public Object getArguments() { return arguments; }
        public void setArguments(Object arguments) { this.arguments = arguments; }

        public String getTraceparent() { return traceparent; }
        public void setTraceparent(String traceparent) { this.traceparent = traceparent; }

        public String getTracestate() { return tracestate; }
        public void setTracestate(String tracestate) { this.tracestate = tracestate; }
    }
}
