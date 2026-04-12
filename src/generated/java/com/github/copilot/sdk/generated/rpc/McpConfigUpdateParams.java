/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: api.schema.json

package com.github.copilot.sdk.generated.rpc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;

/** Request parameters for the {@code mcp.config.update} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class McpConfigUpdateParams {

    /** Name of the MCP server to update */
    @JsonProperty("name")
    private String name;

    /** MCP server configuration (local/stdio or remote/http) */
    @JsonProperty("config")
    private Object config;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Object getConfig() { return config; }
    public void setConfig(Object config) { this.config = config; }
}
