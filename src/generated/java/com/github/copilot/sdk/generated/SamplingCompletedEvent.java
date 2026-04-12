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

/** The {@code sampling.completed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SamplingCompletedEvent extends SessionEvent {

    @JsonProperty("data")
    private SamplingCompletedEventData data;

    public SamplingCompletedEventData getData() { return data; }
    public void setData(SamplingCompletedEventData data) { this.data = data; }

    /** Data payload for {@link SamplingCompletedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SamplingCompletedEventData {

        /** Request ID of the resolved sampling request; clients should dismiss any UI for this request */
        @JsonProperty("requestId")
        private String requestId;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }
    }
}
