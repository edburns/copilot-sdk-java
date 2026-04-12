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

/** The {@code tool.execution_start} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ToolExecutionStartEvent extends SessionEvent {

    @JsonProperty("data")
    private ToolExecutionStartEventData data;

    public ToolExecutionStartEventData getData() { return data; }
    public void setData(ToolExecutionStartEventData data) { this.data = data; }

    /** Data payload for {@link ToolExecutionStartEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ToolExecutionStartEventData {

        /** Unique identifier for this tool call */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** Name of the tool being executed */
        @JsonProperty("toolName")
        private String toolName;

        /** Arguments passed to the tool */
        @JsonProperty("arguments")
        private Object arguments;

        /** Name of the MCP server hosting this tool, when the tool is an MCP tool */
        @JsonProperty("mcpServerName")
        private String mcpServerName;

        /** Original tool name on the MCP server, when the tool is an MCP tool */
        @JsonProperty("mcpToolName")
        private String mcpToolName;

        /** Tool call ID of the parent tool invocation when this event originates from a sub-agent */
        @JsonProperty("parentToolCallId")
        private String parentToolCallId;

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

        public String getToolName() { return toolName; }
        public void setToolName(String toolName) { this.toolName = toolName; }

        public Object getArguments() { return arguments; }
        public void setArguments(Object arguments) { this.arguments = arguments; }

        public String getMcpServerName() { return mcpServerName; }
        public void setMcpServerName(String mcpServerName) { this.mcpServerName = mcpServerName; }

        public String getMcpToolName() { return mcpToolName; }
        public void setMcpToolName(String mcpToolName) { this.mcpToolName = mcpToolName; }

        public String getParentToolCallId() { return parentToolCallId; }
        public void setParentToolCallId(String parentToolCallId) { this.parentToolCallId = parentToolCallId; }
    }
}
