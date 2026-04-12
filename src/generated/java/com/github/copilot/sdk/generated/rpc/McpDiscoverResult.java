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
import javax.annotation.processing.Generated;

/** Result for the {@code mcp.discover} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class McpDiscoverResult {

    /** MCP servers discovered from all sources */
    @JsonProperty("servers")
    private List<McpDiscoverResultServersItem> servers;

    public List<McpDiscoverResultServersItem> getServers() { return servers; }
    public void setServers(List<McpDiscoverResultServersItem> servers) { this.servers = servers; }


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class McpDiscoverResultServersItem {

        /** Server name (config key) */
        @JsonProperty("name")
        private String name;

        /** Server type: local, stdio, http, or sse */
        @JsonProperty("type")
        private String type;

        /** Configuration source */
        @JsonProperty("source")
        private McpDiscoverResultServersItemSource source;

        /** Whether the server is enabled (not in the disabled list) */
        @JsonProperty("enabled")
        private Boolean enabled;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public McpDiscoverResultServersItemSource getSource() { return source; }
        public void setSource(McpDiscoverResultServersItemSource source) { this.source = source; }

        public Boolean getEnabled() { return enabled; }
        public void setEnabled(Boolean enabled) { this.enabled = enabled; }


        /** Configuration source */
        public enum McpDiscoverResultServersItemSource {
            /** The {@code user} variant. */
            USER("user"),
            /** The {@code workspace} variant. */
            WORKSPACE("workspace"),
            /** The {@code plugin} variant. */
            PLUGIN("plugin"),
            /** The {@code builtin} variant. */
            BUILTIN("builtin");

            private final String value;
            McpDiscoverResultServersItemSource(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }
    }
}
