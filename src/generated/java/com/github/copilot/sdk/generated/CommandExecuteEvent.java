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

/** The {@code command.execute} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class CommandExecuteEvent extends SessionEvent {

    @JsonProperty("data")
    private CommandExecuteEventData data;

    public CommandExecuteEventData getData() { return data; }
    public void setData(CommandExecuteEventData data) { this.data = data; }

    /** Data payload for {@link CommandExecuteEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CommandExecuteEventData {

        /** Unique identifier; used to respond via session.commands.handlePendingCommand() */
        @JsonProperty("requestId")
        private String requestId;

        /** The full command text (e.g., /deploy production) */
        @JsonProperty("command")
        private String command;

        /** Command name without leading / */
        @JsonProperty("commandName")
        private String commandName;

        /** Raw argument string after the command name */
        @JsonProperty("args")
        private String args;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public String getCommand() { return command; }
        public void setCommand(String command) { this.command = command; }

        public String getCommandName() { return commandName; }
        public void setCommandName(String commandName) { this.commandName = commandName; }

        public String getArgs() { return args; }
        public void setArgs(String args) { this.args = args; }
    }
}
