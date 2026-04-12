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

/** The {@code external_tool.completed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ExternalToolCompletedEvent extends SessionEvent {

    @JsonProperty("data")
    private ExternalToolCompletedEventData data;

    public ExternalToolCompletedEventData getData() { return data; }
    public void setData(ExternalToolCompletedEventData data) { this.data = data; }

    /** Data payload for {@link ExternalToolCompletedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ExternalToolCompletedEventData {

        /** Request ID of the resolved external tool request; clients should dismiss any UI for this request */
        @JsonProperty("requestId")
        private String requestId;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }
    }
}
