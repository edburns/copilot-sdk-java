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

/** The {@code session.skills_loaded} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionSkillsLoadedEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionSkillsLoadedEventData data;

    public SessionSkillsLoadedEventData getData() { return data; }
    public void setData(SessionSkillsLoadedEventData data) { this.data = data; }

    /** Data payload for {@link SessionSkillsLoadedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionSkillsLoadedEventData {

        /** Array of resolved skill metadata */
        @JsonProperty("skills")
        private List<SessionSkillsLoadedEventDataSkillsItem> skills;

        public List<SessionSkillsLoadedEventDataSkillsItem> getSkills() { return skills; }
        public void setSkills(List<SessionSkillsLoadedEventDataSkillsItem> skills) { this.skills = skills; }


        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionSkillsLoadedEventDataSkillsItem {

            /** Unique identifier for the skill */
            @JsonProperty("name")
            private String name;

            /** Description of what the skill does */
            @JsonProperty("description")
            private String description;

            /** Source location type of the skill (e.g., project, personal, plugin) */
            @JsonProperty("source")
            private String source;

            /** Whether the skill can be invoked by the user as a slash command */
            @JsonProperty("userInvocable")
            private Boolean userInvocable;

            /** Whether the skill is currently enabled */
            @JsonProperty("enabled")
            private Boolean enabled;

            /** Absolute path to the skill file, if available */
            @JsonProperty("path")
            private String path;

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public String getDescription() { return description; }
            public void setDescription(String description) { this.description = description; }

            public String getSource() { return source; }
            public void setSource(String source) { this.source = source; }

            public Boolean getUserInvocable() { return userInvocable; }
            public void setUserInvocable(Boolean userInvocable) { this.userInvocable = userInvocable; }

            public Boolean getEnabled() { return enabled; }
            public void setEnabled(Boolean enabled) { this.enabled = enabled; }

            public String getPath() { return path; }
            public void setPath(String path) { this.path = path; }
        }
    }
}
