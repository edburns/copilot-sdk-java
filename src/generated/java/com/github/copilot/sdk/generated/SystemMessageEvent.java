/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.sdk.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.processing.Generated;

/** The {@code system.message} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SystemMessageEvent extends SessionEvent {

    @JsonProperty("data")
    private SystemMessageEventData data;

    public SystemMessageEventData getData() { return data; }
    public void setData(SystemMessageEventData data) { this.data = data; }

    /** Data payload for {@link SystemMessageEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SystemMessageEventData {

        /** The system or developer prompt text */
        @JsonProperty("content")
        private String content;

        /** Message role: "system" for system prompts, "developer" for developer-injected instructions */
        @JsonProperty("role")
        private SystemMessageEventDataRole role;

        /** Optional name identifier for the message source */
        @JsonProperty("name")
        private String name;

        /** Metadata about the prompt template and its construction */
        @JsonProperty("metadata")
        private SystemMessageEventDataMetadata metadata;

        public String getContent() { return content; }
        public void setContent(String content) { this.content = content; }

        public SystemMessageEventDataRole getRole() { return role; }
        public void setRole(SystemMessageEventDataRole role) { this.role = role; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public SystemMessageEventDataMetadata getMetadata() { return metadata; }
        public void setMetadata(SystemMessageEventDataMetadata metadata) { this.metadata = metadata; }


        /** Message role: "system" for system prompts, "developer" for developer-injected instructions */
        public enum SystemMessageEventDataRole {
            /** The {@code system} variant. */
            SYSTEM("system"),
            /** The {@code developer} variant. */
            DEVELOPER("developer");

            private final String value;
            SystemMessageEventDataRole(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }

        /** Metadata about the prompt template and its construction */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SystemMessageEventDataMetadata {

            /** Version identifier of the prompt template used */
            @JsonProperty("promptVersion")
            private String promptVersion;

            /** Template variables used when constructing the prompt */
            @JsonProperty("variables")
            private Map<String, Object> variables;

            public String getPromptVersion() { return promptVersion; }
            public void setPromptVersion(String promptVersion) { this.promptVersion = promptVersion; }

            public Map<String, Object> getVariables() { return variables; }
            public void setVariables(Map<String, Object> variables) { this.variables = variables; }
        }
    }
}
