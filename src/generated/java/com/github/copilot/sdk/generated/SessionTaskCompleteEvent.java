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

/** The {@code session.task_complete} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionTaskCompleteEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionTaskCompleteEventData data;

    public SessionTaskCompleteEventData getData() { return data; }
    public void setData(SessionTaskCompleteEventData data) { this.data = data; }

    /** Data payload for {@link SessionTaskCompleteEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionTaskCompleteEventData {

        /** Summary of the completed task, provided by the agent */
        @JsonProperty("summary")
        private String summary;

        /** Whether the tool call succeeded. False when validation failed (e.g., invalid arguments) */
        @JsonProperty("success")
        private Boolean success;

        public String getSummary() { return summary; }
        public void setSummary(String summary) { this.summary = summary; }

        public Boolean getSuccess() { return success; }
        public void setSuccess(Boolean success) { this.success = success; }
    }
}
