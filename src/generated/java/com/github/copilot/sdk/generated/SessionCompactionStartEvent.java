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

/** The {@code session.compaction_start} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionCompactionStartEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionCompactionStartEventData data;

    public SessionCompactionStartEventData getData() { return data; }
    public void setData(SessionCompactionStartEventData data) { this.data = data; }

    /** Data payload for {@link SessionCompactionStartEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionCompactionStartEventData {

        /** Token count from system message(s) at compaction start */
        @JsonProperty("systemTokens")
        private Double systemTokens;

        /** Token count from non-system messages (user, assistant, tool) at compaction start */
        @JsonProperty("conversationTokens")
        private Double conversationTokens;

        /** Token count from tool definitions at compaction start */
        @JsonProperty("toolDefinitionsTokens")
        private Double toolDefinitionsTokens;

        public Double getSystemTokens() { return systemTokens; }
        public void setSystemTokens(Double systemTokens) { this.systemTokens = systemTokens; }

        public Double getConversationTokens() { return conversationTokens; }
        public void setConversationTokens(Double conversationTokens) { this.conversationTokens = conversationTokens; }

        public Double getToolDefinitionsTokens() { return toolDefinitionsTokens; }
        public void setToolDefinitionsTokens(Double toolDefinitionsTokens) { this.toolDefinitionsTokens = toolDefinitionsTokens; }
    }
}
