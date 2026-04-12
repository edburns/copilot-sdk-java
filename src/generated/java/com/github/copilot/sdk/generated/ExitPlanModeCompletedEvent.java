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

/** The {@code exit_plan_mode.completed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ExitPlanModeCompletedEvent extends SessionEvent {

    @JsonProperty("data")
    private ExitPlanModeCompletedEventData data;

    public ExitPlanModeCompletedEventData getData() { return data; }
    public void setData(ExitPlanModeCompletedEventData data) { this.data = data; }

    /** Data payload for {@link ExitPlanModeCompletedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ExitPlanModeCompletedEventData {

        /** Request ID of the resolved exit plan mode request; clients should dismiss any UI for this request */
        @JsonProperty("requestId")
        private String requestId;

        /** Whether the plan was approved by the user */
        @JsonProperty("approved")
        private Boolean approved;

        /** Which action the user selected (e.g. 'autopilot', 'interactive', 'exit_only') */
        @JsonProperty("selectedAction")
        private String selectedAction;

        /** Whether edits should be auto-approved without confirmation */
        @JsonProperty("autoApproveEdits")
        private Boolean autoApproveEdits;

        /** Free-form feedback from the user if they requested changes to the plan */
        @JsonProperty("feedback")
        private String feedback;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public Boolean getApproved() { return approved; }
        public void setApproved(Boolean approved) { this.approved = approved; }

        public String getSelectedAction() { return selectedAction; }
        public void setSelectedAction(String selectedAction) { this.selectedAction = selectedAction; }

        public Boolean getAutoApproveEdits() { return autoApproveEdits; }
        public void setAutoApproveEdits(Boolean autoApproveEdits) { this.autoApproveEdits = autoApproveEdits; }

        public String getFeedback() { return feedback; }
        public void setFeedback(String feedback) { this.feedback = feedback; }
    }
}
