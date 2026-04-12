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

/** The {@code tool.execution_progress} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ToolExecutionProgressEvent extends SessionEvent {

    @JsonProperty("data")
    private ToolExecutionProgressEventData data;

    public ToolExecutionProgressEventData getData() { return data; }
    public void setData(ToolExecutionProgressEventData data) { this.data = data; }

    /** Data payload for {@link ToolExecutionProgressEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ToolExecutionProgressEventData {

        /** Tool call ID this progress notification belongs to */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** Human-readable progress status message (e.g., from an MCP server) */
        @JsonProperty("progressMessage")
        private String progressMessage;

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

        public String getProgressMessage() { return progressMessage; }
        public void setProgressMessage(String progressMessage) { this.progressMessage = progressMessage; }
    }
}
