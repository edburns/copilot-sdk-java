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

/** The {@code subagent.started} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SubagentStartedEvent extends SessionEvent {

    @JsonProperty("data")
    private SubagentStartedEventData data;

    public SubagentStartedEventData getData() { return data; }
    public void setData(SubagentStartedEventData data) { this.data = data; }

    /** Data payload for {@link SubagentStartedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SubagentStartedEventData {

        /** Tool call ID of the parent tool invocation that spawned this sub-agent */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** Internal name of the sub-agent */
        @JsonProperty("agentName")
        private String agentName;

        /** Human-readable display name of the sub-agent */
        @JsonProperty("agentDisplayName")
        private String agentDisplayName;

        /** Description of what the sub-agent does */
        @JsonProperty("agentDescription")
        private String agentDescription;

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

        public String getAgentName() { return agentName; }
        public void setAgentName(String agentName) { this.agentName = agentName; }

        public String getAgentDisplayName() { return agentDisplayName; }
        public void setAgentDisplayName(String agentDisplayName) { this.agentDisplayName = agentDisplayName; }

        public String getAgentDescription() { return agentDescription; }
        public void setAgentDescription(String agentDescription) { this.agentDescription = agentDescription; }
    }
}
