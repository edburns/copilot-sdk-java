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

/** The {@code mcp.oauth_required} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class McpOauthRequiredEvent extends SessionEvent {

    @JsonProperty("data")
    private McpOauthRequiredEventData data;

    public McpOauthRequiredEventData getData() { return data; }
    public void setData(McpOauthRequiredEventData data) { this.data = data; }

    /** Data payload for {@link McpOauthRequiredEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class McpOauthRequiredEventData {

        /** Unique identifier for this OAuth request; used to respond via session.respondToMcpOAuth() */
        @JsonProperty("requestId")
        private String requestId;

        /** Display name of the MCP server that requires OAuth */
        @JsonProperty("serverName")
        private String serverName;

        /** URL of the MCP server that requires OAuth */
        @JsonProperty("serverUrl")
        private String serverUrl;

        /** Static OAuth client configuration, if the server specifies one */
        @JsonProperty("staticClientConfig")
        private McpOauthRequiredEventDataStaticClientConfig staticClientConfig;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public String getServerName() { return serverName; }
        public void setServerName(String serverName) { this.serverName = serverName; }

        public String getServerUrl() { return serverUrl; }
        public void setServerUrl(String serverUrl) { this.serverUrl = serverUrl; }

        public McpOauthRequiredEventDataStaticClientConfig getStaticClientConfig() { return staticClientConfig; }
        public void setStaticClientConfig(McpOauthRequiredEventDataStaticClientConfig staticClientConfig) { this.staticClientConfig = staticClientConfig; }


        /** Static OAuth client configuration, if the server specifies one */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class McpOauthRequiredEventDataStaticClientConfig {

            /** OAuth client ID for the server */
            @JsonProperty("clientId")
            private String clientId;

            /** Whether this is a public OAuth client */
            @JsonProperty("publicClient")
            private Boolean publicClient;

            public String getClientId() { return clientId; }
            public void setClientId(String clientId) { this.clientId = clientId; }

            public Boolean getPublicClient() { return publicClient; }
            public void setPublicClient(Boolean publicClient) { this.publicClient = publicClient; }
        }
    }
}
