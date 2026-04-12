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

/** The {@code assistant.reasoning_delta} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class AssistantReasoningDeltaEvent extends SessionEvent {

    @JsonProperty("data")
    private AssistantReasoningDeltaEventData data;

    public AssistantReasoningDeltaEventData getData() { return data; }
    public void setData(AssistantReasoningDeltaEventData data) { this.data = data; }

    /** Data payload for {@link AssistantReasoningDeltaEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AssistantReasoningDeltaEventData {

        /** Reasoning block ID this delta belongs to, matching the corresponding assistant.reasoning event */
        @JsonProperty("reasoningId")
        private String reasoningId;

        /** Incremental text chunk to append to the reasoning content */
        @JsonProperty("deltaContent")
        private String deltaContent;

        public String getReasoningId() { return reasoningId; }
        public void setReasoningId(String reasoningId) { this.reasoningId = reasoningId; }

        public String getDeltaContent() { return deltaContent; }
        public void setDeltaContent(String deltaContent) { this.deltaContent = deltaContent; }
    }
}
