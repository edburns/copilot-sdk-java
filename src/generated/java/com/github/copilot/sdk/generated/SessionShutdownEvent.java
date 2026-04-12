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
import java.util.Map;
import javax.annotation.processing.Generated;

/** The {@code session.shutdown} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionShutdownEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionShutdownEventData data;

    public SessionShutdownEventData getData() { return data; }
    public void setData(SessionShutdownEventData data) { this.data = data; }

    /** Data payload for {@link SessionShutdownEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionShutdownEventData {

        /** Whether the session ended normally ("routine") or due to a crash/fatal error ("error") */
        @JsonProperty("shutdownType")
        private SessionShutdownEventDataShutdownType shutdownType;

        /** Error description when shutdownType is "error" */
        @JsonProperty("errorReason")
        private String errorReason;

        /** Total number of premium API requests used during the session */
        @JsonProperty("totalPremiumRequests")
        private Double totalPremiumRequests;

        /** Cumulative time spent in API calls during the session, in milliseconds */
        @JsonProperty("totalApiDurationMs")
        private Double totalApiDurationMs;

        /** Unix timestamp (milliseconds) when the session started */
        @JsonProperty("sessionStartTime")
        private Double sessionStartTime;

        /** Aggregate code change metrics for the session */
        @JsonProperty("codeChanges")
        private SessionShutdownEventDataCodeChanges codeChanges;

        /** Per-model usage breakdown, keyed by model identifier */
        @JsonProperty("modelMetrics")
        private Map<String, SessionShutdownEventDataModelMetricsValue> modelMetrics;

        /** Model that was selected at the time of shutdown */
        @JsonProperty("currentModel")
        private String currentModel;

        /** Total tokens in context window at shutdown */
        @JsonProperty("currentTokens")
        private Double currentTokens;

        /** System message token count at shutdown */
        @JsonProperty("systemTokens")
        private Double systemTokens;

        /** Non-system message token count at shutdown */
        @JsonProperty("conversationTokens")
        private Double conversationTokens;

        /** Tool definitions token count at shutdown */
        @JsonProperty("toolDefinitionsTokens")
        private Double toolDefinitionsTokens;

        public SessionShutdownEventDataShutdownType getShutdownType() { return shutdownType; }
        public void setShutdownType(SessionShutdownEventDataShutdownType shutdownType) { this.shutdownType = shutdownType; }

        public String getErrorReason() { return errorReason; }
        public void setErrorReason(String errorReason) { this.errorReason = errorReason; }

        public Double getTotalPremiumRequests() { return totalPremiumRequests; }
        public void setTotalPremiumRequests(Double totalPremiumRequests) { this.totalPremiumRequests = totalPremiumRequests; }

        public Double getTotalApiDurationMs() { return totalApiDurationMs; }
        public void setTotalApiDurationMs(Double totalApiDurationMs) { this.totalApiDurationMs = totalApiDurationMs; }

        public Double getSessionStartTime() { return sessionStartTime; }
        public void setSessionStartTime(Double sessionStartTime) { this.sessionStartTime = sessionStartTime; }

        public SessionShutdownEventDataCodeChanges getCodeChanges() { return codeChanges; }
        public void setCodeChanges(SessionShutdownEventDataCodeChanges codeChanges) { this.codeChanges = codeChanges; }

        public Map<String, SessionShutdownEventDataModelMetricsValue> getModelMetrics() { return modelMetrics; }
        public void setModelMetrics(Map<String, SessionShutdownEventDataModelMetricsValue> modelMetrics) { this.modelMetrics = modelMetrics; }

        public String getCurrentModel() { return currentModel; }
        public void setCurrentModel(String currentModel) { this.currentModel = currentModel; }

        public Double getCurrentTokens() { return currentTokens; }
        public void setCurrentTokens(Double currentTokens) { this.currentTokens = currentTokens; }

        public Double getSystemTokens() { return systemTokens; }
        public void setSystemTokens(Double systemTokens) { this.systemTokens = systemTokens; }

        public Double getConversationTokens() { return conversationTokens; }
        public void setConversationTokens(Double conversationTokens) { this.conversationTokens = conversationTokens; }

        public Double getToolDefinitionsTokens() { return toolDefinitionsTokens; }
        public void setToolDefinitionsTokens(Double toolDefinitionsTokens) { this.toolDefinitionsTokens = toolDefinitionsTokens; }


        /** Whether the session ended normally ("routine") or due to a crash/fatal error ("error") */
        public enum SessionShutdownEventDataShutdownType {
            /** The {@code routine} variant. */
            ROUTINE("routine"),
            /** The {@code error} variant. */
            ERROR("error");

            private final String value;
            SessionShutdownEventDataShutdownType(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }

        /** Aggregate code change metrics for the session */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionShutdownEventDataCodeChanges {

            /** Total number of lines added during the session */
            @JsonProperty("linesAdded")
            private Double linesAdded;

            /** Total number of lines removed during the session */
            @JsonProperty("linesRemoved")
            private Double linesRemoved;

            /** List of file paths that were modified during the session */
            @JsonProperty("filesModified")
            private List<String> filesModified;

            public Double getLinesAdded() { return linesAdded; }
            public void setLinesAdded(Double linesAdded) { this.linesAdded = linesAdded; }

            public Double getLinesRemoved() { return linesRemoved; }
            public void setLinesRemoved(Double linesRemoved) { this.linesRemoved = linesRemoved; }

            public List<String> getFilesModified() { return filesModified; }
            public void setFilesModified(List<String> filesModified) { this.filesModified = filesModified; }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionShutdownEventDataModelMetricsValue {

            /** Request count and cost metrics */
            @JsonProperty("requests")
            private SessionShutdownEventDataModelMetricsValueRequests requests;

            /** Token usage breakdown */
            @JsonProperty("usage")
            private SessionShutdownEventDataModelMetricsValueUsage usage;

            public SessionShutdownEventDataModelMetricsValueRequests getRequests() { return requests; }
            public void setRequests(SessionShutdownEventDataModelMetricsValueRequests requests) { this.requests = requests; }

            public SessionShutdownEventDataModelMetricsValueUsage getUsage() { return usage; }
            public void setUsage(SessionShutdownEventDataModelMetricsValueUsage usage) { this.usage = usage; }


            /** Request count and cost metrics */
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonInclude(JsonInclude.Include.NON_NULL)
            public static class SessionShutdownEventDataModelMetricsValueRequests {

                /** Total number of API requests made to this model */
                @JsonProperty("count")
                private Double count;

                /** Cumulative cost multiplier for requests to this model */
                @JsonProperty("cost")
                private Double cost;

                public Double getCount() { return count; }
                public void setCount(Double count) { this.count = count; }

                public Double getCost() { return cost; }
                public void setCost(Double cost) { this.cost = cost; }
            }

            /** Token usage breakdown */
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonInclude(JsonInclude.Include.NON_NULL)
            public static class SessionShutdownEventDataModelMetricsValueUsage {

                /** Total input tokens consumed across all requests to this model */
                @JsonProperty("inputTokens")
                private Double inputTokens;

                /** Total output tokens produced across all requests to this model */
                @JsonProperty("outputTokens")
                private Double outputTokens;

                /** Total tokens read from prompt cache across all requests */
                @JsonProperty("cacheReadTokens")
                private Double cacheReadTokens;

                /** Total tokens written to prompt cache across all requests */
                @JsonProperty("cacheWriteTokens")
                private Double cacheWriteTokens;

                /** Total reasoning tokens produced across all requests to this model */
                @JsonProperty("reasoningTokens")
                private Double reasoningTokens;

                public Double getInputTokens() { return inputTokens; }
                public void setInputTokens(Double inputTokens) { this.inputTokens = inputTokens; }

                public Double getOutputTokens() { return outputTokens; }
                public void setOutputTokens(Double outputTokens) { this.outputTokens = outputTokens; }

                public Double getCacheReadTokens() { return cacheReadTokens; }
                public void setCacheReadTokens(Double cacheReadTokens) { this.cacheReadTokens = cacheReadTokens; }

                public Double getCacheWriteTokens() { return cacheWriteTokens; }
                public void setCacheWriteTokens(Double cacheWriteTokens) { this.cacheWriteTokens = cacheWriteTokens; }

                public Double getReasoningTokens() { return reasoningTokens; }
                public void setReasoningTokens(Double reasoningTokens) { this.reasoningTokens = reasoningTokens; }
            }
        }
    }
}
