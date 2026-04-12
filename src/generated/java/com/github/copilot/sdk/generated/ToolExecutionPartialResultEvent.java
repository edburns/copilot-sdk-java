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

/** The {@code tool.execution_partial_result} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ToolExecutionPartialResultEvent extends SessionEvent {

    @JsonProperty("data")
    private ToolExecutionPartialResultEventData data;

    public ToolExecutionPartialResultEventData getData() { return data; }
    public void setData(ToolExecutionPartialResultEventData data) { this.data = data; }

    /** Data payload for {@link ToolExecutionPartialResultEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ToolExecutionPartialResultEventData {

        /** Tool call ID this partial result belongs to */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** Incremental output chunk from the running tool */
        @JsonProperty("partialOutput")
        private String partialOutput;

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

        public String getPartialOutput() { return partialOutput; }
        public void setPartialOutput(String partialOutput) { this.partialOutput = partialOutput; }
    }
}
