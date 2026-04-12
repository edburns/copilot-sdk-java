/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: api.schema.json

package com.github.copilot.sdk.generated.rpc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;

/** Result for the {@code session.history.compact} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionHistoryCompactResult {

    /** Whether compaction completed successfully */
    @JsonProperty("success")
    private Boolean success;

    /** Number of tokens freed by compaction */
    @JsonProperty("tokensRemoved")
    private Double tokensRemoved;

    /** Number of messages removed during compaction */
    @JsonProperty("messagesRemoved")
    private Double messagesRemoved;

    /** Post-compaction context window usage breakdown */
    @JsonProperty("contextWindow")
    private SessionHistoryCompactResultContextWindow contextWindow;

    public Boolean getSuccess() { return success; }
    public void setSuccess(Boolean success) { this.success = success; }

    public Double getTokensRemoved() { return tokensRemoved; }
    public void setTokensRemoved(Double tokensRemoved) { this.tokensRemoved = tokensRemoved; }

    public Double getMessagesRemoved() { return messagesRemoved; }
    public void setMessagesRemoved(Double messagesRemoved) { this.messagesRemoved = messagesRemoved; }

    public SessionHistoryCompactResultContextWindow getContextWindow() { return contextWindow; }
    public void setContextWindow(SessionHistoryCompactResultContextWindow contextWindow) { this.contextWindow = contextWindow; }


    /** Post-compaction context window usage breakdown */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionHistoryCompactResultContextWindow {

        /** Maximum token count for the model's context window */
        @JsonProperty("tokenLimit")
        private Double tokenLimit;

        /** Current total tokens in the context window (system + conversation + tool definitions) */
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
    }
}
