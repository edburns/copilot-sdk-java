/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.sdk.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;

/** The {@code commands.changed} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class CommandsChangedEvent extends SessionEvent {

    @JsonProperty("data")
    private CommandsChangedEventData data;

    public CommandsChangedEventData getData() { return data; }
    public void setData(CommandsChangedEventData data) { this.data = data; }

    /** Data payload for {@link CommandsChangedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CommandsChangedEventData {

        /** Current list of registered SDK commands */
        @JsonProperty("commands")
        private List<CommandsChangedEventDataCommandsItem> commands;

        public List<CommandsChangedEventDataCommandsItem> getCommands() { return commands; }
        public void setCommands(List<CommandsChangedEventDataCommandsItem> commands) { this.commands = commands; }


        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class CommandsChangedEventDataCommandsItem {

            @JsonProperty("name")
            private String name;

            @JsonProperty("description")
            private String description;

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public String getDescription() { return description; }
            public void setDescription(String description) { this.description = description; }
        }
    }
}
