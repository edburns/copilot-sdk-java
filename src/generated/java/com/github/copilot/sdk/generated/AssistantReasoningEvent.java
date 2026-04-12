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

/** The {@code assistant.reasoning} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class AssistantReasoningEvent extends SessionEvent {

    @JsonProperty("data")
    private AssistantReasoningEventData data;

    public AssistantReasoningEventData getData() { return data; }
    public void setData(AssistantReasoningEventData data) { this.data = data; }

    /** Data payload for {@link AssistantReasoningEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AssistantReasoningEventData {

        /** Unique identifier for this reasoning block */
        @JsonProperty("reasoningId")
        private String reasoningId;

        /** The complete extended thinking text from the model */
        @JsonProperty("content")
        private String content;

        public String getReasoningId() { return reasoningId; }
        public void setReasoningId(String reasoningId) { this.reasoningId = reasoningId; }

        public String getContent() { return content; }
        public void setContent(String content) { this.content = content; }
    }
}
