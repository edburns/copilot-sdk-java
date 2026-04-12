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

/** The {@code session.usage_info} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionUsageInfoEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionUsageInfoEventData data;

    public SessionUsageInfoEventData getData() { return data; }
    public void setData(SessionUsageInfoEventData data) { this.data = data; }

    /** Data payload for {@link SessionUsageInfoEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionUsageInfoEventData {

        /** Maximum token count for the model's context window */
        @JsonProperty("tokenLimit")
        private Double tokenLimit;

        /** Current number of tokens in the context window */
        @JsonProperty("currentTokens")
        private Double currentTokens;

        /** Current number of messages in the conversation */
        @JsonProperty("messagesLength")
        private Double messagesLength;

        /** Token count from system message(s) */
        @JsonProperty("systemTokens")
        private Double systemTokens;

        /** Token count from non-system messages (user, assistant, tool) */
        @JsonProperty("conversationTokens")
        private Double conversationTokens;

        /** Token count from tool definitions */
        @JsonProperty("toolDefinitionsTokens")
        private Double toolDefinitionsTokens;

        /** Whether this is the first usage_info event emitted in this session */
        @JsonProperty("isInitial")
        private Boolean isInitial;

        public Double getTokenLimit() { return tokenLimit; }
        public void setTokenLimit(Double tokenLimit) { this.tokenLimit = tokenLimit; }

        public Double getCurrentTokens() { return currentTokens; }
        public void setCurrentTokens(Double currentTokens) { this.currentTokens = currentTokens; }

        public Double getMessagesLength() { return messagesLength; }
        public void setMessagesLength(Double messagesLength) { this.messagesLength = messagesLength; }

        public Double getSystemTokens() { return systemTokens; }
        public void setSystemTokens(Double systemTokens) { this.systemTokens = systemTokens; }

        public Double getConversationTokens() { return conversationTokens; }
        public void setConversationTokens(Double conversationTokens) { this.conversationTokens = conversationTokens; }

        public Double getToolDefinitionsTokens() { return toolDefinitionsTokens; }
        public void setToolDefinitionsTokens(Double toolDefinitionsTokens) { this.toolDefinitionsTokens = toolDefinitionsTokens; }

        public Boolean getIsInitial() { return isInitial; }
        public void setIsInitial(Boolean isInitial) { this.isInitial = isInitial; }
    }
}
