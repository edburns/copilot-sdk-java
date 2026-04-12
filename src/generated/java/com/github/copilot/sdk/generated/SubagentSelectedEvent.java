/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.sdk.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;

/** The {@code subagent.selected} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SubagentSelectedEvent extends SessionEvent {

    @JsonProperty("data")
    private SubagentSelectedEventData data;

    public SubagentSelectedEventData getData() { return data; }
    public void setData(SubagentSelectedEventData data) { this.data = data; }

    /** Data payload for {@link SubagentSelectedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SubagentSelectedEventData {

        /** Internal name of the selected custom agent */
        @JsonProperty("agentName")
        private String agentName;

        /** Human-readable display name of the selected custom agent */
        @JsonProperty("agentDisplayName")
        private String agentDisplayName;

        /** List of tool names available to this agent, or null for all tools */
        @JsonProperty("tools")
        private List<String> tools;

        public String getAgentName() { return agentName; }
        public void setAgentName(String agentName) { this.agentName = agentName; }

        public String getAgentDisplayName() { return agentDisplayName; }
        public void setAgentDisplayName(String agentDisplayName) { this.agentDisplayName = agentDisplayName; }

        public List<String> getTools() { return tools; }
        public void setTools(List<String> tools) { this.tools = tools; }
    }
}
