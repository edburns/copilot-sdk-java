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

/** The {@code assistant.message} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class AssistantMessageEvent extends SessionEvent {

    @JsonProperty("data")
    private AssistantMessageEventData data;

    public AssistantMessageEventData getData() { return data; }
    public void setData(AssistantMessageEventData data) { this.data = data; }

    /** Data payload for {@link AssistantMessageEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AssistantMessageEventData {

        /** Unique identifier for this assistant message */
        @JsonProperty("messageId")
        private String messageId;

        /** The assistant's text response content */
        @JsonProperty("content")
        private String content;

        /** Tool invocations requested by the assistant in this message */
        @JsonProperty("toolRequests")
        private List<AssistantMessageEventDataToolRequestsItem> toolRequests;

        /** Opaque/encrypted extended thinking data from Anthropic models. Session-bound and stripped on resume. */
        @JsonProperty("reasoningOpaque")
        private String reasoningOpaque;

        /** Readable reasoning text from the model's extended thinking */
        @JsonProperty("reasoningText")
        private String reasoningText;

        /** Encrypted reasoning content from OpenAI models. Session-bound and stripped on resume. */
        @JsonProperty("encryptedContent")
        private String encryptedContent;

        /** Generation phase for phased-output models (e.g., thinking vs. response phases) */
        @JsonProperty("phase")
        private String phase;

        /** Actual output token count from the API response (completion_tokens), used for accurate token accounting */
        @JsonProperty("outputTokens")
        private Double outputTokens;

        /** CAPI interaction ID for correlating this message with upstream telemetry */
        @JsonProperty("interactionId")
        private String interactionId;

        /** GitHub request tracing ID (x-github-request-id header) for correlating with server-side logs */
        @JsonProperty("requestId")
        private String requestId;

        /** Tool call ID of the parent tool invocation when this event originates from a sub-agent */
        @JsonProperty("parentToolCallId")
        private String parentToolCallId;

        public String getMessageId() { return messageId; }
        public void setMessageId(String messageId) { this.messageId = messageId; }

        public String getContent() { return content; }
        public void setContent(String content) { this.content = content; }

        public List<AssistantMessageEventDataToolRequestsItem> getToolRequests() { return toolRequests; }
        public void setToolRequests(List<AssistantMessageEventDataToolRequestsItem> toolRequests) { this.toolRequests = toolRequests; }

        public String getReasoningOpaque() { return reasoningOpaque; }
        public void setReasoningOpaque(String reasoningOpaque) { this.reasoningOpaque = reasoningOpaque; }

        public String getReasoningText() { return reasoningText; }
        public void setReasoningText(String reasoningText) { this.reasoningText = reasoningText; }

        public String getEncryptedContent() { return encryptedContent; }
        public void setEncryptedContent(String encryptedContent) { this.encryptedContent = encryptedContent; }

        public String getPhase() { return phase; }
        public void setPhase(String phase) { this.phase = phase; }

        public Double getOutputTokens() { return outputTokens; }
        public void setOutputTokens(Double outputTokens) { this.outputTokens = outputTokens; }

        public String getInteractionId() { return interactionId; }
        public void setInteractionId(String interactionId) { this.interactionId = interactionId; }

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public String getParentToolCallId() { return parentToolCallId; }
        public void setParentToolCallId(String parentToolCallId) { this.parentToolCallId = parentToolCallId; }


        /** A tool invocation request from the assistant */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class AssistantMessageEventDataToolRequestsItem {

            /** Unique identifier for this tool call */
            @JsonProperty("toolCallId")
            private String toolCallId;

            /** Name of the tool being invoked */
            @JsonProperty("name")
            private String name;

            /** Arguments to pass to the tool, format depends on the tool */
            @JsonProperty("arguments")
            private Object arguments;

            /** Tool call type: "function" for standard tool calls, "custom" for grammar-based tool calls. Defaults to "function" when absent. */
            @JsonProperty("type")
            private AssistantMessageEventDataToolRequestsItemType type;

            /** Human-readable display title for the tool */
            @JsonProperty("toolTitle")
            private String toolTitle;

            /** Name of the MCP server hosting this tool, when the tool is an MCP tool */
            @JsonProperty("mcpServerName")
            private String mcpServerName;

            /** Resolved intention summary describing what this specific call does */
            @JsonProperty("intentionSummary")
            private String intentionSummary;

            public String getToolCallId() { return toolCallId; }
            public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public Object getArguments() { return arguments; }
            public void setArguments(Object arguments) { this.arguments = arguments; }

            public AssistantMessageEventDataToolRequestsItemType getType() { return type; }
            public void setType(AssistantMessageEventDataToolRequestsItemType type) { this.type = type; }

            public String getToolTitle() { return toolTitle; }
            public void setToolTitle(String toolTitle) { this.toolTitle = toolTitle; }

            public String getMcpServerName() { return mcpServerName; }
            public void setMcpServerName(String mcpServerName) { this.mcpServerName = mcpServerName; }

            public String getIntentionSummary() { return intentionSummary; }
            public void setIntentionSummary(String intentionSummary) { this.intentionSummary = intentionSummary; }


            /** Tool call type: "function" for standard tool calls, "custom" for grammar-based tool calls. Defaults to "function" when absent. */
            public enum AssistantMessageEventDataToolRequestsItemType {
                /** The {@code function} variant. */
                FUNCTION("function"),
                /** The {@code custom} variant. */
                CUSTOM("custom");

                private final String value;
                AssistantMessageEventDataToolRequestsItemType(String value) { this.value = value; }
                @com.fasterxml.jackson.annotation.JsonValue
                public String getValue() { return value; }
            }
        }
    }
}
