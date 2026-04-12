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

/** The {@code session.model_change} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionModelChangeEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionModelChangeEventData data;

    public SessionModelChangeEventData getData() { return data; }
    public void setData(SessionModelChangeEventData data) { this.data = data; }

    /** Data payload for {@link SessionModelChangeEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionModelChangeEventData {

        /** Model that was previously selected, if any */
        @JsonProperty("previousModel")
        private String previousModel;

        /** Newly selected model identifier */
        @JsonProperty("newModel")
        private String newModel;

        /** Reasoning effort level before the model change, if applicable */
        @JsonProperty("previousReasoningEffort")
        private String previousReasoningEffort;

        /** Reasoning effort level after the model change, if applicable */
        @JsonProperty("reasoningEffort")
        private String reasoningEffort;

        public String getPreviousModel() { return previousModel; }
        public void setPreviousModel(String previousModel) { this.previousModel = previousModel; }

        public String getNewModel() { return newModel; }
        public void setNewModel(String newModel) { this.newModel = newModel; }

        public String getPreviousReasoningEffort() { return previousReasoningEffort; }
        public void setPreviousReasoningEffort(String previousReasoningEffort) { this.previousReasoningEffort = previousReasoningEffort; }

        public String getReasoningEffort() { return reasoningEffort; }
        public void setReasoningEffort(String reasoningEffort) { this.reasoningEffort = reasoningEffort; }
    }
}
