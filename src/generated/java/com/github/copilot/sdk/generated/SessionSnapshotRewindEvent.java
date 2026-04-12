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

/** The {@code session.snapshot_rewind} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionSnapshotRewindEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionSnapshotRewindEventData data;

    public SessionSnapshotRewindEventData getData() { return data; }
    public void setData(SessionSnapshotRewindEventData data) { this.data = data; }

    /** Data payload for {@link SessionSnapshotRewindEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionSnapshotRewindEventData {

        /** Event ID that was rewound to; this event and all after it were removed */
        @JsonProperty("upToEventId")
        private String upToEventId;

        /** Number of events that were removed by the rewind */
        @JsonProperty("eventsRemoved")
        private Double eventsRemoved;

        public String getUpToEventId() { return upToEventId; }
        public void setUpToEventId(String upToEventId) { this.upToEventId = upToEventId; }

        public Double getEventsRemoved() { return eventsRemoved; }
        public void setEventsRemoved(Double eventsRemoved) { this.eventsRemoved = eventsRemoved; }
    }
}
