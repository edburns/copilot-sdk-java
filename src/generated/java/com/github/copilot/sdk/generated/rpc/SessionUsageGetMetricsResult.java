/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: api.schema.json

package com.github.copilot.sdk.generated.rpc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.processing.Generated;

/** Result for the {@code session.usage.getMetrics} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionUsageGetMetricsResult {

    /** Total user-initiated premium request cost across all models (may be fractional due to multipliers) */
    @JsonProperty("totalPremiumRequestCost")
    private Double totalPremiumRequestCost;

    /** Raw count of user-initiated API requests */
    @JsonProperty("totalUserRequests")
    private Double totalUserRequests;

    /** Total time spent in model API calls (milliseconds) */
    @JsonProperty("totalApiDurationMs")
    private Double totalApiDurationMs;

    /** Session start timestamp (epoch milliseconds) */
    @JsonProperty("sessionStartTime")
    private Double sessionStartTime;

    /** Aggregated code change metrics */
    @JsonProperty("codeChanges")
    private SessionUsageGetMetricsResultCodeChanges codeChanges;

    /** Per-model token and request metrics, keyed by model identifier */
    @JsonProperty("modelMetrics")
    private Map<String, SessionUsageGetMetricsResultModelMetricsValue> modelMetrics;

    /** Currently active model identifier */
    @JsonProperty("currentModel")
    private String currentModel;

    /** Input tokens from the most recent main-agent API call */
    @JsonProperty("lastCallInputTokens")
    private Double lastCallInputTokens;

    /** Output tokens from the most recent main-agent API call */
    @JsonProperty("lastCallOutputTokens")
    private Double lastCallOutputTokens;

    public Double getTotalPremiumRequestCost() { return totalPremiumRequestCost; }
    public void setTotalPremiumRequestCost(Double totalPremiumRequestCost) { this.totalPremiumRequestCost = totalPremiumRequestCost; }

    public Double getTotalUserRequests() { return totalUserRequests; }
    public void setTotalUserRequests(Double totalUserRequests) { this.totalUserRequests = totalUserRequests; }

    public Double getTotalApiDurationMs() { return totalApiDurationMs; }
    public void setTotalApiDurationMs(Double totalApiDurationMs) { this.totalApiDurationMs = totalApiDurationMs; }

    public Double getSessionStartTime() { return sessionStartTime; }
    public void setSessionStartTime(Double sessionStartTime) { this.sessionStartTime = sessionStartTime; }

    public SessionUsageGetMetricsResultCodeChanges getCodeChanges() { return codeChanges; }
    public void setCodeChanges(SessionUsageGetMetricsResultCodeChanges codeChanges) { this.codeChanges = codeChanges; }

    public Map<String, SessionUsageGetMetricsResultModelMetricsValue> getModelMetrics() { return modelMetrics; }
    public void setModelMetrics(Map<String, SessionUsageGetMetricsResultModelMetricsValue> modelMetrics) { this.modelMetrics = modelMetrics; }

    public String getCurrentModel() { return currentModel; }
    public void setCurrentModel(String currentModel) { this.currentModel = currentModel; }

    public Double getLastCallInputTokens() { return lastCallInputTokens; }
    public void setLastCallInputTokens(Double lastCallInputTokens) { this.lastCallInputTokens = lastCallInputTokens; }

    public Double getLastCallOutputTokens() { return lastCallOutputTokens; }
    public void setLastCallOutputTokens(Double lastCallOutputTokens) { this.lastCallOutputTokens = lastCallOutputTokens; }


    /** Aggregated code change metrics */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionUsageGetMetricsResultCodeChanges {

        /** Total lines of code added */
        @JsonProperty("linesAdded")
        private Double linesAdded;

        /** Total lines of code removed */
        @JsonProperty("linesRemoved")
        private Double linesRemoved;

        /** Number of distinct files modified */
        @JsonProperty("filesModifiedCount")
        private Double filesModifiedCount;

        public Double getLinesAdded() { return linesAdded; }
        public void setLinesAdded(Double linesAdded) { this.linesAdded = linesAdded; }

        public Double getLinesRemoved() { return linesRemoved; }
        public void setLinesRemoved(Double linesRemoved) { this.linesRemoved = linesRemoved; }

        public Double getFilesModifiedCount() { return filesModifiedCount; }
        public void setFilesModifiedCount(Double filesModifiedCount) { this.filesModifiedCount = filesModifiedCount; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionUsageGetMetricsResultModelMetricsValue {

        /** Request count and cost metrics for this model */
        @JsonProperty("requests")
        private SessionUsageGetMetricsResultModelMetricsValueRequests requests;

        /** Token usage metrics for this model */
        @JsonProperty("usage")
        private SessionUsageGetMetricsResultModelMetricsValueUsage usage;

        public SessionUsageGetMetricsResultModelMetricsValueRequests getRequests() { return requests; }
        public void setRequests(SessionUsageGetMetricsResultModelMetricsValueRequests requests) { this.requests = requests; }

        public SessionUsageGetMetricsResultModelMetricsValueUsage getUsage() { return usage; }
        public void setUsage(SessionUsageGetMetricsResultModelMetricsValueUsage usage) { this.usage = usage; }


        /** Request count and cost metrics for this model */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionUsageGetMetricsResultModelMetricsValueRequests {

            /** Number of API requests made with this model */
            @JsonProperty("count")
            private Double count;

            /** User-initiated premium request cost (with multiplier applied) */
            @JsonProperty("cost")
            private Double cost;

            public Double getCount() { return count; }
            public void setCount(Double count) { this.count = count; }

            public Double getCost() { return cost; }
            public void setCost(Double cost) { this.cost = cost; }
        }

        /** Token usage metrics for this model */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionUsageGetMetricsResultModelMetricsValueUsage {

            /** Total input tokens consumed */
            @JsonProperty("inputTokens")
            private Double inputTokens;

            /** Total output tokens produced */
            @JsonProperty("outputTokens")
            private Double outputTokens;

            /** Total tokens read from prompt cache */
            @JsonProperty("cacheReadTokens")
            private Double cacheReadTokens;

            /** Total tokens written to prompt cache */
            @JsonProperty("cacheWriteTokens")
            private Double cacheWriteTokens;

            /** Total output tokens used for reasoning */
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
