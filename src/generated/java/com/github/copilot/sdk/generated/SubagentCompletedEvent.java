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

/** The {@code subagent.completed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SubagentCompletedEvent extends SessionEvent {

    @JsonProperty("data")
    private SubagentCompletedEventData data;

    public SubagentCompletedEventData getData() { return data; }
    public void setData(SubagentCompletedEventData data) { this.data = data; }

    /** Data payload for {@link SubagentCompletedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SubagentCompletedEventData {

        /** Tool call ID of the parent tool invocation that spawned this sub-agent */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** Internal name of the sub-agent */
        @JsonProperty("agentName")
        private String agentName;

        /** Human-readable display name of the sub-agent */
        @JsonProperty("agentDisplayName")
        private String agentDisplayName;

        /** Model used by the sub-agent */
        @JsonProperty("model")
        private String model;

        /** Total number of tool calls made by the sub-agent */
        @JsonProperty("totalToolCalls")
        private Double totalToolCalls;

        /** Total tokens (input + output) consumed by the sub-agent */
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
