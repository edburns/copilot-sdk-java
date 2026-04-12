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

/** The {@code session.compaction_complete} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionCompactionCompleteEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionCompactionCompleteEventData data;

    public SessionCompactionCompleteEventData getData() { return data; }
    public void setData(SessionCompactionCompleteEventData data) { this.data = data; }

    /** Data payload for {@link SessionCompactionCompleteEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionCompactionCompleteEventData {

        /** Whether compaction completed successfully */
        @JsonProperty("success")
        private Boolean success;

        /** Error message if compaction failed */
        @JsonProperty("error")
        private String error;

        /** Total tokens in conversation before compaction */
        @JsonProperty("preCompactionTokens")
        private Double preCompactionTokens;

        /** Total tokens in conversation after compaction */
        @JsonProperty("postCompactionTokens")
        private Double postCompactionTokens;

        /** Number of messages before compaction */
        @JsonProperty("preCompactionMessagesLength")
        private Double preCompactionMessagesLength;

        /** Number of messages removed during compaction */
        @JsonProperty("messagesRemoved")
        private Double messagesRemoved;

        /** Number of tokens removed during compaction */
        @JsonProperty("tokensRemoved")
        private Double tokensRemoved;

        /** LLM-generated summary of the compacted conversation history */
        @JsonProperty("summaryContent")
        private String summaryContent;

        /** Checkpoint snapshot number created for recovery */
        @JsonProperty("checkpointNumber")
        private Double checkpointNumber;

        /** File path where the checkpoint was stored */
        @JsonProperty("checkpointPath")
        private String checkpointPath;

        /** Token usage breakdown for the compaction LLM call */
        @JsonProperty("compactionTokensUsed")
        private SessionCompactionCompleteEventDataCompactionTokensUsed compactionTokensUsed;

        /** GitHub request tracing ID (x-github-request-id header) for the compaction LLM call */
        @JsonProperty("requestId")
        private String requestId;

        /** Token count from system message(s) after compaction */
        @JsonProperty("systemTokens")
        private Double systemTokens;

        /** Token count from non-system messages (user, assistant, tool) after compaction */
        @JsonProperty("conversationTokens")
        private Double conversationTokens;

        /** Token count from tool definitions after compaction */
        @JsonProperty("toolDefinitionsTokens")
        private Double toolDefinitionsTokens;

        public Boolean getSuccess() { return success; }
        public void setSuccess(Boolean success) { this.success = success; }

        public String getError() { return error; }
        public void setError(String error) { this.error = error; }

        public Double getPreCompactionTokens() { return preCompactionTokens; }
        public void setPreCompactionTokens(Double preCompactionTokens) { this.preCompactionTokens = preCompactionTokens; }

        public Double getPostCompactionTokens() { return postCompactionTokens; }
        public void setPostCompactionTokens(Double postCompactionTokens) { this.postCompactionTokens = postCompactionTokens; }

        public Double getPreCompactionMessagesLength() { return preCompactionMessagesLength; }
        public void setPreCompactionMessagesLength(Double preCompactionMessagesLength) { this.preCompactionMessagesLength = preCompactionMessagesLength; }

        public Double getMessagesRemoved() { return messagesRemoved; }
        public void setMessagesRemoved(Double messagesRemoved) { this.messagesRemoved = messagesRemoved; }

        public Double getTokensRemoved() { return tokensRemoved; }
        public void setTokensRemoved(Double tokensRemoved) { this.tokensRemoved = tokensRemoved; }

        public String getSummaryContent() { return summaryContent; }
        public void setSummaryContent(String summaryContent) { this.summaryContent = summaryContent; }

        public Double getCheckpointNumber() { return checkpointNumber; }
        public void setCheckpointNumber(Double checkpointNumber) { this.checkpointNumber = checkpointNumber; }

        public String getCheckpointPath() { return checkpointPath; }
        public void setCheckpointPath(String checkpointPath) { this.checkpointPath = checkpointPath; }

        public SessionCompactionCompleteEventDataCompactionTokensUsed getCompactionTokensUsed() { return compactionTokensUsed; }
        public void setCompactionTokensUsed(SessionCompactionCompleteEventDataCompactionTokensUsed compactionTokensUsed) { this.compactionTokensUsed = compactionTokensUsed; }

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public Double getSystemTokens() { return systemTokens; }
        public void setSystemTokens(Double systemTokens) { this.systemTokens = systemTokens; }

        public Double getConversationTokens() { return conversationTokens; }
        public void setConversationTokens(Double conversationTokens) { this.conversationTokens = conversationTokens; }

        public Double getToolDefinitionsTokens() { return toolDefinitionsTokens; }
        public void setToolDefinitionsTokens(Double toolDefinitionsTokens) { this.toolDefinitionsTokens = toolDefinitionsTokens; }


        /** Token usage breakdown for the compaction LLM call */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionCompactionCompleteEventDataCompactionTokensUsed {

            /** Input tokens consumed by the compaction LLM call */
            @JsonProperty("input")
            private Double input;

            /** Output tokens produced by the compaction LLM call */
            @JsonProperty("output")
            private Double output;

            /** Cached input tokens reused in the compaction LLM call */
            @JsonProperty("cachedInput")
            private Double cachedInput;

            public Double getInput() { return input; }
            public void setInput(Double input) { this.input = input; }

            public Double getOutput() { return output; }
            public void setOutput(Double output) { this.output = output; }

            public Double getCachedInput() { return cachedInput; }
            public void setCachedInput(Double cachedInput) { this.cachedInput = cachedInput; }
        }
    }
}
