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

/** The {@code assistant.turn_end} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class AssistantTurnEndEvent extends SessionEvent {

    @JsonProperty("data")
    private AssistantTurnEndEventData data;

    public AssistantTurnEndEventData getData() { return data; }
    public void setData(AssistantTurnEndEventData data) { this.data = data; }

    /** Data payload for {@link AssistantTurnEndEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AssistantTurnEndEventData {

        /** Identifier of the turn that has ended, matching the corresponding assistant.turn_start event */
        @JsonProperty("turnId")
        private String turnId;

        public String getTurnId() { return turnId; }
        public void setTurnId(String turnId) { this.turnId = turnId; }
    }
}
