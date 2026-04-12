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

/** The {@code session.tools_updated} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionToolsUpdatedEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionToolsUpdatedEventData data;

    public SessionToolsUpdatedEventData getData() { return data; }
    public void setData(SessionToolsUpdatedEventData data) { this.data = data; }

    /** Data payload for {@link SessionToolsUpdatedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionToolsUpdatedEventData {

        @JsonProperty("model")
        private String model;

        public String getModel() { return model; }
        public void setModel(String model) { this.model = model; }
    }
}
