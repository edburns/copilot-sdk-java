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

/** The {@code session.truncation} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionTruncationEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionTruncationEventData data;

    public SessionTruncationEventData getData() { return data; }
    public void setData(SessionTruncationEventData data) { this.data = data; }

    /** Data payload for {@link SessionTruncationEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionTruncationEventData {

        /** Maximum token count for the model's context window */
        @JsonProperty("tokenLimit")
        private Double tokenLimit;

        /** Total tokens in conversation messages before truncation */
        @JsonProperty("preTruncationTokensInMessages")
        private Double preTruncationTokensInMessages;

        /** Number of conversation messages before truncation */
        @JsonProperty("preTruncationMessagesLength")
        private Double preTruncationMessagesLength;

        /** Total tokens in conversation messages after truncation */
        @JsonProperty("postTruncationTokensInMessages")
        private Double postTruncationTokensInMessages;

        /** Number of conversation messages after truncation */
        @JsonProperty("postTruncationMessagesLength")
        private Double postTruncationMessagesLength;

        /** Number of tokens removed by truncation */
        @JsonProperty("tokensRemovedDuringTruncation")
        private Double tokensRemovedDuringTruncation;

        /** Number of messages removed by truncation */
        @JsonProperty("messagesRemovedDuringTruncation")
        private Double messagesRemovedDuringTruncation;

        /** Identifier of the component that performed truncation (e.g., "BasicTruncator") */
        @JsonProperty("performedBy")
        private String performedBy;

        public Double getTokenLimit() { return tokenLimit; }
        public void setTokenLimit(Double tokenLimit) { this.tokenLimit = tokenLimit; }

        public Double getPreTruncationTokensInMessages() { return preTruncationTokensInMessages; }
        public void setPreTruncationTokensInMessages(Double preTruncationTokensInMessages) { this.preTruncationTokensInMessages = preTruncationTokensInMessages; }

        public Double getPreTruncationMessagesLength() { return preTruncationMessagesLength; }
        public void setPreTruncationMessagesLength(Double preTruncationMessagesLength) { this.preTruncationMessagesLength = preTruncationMessagesLength; }

        public Double getPostTruncationTokensInMessages() { return postTruncationTokensInMessages; }
        public void setPostTruncationTokensInMessages(Double postTruncationTokensInMessages) { this.postTruncationTokensInMessages = postTruncationTokensInMessages; }

        public Double getPostTruncationMessagesLength() { return postTruncationMessagesLength; }
        public void setPostTruncationMessagesLength(Double postTruncationMessagesLength) { this.postTruncationMessagesLength = postTruncationMessagesLength; }

        public Double getTokensRemovedDuringTruncation() { return tokensRemovedDuringTruncation; }
        public void setTokensRemovedDuringTruncation(Double tokensRemovedDuringTruncation) { this.tokensRemovedDuringTruncation = tokensRemovedDuringTruncation; }

        public Double getMessagesRemovedDuringTruncation() { return messagesRemovedDuringTruncation; }
        public void setMessagesRemovedDuringTruncation(Double messagesRemovedDuringTruncation) { this.messagesRemovedDuringTruncation = messagesRemovedDuringTruncation; }

        public String getPerformedBy() { return performedBy; }
        public void setPerformedBy(String performedBy) { this.performedBy = performedBy; }
    }
}
