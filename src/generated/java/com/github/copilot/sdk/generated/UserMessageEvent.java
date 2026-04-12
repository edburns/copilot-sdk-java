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

/** The {@code user.message} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class UserMessageEvent extends SessionEvent {

    @JsonProperty("data")
    private UserMessageEventData data;

    public UserMessageEventData getData() { return data; }
    public void setData(UserMessageEventData data) { this.data = data; }

    /** Data payload for {@link UserMessageEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UserMessageEventData {

        /** The user's message text as displayed in the timeline */
        @JsonProperty("content")
        private String content;

        /** Transformed version of the message sent to the model, with XML wrapping, timestamps, and other augmentations for prompt caching */
        @JsonProperty("transformedContent")
        private String transformedContent;

        /** Files, selections, or GitHub references attached to the message */
        @JsonProperty("attachments")
        private List<Object> attachments;

        /** Origin of this message, used for timeline filtering (e.g., "skill-pdf" for skill-injected messages that should be hidden from the user) */
        @JsonProperty("source")
        private String source;

        /** The agent mode that was active when this message was sent */
        @JsonProperty("agentMode")
        private UserMessageEventDataAgentMode agentMode;

        /** CAPI interaction ID for correlating this user message with its turn */
        @JsonProperty("interactionId")
        private String interactionId;

        public String getContent() { return content; }
        public void setContent(String content) { this.content = content; }

        public String getTransformedContent() { return transformedContent; }
        public void setTransformedContent(String transformedContent) { this.transformedContent = transformedContent; }

        public List<Object> getAttachments() { return attachments; }
        public void setAttachments(List<Object> attachments) { this.attachments = attachments; }

        public String getSource() { return source; }
        public void setSource(String source) { this.source = source; }

        public UserMessageEventDataAgentMode getAgentMode() { return agentMode; }
        public void setAgentMode(UserMessageEventDataAgentMode agentMode) { this.agentMode = agentMode; }

        public String getInteractionId() { return interactionId; }
        public void setInteractionId(String interactionId) { this.interactionId = interactionId; }


        /** The agent mode that was active when this message was sent */
        public enum UserMessageEventDataAgentMode {
            /** The {@code interactive} variant. */
            INTERACTIVE("interactive"),
            /** The {@code plan} variant. */
            PLAN("plan"),
            /** The {@code autopilot} variant. */
            AUTOPILOT("autopilot"),
            /** The {@code shell} variant. */
            SHELL("shell");

            private final String value;
            UserMessageEventDataAgentMode(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }
    }
}
