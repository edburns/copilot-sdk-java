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

/** The {@code user_input.requested} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class UserInputRequestedEvent extends SessionEvent {

    @JsonProperty("data")
    private UserInputRequestedEventData data;

    public UserInputRequestedEventData getData() { return data; }
    public void setData(UserInputRequestedEventData data) { this.data = data; }

    /** Data payload for {@link UserInputRequestedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UserInputRequestedEventData {

        /** Unique identifier for this input request; used to respond via session.respondToUserInput() */
        @JsonProperty("requestId")
        private String requestId;

        /** The question or prompt to present to the user */
        @JsonProperty("question")
        private String question;

        /** Predefined choices for the user to select from, if applicable */
        @JsonProperty("choices")
        private List<String> choices;

        /** Whether the user can provide a free-form text response in addition to predefined choices */
        @JsonProperty("allowFreeform")
        private Boolean allowFreeform;

        /** The LLM-assigned tool call ID that triggered this request; used by remote UIs to correlate responses */
        @JsonProperty("toolCallId")
        private String toolCallId;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public String getQuestion() { return question; }
        public void setQuestion(String question) { this.question = question; }

        public List<String> getChoices() { return choices; }
        public void setChoices(List<String> choices) { this.choices = choices; }

        public Boolean getAllowFreeform() { return allowFreeform; }
        public void setAllowFreeform(Boolean allowFreeform) { this.allowFreeform = allowFreeform; }

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }
    }
}
