/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.sdk.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.processing.Generated;

/** The {@code elicitation.completed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ElicitationCompletedEvent extends SessionEvent {

    @JsonProperty("data")
    private ElicitationCompletedEventData data;

    public ElicitationCompletedEventData getData() { return data; }
    public void setData(ElicitationCompletedEventData data) { this.data = data; }

    /** Data payload for {@link ElicitationCompletedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ElicitationCompletedEventData {

        /** Request ID of the resolved elicitation request; clients should dismiss any UI for this request */
        @JsonProperty("requestId")
        private String requestId;

        /** The user action: "accept" (submitted form), "decline" (explicitly refused), or "cancel" (dismissed) */
        @JsonProperty("action")
        private ElicitationCompletedEventDataAction action;

        /** The submitted form data when action is 'accept'; keys match the requested schema fields */
        @JsonProperty("content")
        private Map<String, Object> content;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public ElicitationCompletedEventDataAction getAction() { return action; }
        public void setAction(ElicitationCompletedEventDataAction action) { this.action = action; }

        public Map<String, Object> getContent() { return content; }
        public void setContent(Map<String, Object> content) { this.content = content; }


        /** The user action: "accept" (submitted form), "decline" (explicitly refused), or "cancel" (dismissed) */
        public enum ElicitationCompletedEventDataAction {
            /** The {@code accept} variant. */
            ACCEPT("accept"),
            /** The {@code decline} variant. */
            DECLINE("decline"),
            /** The {@code cancel} variant. */
            CANCEL("cancel");

            private final String value;
            ElicitationCompletedEventDataAction(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }
    }
}
