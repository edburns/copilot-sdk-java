/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: api.schema.json

package com.github.copilot.sdk.generated.rpc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

/** Result for the {@code tools.list} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ToolsListResult {

    /** List of available built-in tools with metadata */
    @JsonProperty("tools")
    private List<ToolsListResultToolsItem> tools;

    public List<ToolsListResultToolsItem> getTools() { return tools; }
    public void setTools(List<ToolsListResultToolsItem> tools) { this.tools = tools; }


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ToolsListResultToolsItem {

        /** Tool identifier (e.g., "bash", "grep", "str_replace_editor") */
        @JsonProperty("name")
        private String name;

        /** Optional namespaced name for declarative filtering (e.g., "playwright/navigate" for MCP tools) */
        @JsonProperty("namespacedName")
        private String namespacedName;

        /** Description of what the tool does */
        @JsonProperty("description")
        private String description;

        /** JSON Schema for the tool's input parameters */
        @JsonProperty("parameters")
        private Map<String, Object> parameters;

        /** Optional instructions for how to use this tool effectively */
        @JsonProperty("instructions")
        private String instructions;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getNamespacedName() { return namespacedName; }
        public void setNamespacedName(String namespacedName) { this.namespacedName = namespacedName; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public Map<String, Object> getParameters() { return parameters; }
        public void setParameters(Map<String, Object> parameters) { this.parameters = parameters; }

        public String getInstructions() { return instructions; }
        public void setInstructions(String instructions) { this.instructions = instructions; }
    }
}
