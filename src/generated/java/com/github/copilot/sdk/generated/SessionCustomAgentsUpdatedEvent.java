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

/** The {@code session.custom_agents_updated} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionCustomAgentsUpdatedEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionCustomAgentsUpdatedEventData data;

    public SessionCustomAgentsUpdatedEventData getData() { return data; }
    public void setData(SessionCustomAgentsUpdatedEventData data) { this.data = data; }

    /** Data payload for {@link SessionCustomAgentsUpdatedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionCustomAgentsUpdatedEventData {

        /** Array of loaded custom agent metadata */
        @JsonProperty("agents")
        private List<SessionCustomAgentsUpdatedEventDataAgentsItem> agents;

        /** Non-fatal warnings from agent loading */
        @JsonProperty("warnings")
        private List<String> warnings;

        /** Fatal errors from agent loading */
        @JsonProperty("errors")
        private List<String> errors;

        public List<SessionCustomAgentsUpdatedEventDataAgentsItem> getAgents() { return agents; }
        public void setAgents(List<SessionCustomAgentsUpdatedEventDataAgentsItem> agents) { this.agents = agents; }

        public List<String> getWarnings() { return warnings; }
        public void setWarnings(List<String> warnings) { this.warnings = warnings; }

        public List<String> getErrors() { return errors; }
        public void setErrors(List<String> errors) { this.errors = errors; }


        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionCustomAgentsUpdatedEventDataAgentsItem {

            /** Unique identifier for the agent */
            @JsonProperty("id")
            private String id;

            /** Internal name of the agent */
            @JsonProperty("name")
            private String name;

            /** Human-readable display name */
            @JsonProperty("displayName")
            private String displayName;

            /** Description of what the agent does */
            @JsonProperty("description")
            private String description;

            /** Source location: user, project, inherited, remote, or plugin */
            @JsonProperty("source")
            private String source;

            /** List of tool names available to this agent */
            @JsonProperty("tools")
            private List<String> tools;

            /** Whether the agent can be selected by the user */
            @JsonProperty("userInvocable")
            private Boolean userInvocable;

            /** Model override for this agent, if set */
            @JsonProperty("model")
            private String model;

            public String getId() { return id; }
            public void setId(String id) { this.id = id; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public String getDisplayName() { return displayName; }
            public void setDisplayName(String displayName) { this.displayName = displayName; }

            public String getDescription() { return description; }
            public void setDescription(String description) { this.description = description; }

            public String getSource() { return source; }
            public void setSource(String source) { this.source = source; }

            public List<String> getTools() { return tools; }
            public void setTools(List<String> tools) { this.tools = tools; }

            public Boolean getUserInvocable() { return userInvocable; }
            public void setUserInvocable(Boolean userInvocable) { this.userInvocable = userInvocable; }

            public String getModel() { return model; }
            public void setModel(String model) { this.model = model; }
        }
    }
}
