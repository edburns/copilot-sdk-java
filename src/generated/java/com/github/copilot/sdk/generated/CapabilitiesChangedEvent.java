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

/** The {@code capabilities.changed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class CapabilitiesChangedEvent extends SessionEvent {

    @JsonProperty("data")
    private CapabilitiesChangedEventData data;

    public CapabilitiesChangedEventData getData() { return data; }
    public void setData(CapabilitiesChangedEventData data) { this.data = data; }

    /** Data payload for {@link CapabilitiesChangedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CapabilitiesChangedEventData {

        /** UI capability changes */
        @JsonProperty("ui")
        private CapabilitiesChangedEventDataUi ui;

        public CapabilitiesChangedEventDataUi getUi() { return ui; }
        public void setUi(CapabilitiesChangedEventDataUi ui) { this.ui = ui; }


        /** UI capability changes */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class CapabilitiesChangedEventDataUi {

            /** Whether elicitation is now supported */
            @JsonProperty("elicitation")
            private Boolean elicitation;

            public Boolean getElicitation() { return elicitation; }
            public void setElicitation(Boolean elicitation) { this.elicitation = elicitation; }
        }
    }
}
