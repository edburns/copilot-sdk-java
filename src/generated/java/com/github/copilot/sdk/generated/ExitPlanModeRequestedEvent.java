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

/** The {@code exit_plan_mode.requested} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ExitPlanModeRequestedEvent extends SessionEvent {

    @JsonProperty("data")
    private ExitPlanModeRequestedEventData data;

    public ExitPlanModeRequestedEventData getData() { return data; }
    public void setData(ExitPlanModeRequestedEventData data) { this.data = data; }

    /** Data payload for {@link ExitPlanModeRequestedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ExitPlanModeRequestedEventData {

        /** Unique identifier for this request; used to respond via session.respondToExitPlanMode() */
        @JsonProperty("requestId")
        private String requestId;

        /** Summary of the plan that was created */
        @JsonProperty("summary")
        private String summary;

        /** Full content of the plan file */
        @JsonProperty("planContent")
        private String planContent;

        /** Available actions the user can take (e.g., approve, edit, reject) */
        @JsonProperty("actions")
        private List<String> actions;

        /** The recommended action for the user to take */
        @JsonProperty("recommendedAction")
        private String recommendedAction;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public String getSummary() { return summary; }
        public void setSummary(String summary) { this.summary = summary; }

        public String getPlanContent() { return planContent; }
        public void setPlanContent(String planContent) { this.planContent = planContent; }

        public List<String> getActions() { return actions; }
        public void setActions(List<String> actions) { this.actions = actions; }

        public String getRecommendedAction() { return recommendedAction; }
        public void setRecommendedAction(String recommendedAction) { this.recommendedAction = recommendedAction; }
    }
}
