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

/** The {@code assistant.message_delta} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class AssistantMessageDeltaEvent extends SessionEvent {

    @JsonProperty("data")
    private AssistantMessageDeltaEventData data;

    public AssistantMessageDeltaEventData getData() { return data; }
    public void setData(AssistantMessageDeltaEventData data) { this.data = data; }

    /** Data payload for {@link AssistantMessageDeltaEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AssistantMessageDeltaEventData {

        /** Message ID this delta belongs to, matching the corresponding assistant.message event */
        @JsonProperty("messageId")
        private String messageId;

        /** Incremental text chunk to append to the message content */
        @JsonProperty("deltaContent")
        private String deltaContent;

        /** Tool call ID of the parent tool invocation when this event originates from a sub-agent */
        @JsonProperty("parentToolCallId")
        private String parentToolCallId;

        public String getMessageId() { return messageId; }
        public void setMessageId(String messageId) { this.messageId = messageId; }

        public String getDeltaContent() { return deltaContent; }
        public void setDeltaContent(String deltaContent) { this.deltaContent = deltaContent; }

        public String getParentToolCallId() { return parentToolCallId; }
        public void setParentToolCallId(String parentToolCallId) { this.parentToolCallId = parentToolCallId; }
    }
}
