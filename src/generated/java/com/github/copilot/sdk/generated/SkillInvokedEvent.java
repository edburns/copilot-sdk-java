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

/** The {@code skill.invoked} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SkillInvokedEvent extends SessionEvent {

    @JsonProperty("data")
    private SkillInvokedEventData data;

    public SkillInvokedEventData getData() { return data; }
    public void setData(SkillInvokedEventData data) { this.data = data; }

    /** Data payload for {@link SkillInvokedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SkillInvokedEventData {

        /** Name of the invoked skill */
        @JsonProperty("name")
        private String name;

        /** File path to the SKILL.md definition */
        @JsonProperty("path")
        private String path;

        /** Full content of the skill file, injected into the conversation for the model */
        @JsonProperty("content")
        private String content;

        /** Tool names that should be auto-approved when this skill is active */
        @JsonProperty("allowedTools")
        private List<String> allowedTools;

        /** Name of the plugin this skill originated from, when applicable */
        @JsonProperty("pluginName")
        private String pluginName;

        /** Version of the plugin this skill originated from, when applicable */
        @JsonProperty("pluginVersion")
        private String pluginVersion;

        /** Description of the skill from its SKILL.md frontmatter */
        @JsonProperty("description")
        private String description;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getPath() { return path; }
        public void setPath(String path) { this.path = path; }

        public String getContent() { return content; }
        public void setContent(String content) { this.content = content; }

        public List<String> getAllowedTools() { return allowedTools; }
        public void setAllowedTools(List<String> allowedTools) { this.allowedTools = allowedTools; }

        public String getPluginName() { return pluginName; }
        public void setPluginName(String pluginName) { this.pluginName = pluginName; }

        public String getPluginVersion() { return pluginVersion; }
        public void setPluginVersion(String pluginVersion) { this.pluginVersion = pluginVersion; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
    }
}
