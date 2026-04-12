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

/** Result for the {@code session.mcp.list} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionMcpListResult {

    /** Configured MCP servers */
    @JsonProperty("servers")
    private List<SessionMcpListResultServersItem> servers;

    public List<SessionMcpListResultServersItem> getServers() { return servers; }
    public void setServers(List<SessionMcpListResultServersItem> servers) { this.servers = servers; }


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionMcpListResultServersItem {

        /** Server name (config key) */
        @JsonProperty("name")
        private String name;

        /** Connection status: connected, failed, needs-auth, pending, disabled, or not_configured */
        @JsonProperty("status")
        private SessionMcpListResultServersItemStatus status;

        /** Configuration source: user, workspace, plugin, or builtin */
        @JsonProperty("source")
        private String source;

        /** Error message if the server failed to connect */
        @JsonProperty("error")
        private String error;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public SessionMcpListResultServersItemStatus getStatus() { return status; }
        public void setStatus(SessionMcpListResultServersItemStatus status) { this.status = status; }

        public String getSource() { return source; }
        public void setSource(String source) { this.source = source; }

        public String getError() { return error; }
        public void setError(String error) { this.error = error; }


        /** Connection status: connected, failed, needs-auth, pending, disabled, or not_configured */
        public enum SessionMcpListResultServersItemStatus {
            /** The {@code connected} variant. */
            CONNECTED("connected"),
            /** The {@code failed} variant. */
            FAILED("failed"),
            /** The {@code needs-auth} variant. */
            NEEDS_AUTH("needs-auth"),
            /** The {@code pending} variant. */
            PENDING("pending"),
            /** The {@code disabled} variant. */
            DISABLED("disabled"),
            /** The {@code not_configured} variant. */
            NOT_CONFIGURED("not_configured");

            private final String value;
            SessionMcpListResultServersItemStatus(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }
    }
}
