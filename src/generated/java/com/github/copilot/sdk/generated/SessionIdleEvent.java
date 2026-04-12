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

/** The {@code session.idle} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionIdleEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionIdleEventData data;

    public SessionIdleEventData getData() { return data; }
    public void setData(SessionIdleEventData data) { this.data = data; }

    /** Data payload for {@link SessionIdleEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionIdleEventData {

        /** True when the preceding agentic loop was cancelled via abort signal */
        @JsonProperty("aborted")
        private Boolean aborted;

        public Boolean getAborted() { return aborted; }
        public void setAborted(Boolean aborted) { this.aborted = aborted; }
    }
}
