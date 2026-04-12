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

/** Result for the {@code account.getQuota} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountGetQuotaResult {

    /** Quota snapshots keyed by type (e.g., chat, completions, premium_interactions) */
    @JsonProperty("quotaSnapshots")
    private Map<String, AccountGetQuotaResultQuotaSnapshotsValue> quotaSnapshots;

    public Map<String, AccountGetQuotaResultQuotaSnapshotsValue> getQuotaSnapshots() { return quotaSnapshots; }
    public void setQuotaSnapshots(Map<String, AccountGetQuotaResultQuotaSnapshotsValue> quotaSnapshots) { this.quotaSnapshots = quotaSnapshots; }


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AccountGetQuotaResultQuotaSnapshotsValue {

        /** Number of requests included in the entitlement */
        @JsonProperty("entitlementRequests")
        private Double entitlementRequests;

        /** Number of requests used so far this period */
        @JsonProperty("usedRequests")
        private Double usedRequests;

        /** Percentage of entitlement remaining */
        @JsonProperty("remainingPercentage")
        private Double remainingPercentage;

        /** Number of overage requests made this period */
        @JsonProperty("overage")
        private Double overage;

        /** Whether pay-per-request usage is allowed when quota is exhausted */
        @JsonProperty("overageAllowedWithExhaustedQuota")
        private Boolean overageAllowedWithExhaustedQuota;

        /** Date when the quota resets (ISO 8601) */
        @JsonProperty("resetDate")
        private String resetDate;

        public Double getEntitlementRequests() { return entitlementRequests; }
        public void setEntitlementRequests(Double entitlementRequests) { this.entitlementRequests = entitlementRequests; }

        public Double getUsedRequests() { return usedRequests; }
        public void setUsedRequests(Double usedRequests) { this.usedRequests = usedRequests; }

        public Double getRemainingPercentage() { return remainingPercentage; }
        public void setRemainingPercentage(Double remainingPercentage) { this.remainingPercentage = remainingPercentage; }

        public Double getOverage() { return overage; }
        public void setOverage(Double overage) { this.overage = overage; }

        public Boolean getOverageAllowedWithExhaustedQuota() { return overageAllowedWithExhaustedQuota; }
        public void setOverageAllowedWithExhaustedQuota(Boolean overageAllowedWithExhaustedQuota) { this.overageAllowedWithExhaustedQuota = overageAllowedWithExhaustedQuota; }

        public String getResetDate() { return resetDate; }
        public void setResetDate(String resetDate) { this.resetDate = resetDate; }
    }
}
