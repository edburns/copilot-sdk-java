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

/** The {@code command.queued} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class CommandQueuedEvent extends SessionEvent {

    @JsonProperty("data")
    private CommandQueuedEventData data;

    public CommandQueuedEventData getData() { return data; }
    public void setData(CommandQueuedEventData data) { this.data = data; }

    /** Data payload for {@link CommandQueuedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CommandQueuedEventData {

        /** Unique identifier for this request; used to respond via session.respondToQueuedCommand() */
        @JsonProperty("requestId")
        private String requestId;

        /** The slash command text to be executed (e.g., /help, /clear) */
        @JsonProperty("command")
        private String command;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public String getCommand() { return command; }
        public void setCommand(String command) { this.command = command; }
    }
}
