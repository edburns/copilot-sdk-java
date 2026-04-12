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

/** The {@code subagent.failed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SubagentFailedEvent extends SessionEvent {

    @JsonProperty("data")
    private SubagentFailedEventData data;

    public SubagentFailedEventData getData() { return data; }
    public void setData(SubagentFailedEventData data) { this.data = data; }

    /** Data payload for {@link SubagentFailedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SubagentFailedEventData {

        /** Tool call ID of the parent tool invocation that spawned this sub-agent */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** Internal name of the sub-agent */
        @JsonProperty("agentName")
        private String agentName;

        /** Human-readable display name of the sub-agent */
        @JsonProperty("agentDisplayName")
        private String agentDisplayName;

        /** Error message describing why the sub-agent failed */
        @JsonProperty("error")
        private String error;

        /** Model used by the sub-agent (if any model calls succeeded before failure) */
        @JsonProperty("model")
        private String model;

        /** Total number of tool calls made before the sub-agent failed */
        @JsonProperty("totalToolCalls")
        private Double totalToolCalls;

        /** Total tokens (input + output) consumed before the sub-agent failed */
        @JsonProperty("totalTokens")
        private Double totalTokens;

        /** Wall-clock duration of the sub-agent execution in milliseconds */
        @JsonProperty("durationMs")
        private Double durationMs;

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

        public String getAgentName() { return agentName; }
        public void setAgentName(String agentName) { this.agentName = agentName; }

        public String getAgentDisplayName() { return agentDisplayName; }
        public void setAgentDisplayName(String agentDisplayName) { this.agentDisplayName = agentDisplayName; }

        public String getError() { return error; }
        public void setError(String error) { this.error = error; }

        public String getModel() { return model; }
        public void setModel(String model) { this.model = model; }

        public Double getTotalToolCalls() { return totalToolCalls; }
        public void setTotalToolCalls(Double totalToolCalls) { this.totalToolCalls = totalToolCalls; }

        public Double getTotalTokens() { return totalTokens; }
        public void setTotalTokens(Double totalTokens) { this.totalTokens = totalTokens; }

        public Double getDurationMs() { return durationMs; }
        public void setDurationMs(Double durationMs) { this.durationMs = durationMs; }
    }
}
