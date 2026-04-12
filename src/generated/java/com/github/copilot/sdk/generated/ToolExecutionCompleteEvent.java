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
import java.util.Map;
import javax.annotation.processing.Generated;

/** The {@code tool.execution_complete} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ToolExecutionCompleteEvent extends SessionEvent {

    @JsonProperty("data")
    private ToolExecutionCompleteEventData data;

    public ToolExecutionCompleteEventData getData() { return data; }
    public void setData(ToolExecutionCompleteEventData data) { this.data = data; }

    /** Data payload for {@link ToolExecutionCompleteEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ToolExecutionCompleteEventData {

        /** Unique identifier for the completed tool call */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** Whether the tool execution completed successfully */
        @JsonProperty("success")
        private Boolean success;

        /** Model identifier that generated this tool call */
        @JsonProperty("model")
        private String model;

        /** CAPI interaction ID for correlating this tool execution with upstream telemetry */
        @JsonProperty("interactionId")
        private String interactionId;

        /** Whether this tool call was explicitly requested by the user rather than the assistant */
        @JsonProperty("isUserRequested")
        private Boolean isUserRequested;

        /** Tool execution result on success */
        @JsonProperty("result")
        private ToolExecutionCompleteEventDataResult result;

        /** Error details when the tool execution failed */
        @JsonProperty("error")
        private ToolExecutionCompleteEventDataError error;

        /** Tool-specific telemetry data (e.g., CodeQL check counts, grep match counts) */
        @JsonProperty("toolTelemetry")
        private Map<String, Object> toolTelemetry;

        /** Tool call ID of the parent tool invocation when this event originates from a sub-agent */
        @JsonProperty("parentToolCallId")
        private String parentToolCallId;

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

        public Boolean getSuccess() { return success; }
        public void setSuccess(Boolean success) { this.success = success; }

        public String getModel() { return model; }
        public void setModel(String model) { this.model = model; }

        public String getInteractionId() { return interactionId; }
        public void setInteractionId(String interactionId) { this.interactionId = interactionId; }

        public Boolean getIsUserRequested() { return isUserRequested; }
        public void setIsUserRequested(Boolean isUserRequested) { this.isUserRequested = isUserRequested; }

        public ToolExecutionCompleteEventDataResult getResult() { return result; }
        public void setResult(ToolExecutionCompleteEventDataResult result) { this.result = result; }

        public ToolExecutionCompleteEventDataError getError() { return error; }
        public void setError(ToolExecutionCompleteEventDataError error) { this.error = error; }

        public Map<String, Object> getToolTelemetry() { return toolTelemetry; }
        public void setToolTelemetry(Map<String, Object> toolTelemetry) { this.toolTelemetry = toolTelemetry; }

        public String getParentToolCallId() { return parentToolCallId; }
        public void setParentToolCallId(String parentToolCallId) { this.parentToolCallId = parentToolCallId; }


        /** Tool execution result on success */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class ToolExecutionCompleteEventDataResult {

            /** Concise tool result text sent to the LLM for chat completion, potentially truncated for token efficiency */
            @JsonProperty("content")
            private String content;

            /** Full detailed tool result for UI/timeline display, preserving complete content such as diffs. Falls back to content when absent. */
            @JsonProperty("detailedContent")
            private String detailedContent;

            /** Structured content blocks (text, images, audio, resources) returned by the tool in their native format */
            @JsonProperty("contents")
            private List<Object> contents;

            public String getContent() { return content; }
            public void setContent(String content) { this.content = content; }

            public String getDetailedContent() { return detailedContent; }
            public void setDetailedContent(String detailedContent) { this.detailedContent = detailedContent; }

            public List<Object> getContents() { return contents; }
            public void setContents(List<Object> contents) { this.contents = contents; }
        }

        /** Error details when the tool execution failed */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class ToolExecutionCompleteEventDataError {

            /** Human-readable error message */
            @JsonProperty("message")
            private String message;

            /** Machine-readable error code */
            @JsonProperty("code")
            private String code;

            public String getMessage() { return message; }
            public void setMessage(String message) { this.message = message; }

            public String getCode() { return code; }
            public void setCode(String code) { this.code = code; }
        }
    }
}
