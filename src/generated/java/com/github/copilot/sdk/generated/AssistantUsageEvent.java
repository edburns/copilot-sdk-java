/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.sdk.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

/** The {@code assistant.usage} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class AssistantUsageEvent extends SessionEvent {

    @JsonProperty("data")
    private AssistantUsageEventData data;

    public AssistantUsageEventData getData() { return data; }
    public void setData(AssistantUsageEventData data) { this.data = data; }

    /** Data payload for {@link AssistantUsageEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AssistantUsageEventData {

        /** Model identifier used for this API call */
        @JsonProperty("model")
        private String model;

        /** Number of input tokens consumed */
        @JsonProperty("inputTokens")
        private Double inputTokens;

        /** Number of output tokens produced */
        @JsonProperty("outputTokens")
        private Double outputTokens;

        /** Number of tokens read from prompt cache */
        @JsonProperty("cacheReadTokens")
        private Double cacheReadTokens;

        /** Number of tokens written to prompt cache */
        @JsonProperty("cacheWriteTokens")
        private Double cacheWriteTokens;

        /** Number of output tokens used for reasoning (e.g., chain-of-thought) */
        @JsonProperty("reasoningTokens")
        private Double reasoningTokens;

        /** Model multiplier cost for billing purposes */
        @JsonProperty("cost")
        private Double cost;

        /** Duration of the API call in milliseconds */
        @JsonProperty("duration")
        private Double duration;

        /** Time to first token in milliseconds. Only available for streaming requests */
        @JsonProperty("ttftMs")
        private Double ttftMs;

        /** Average inter-token latency in milliseconds. Only available for streaming requests */
        @JsonProperty("interTokenLatencyMs")
        private Double interTokenLatencyMs;

        /** What initiated this API call (e.g., "sub-agent", "mcp-sampling"); absent for user-initiated calls */
        @JsonProperty("initiator")
        private String initiator;

        /** Completion ID from the model provider (e.g., chatcmpl-abc123) */
        @JsonProperty("apiCallId")
        private String apiCallId;

        /** GitHub request tracing ID (x-github-request-id header) for server-side log correlation */
        @JsonProperty("providerCallId")
        private String providerCallId;

        /** Parent tool call ID when this usage originates from a sub-agent */
        @JsonProperty("parentToolCallId")
        private String parentToolCallId;

        /** Per-quota resource usage snapshots, keyed by quota identifier */
        @JsonProperty("quotaSnapshots")
        private Map<String, AssistantUsageEventDataQuotaSnapshotsValue> quotaSnapshots;

        /** Per-request cost and usage data from the CAPI copilot_usage response field */
        @JsonProperty("copilotUsage")
        private AssistantUsageEventDataCopilotUsage copilotUsage;

        /** Reasoning effort level used for model calls, if applicable (e.g. "low", "medium", "high", "xhigh") */
        @JsonProperty("reasoningEffort")
        private String reasoningEffort;

        public String getModel() { return model; }
        public void setModel(String model) { this.model = model; }

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

        public Double getCost() { return cost; }
        public void setCost(Double cost) { this.cost = cost; }

        public Double getDuration() { return duration; }
        public void setDuration(Double duration) { this.duration = duration; }

        public Double getTtftMs() { return ttftMs; }
        public void setTtftMs(Double ttftMs) { this.ttftMs = ttftMs; }

        public Double getInterTokenLatencyMs() { return interTokenLatencyMs; }
        public void setInterTokenLatencyMs(Double interTokenLatencyMs) { this.interTokenLatencyMs = interTokenLatencyMs; }

        public String getInitiator() { return initiator; }
        public void setInitiator(String initiator) { this.initiator = initiator; }

        public String getApiCallId() { return apiCallId; }
        public void setApiCallId(String apiCallId) { this.apiCallId = apiCallId; }

        public String getProviderCallId() { return providerCallId; }
        public void setProviderCallId(String providerCallId) { this.providerCallId = providerCallId; }

        public String getParentToolCallId() { return parentToolCallId; }
        public void setParentToolCallId(String parentToolCallId) { this.parentToolCallId = parentToolCallId; }

        public Map<String, AssistantUsageEventDataQuotaSnapshotsValue> getQuotaSnapshots() { return quotaSnapshots; }
        public void setQuotaSnapshots(Map<String, AssistantUsageEventDataQuotaSnapshotsValue> quotaSnapshots) { this.quotaSnapshots = quotaSnapshots; }

        public AssistantUsageEventDataCopilotUsage getCopilotUsage() { return copilotUsage; }
        public void setCopilotUsage(AssistantUsageEventDataCopilotUsage copilotUsage) { this.copilotUsage = copilotUsage; }

        public String getReasoningEffort() { return reasoningEffort; }
        public void setReasoningEffort(String reasoningEffort) { this.reasoningEffort = reasoningEffort; }


        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class AssistantUsageEventDataQuotaSnapshotsValue {

            /** Whether the user has an unlimited usage entitlement */
            @JsonProperty("isUnlimitedEntitlement")
            private Boolean isUnlimitedEntitlement;

            /** Total requests allowed by the entitlement */
            @JsonProperty("entitlementRequests")
            private Double entitlementRequests;

            /** Number of requests already consumed */
            @JsonProperty("usedRequests")
            private Double usedRequests;

            /** Whether usage is still permitted after quota exhaustion */
            @JsonProperty("usageAllowedWithExhaustedQuota")
            private Boolean usageAllowedWithExhaustedQuota;

            /** Number of requests over the entitlement limit */
            @JsonProperty("overage")
            private Double overage;

            /** Whether overage is allowed when quota is exhausted */
            @JsonProperty("overageAllowedWithExhaustedQuota")
            private Boolean overageAllowedWithExhaustedQuota;

            /** Percentage of quota remaining (0.0 to 1.0) */
            @JsonProperty("remainingPercentage")
            private Double remainingPercentage;

            /** Date when the quota resets */
            @JsonProperty("resetDate")
            private OffsetDateTime resetDate;

            public Boolean getIsUnlimitedEntitlement() { return isUnlimitedEntitlement; }
            public void setIsUnlimitedEntitlement(Boolean isUnlimitedEntitlement) { this.isUnlimitedEntitlement = isUnlimitedEntitlement; }

            public Double getEntitlementRequests() { return entitlementRequests; }
            public void setEntitlementRequests(Double entitlementRequests) { this.entitlementRequests = entitlementRequests; }

            public Double getUsedRequests() { return usedRequests; }
            public void setUsedRequests(Double usedRequests) { this.usedRequests = usedRequests; }

            public Boolean getUsageAllowedWithExhaustedQuota() { return usageAllowedWithExhaustedQuota; }
            public void setUsageAllowedWithExhaustedQuota(Boolean usageAllowedWithExhaustedQuota) { this.usageAllowedWithExhaustedQuota = usageAllowedWithExhaustedQuota; }

            public Double getOverage() { return overage; }
            public void setOverage(Double overage) { this.overage = overage; }

            public Boolean getOverageAllowedWithExhaustedQuota() { return overageAllowedWithExhaustedQuota; }
            public void setOverageAllowedWithExhaustedQuota(Boolean overageAllowedWithExhaustedQuota) { this.overageAllowedWithExhaustedQuota = overageAllowedWithExhaustedQuota; }

            public Double getRemainingPercentage() { return remainingPercentage; }
            public void setRemainingPercentage(Double remainingPercentage) { this.remainingPercentage = remainingPercentage; }

            public OffsetDateTime getResetDate() { return resetDate; }
            public void setResetDate(OffsetDateTime resetDate) { this.resetDate = resetDate; }
        }

        /** Per-request cost and usage data from the CAPI copilot_usage response field */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class AssistantUsageEventDataCopilotUsage {

            /** Itemized token usage breakdown */
            @JsonProperty("tokenDetails")
            private List<AssistantUsageEventDataCopilotUsageTokenDetailsItem> tokenDetails;

            /** Total cost in nano-AIU (AI Units) for this request */
            @JsonProperty("totalNanoAiu")
            private Double totalNanoAiu;

            public List<AssistantUsageEventDataCopilotUsageTokenDetailsItem> getTokenDetails() { return tokenDetails; }
            public void setTokenDetails(List<AssistantUsageEventDataCopilotUsageTokenDetailsItem> tokenDetails) { this.tokenDetails = tokenDetails; }

            public Double getTotalNanoAiu() { return totalNanoAiu; }
            public void setTotalNanoAiu(Double totalNanoAiu) { this.totalNanoAiu = totalNanoAiu; }


            /** Token usage detail for a single billing category */
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonInclude(JsonInclude.Include.NON_NULL)
            public static class AssistantUsageEventDataCopilotUsageTokenDetailsItem {

                /** Number of tokens in this billing batch */
                @JsonProperty("batchSize")
                private Double batchSize;

                /** Cost per batch of tokens */
                @JsonProperty("costPerBatch")
                private Double costPerBatch;

                /** Total token count for this entry */
                @JsonProperty("tokenCount")
                private Double tokenCount;

                /** Token category (e.g., "input", "output") */
                @JsonProperty("tokenType")
                private String tokenType;

                public Double getBatchSize() { return batchSize; }
                public void setBatchSize(Double batchSize) { this.batchSize = batchSize; }

                public Double getCostPerBatch() { return costPerBatch; }
                public void setCostPerBatch(Double costPerBatch) { this.costPerBatch = costPerBatch; }

                public Double getTokenCount() { return tokenCount; }
                public void setTokenCount(Double tokenCount) { this.tokenCount = tokenCount; }

                public String getTokenType() { return tokenType; }
                public void setTokenType(String tokenType) { this.tokenType = tokenType; }
            }
        }
    }
}
