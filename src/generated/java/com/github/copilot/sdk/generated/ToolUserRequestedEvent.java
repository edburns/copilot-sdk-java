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

/** The {@code tool.user_requested} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ToolUserRequestedEvent extends SessionEvent {

    @JsonProperty("data")
    private ToolUserRequestedEventData data;

    public ToolUserRequestedEventData getData() { return data; }
    public void setData(ToolUserRequestedEventData data) { this.data = data; }

    /** Data payload for {@link ToolUserRequestedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ToolUserRequestedEventData {

        /** Unique identifier for this tool call */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** Name of the tool the user wants to invoke */
        @JsonProperty("toolName")
        private String toolName;

        /** Arguments for the tool invocation */
        @JsonProperty("arguments")
        private Object arguments;

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

        public String getToolName() { return toolName; }
        public void setToolName(String toolName) { this.toolName = toolName; }

        public Object getArguments() { return arguments; }
        public void setArguments(Object arguments) { this.arguments = arguments; }
    }
}
