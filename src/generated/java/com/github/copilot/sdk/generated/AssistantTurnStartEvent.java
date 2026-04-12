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

/** The {@code assistant.turn_start} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class AssistantTurnStartEvent extends SessionEvent {

    @JsonProperty("data")
    private AssistantTurnStartEventData data;

    public AssistantTurnStartEventData getData() { return data; }
    public void setData(AssistantTurnStartEventData data) { this.data = data; }

    /** Data payload for {@link AssistantTurnStartEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AssistantTurnStartEventData {

        /** Identifier for this turn within the agentic loop, typically a stringified turn number */
        @JsonProperty("turnId")
        private String turnId;

        /** CAPI interaction ID for correlating this turn with upstream telemetry */
        @JsonProperty("interactionId")
        private String interactionId;

        public String getTurnId() { return turnId; }
        public void setTurnId(String turnId) { this.turnId = turnId; }

        public String getInteractionId() { return interactionId; }
        public void setInteractionId(String interactionId) { this.interactionId = interactionId; }
    }
}
