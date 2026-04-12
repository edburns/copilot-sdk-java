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

/** Result for the {@code session.plugins.list} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionPluginsListResult {

    /** Installed plugins */
    @JsonProperty("plugins")
    private List<SessionPluginsListResultPluginsItem> plugins;

    public List<SessionPluginsListResultPluginsItem> getPlugins() { return plugins; }
    public void setPlugins(List<SessionPluginsListResultPluginsItem> plugins) { this.plugins = plugins; }


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionPluginsListResultPluginsItem {

        /** Plugin name */
        @JsonProperty("name")
        private String name;

        /** Marketplace the plugin came from */
        @JsonProperty("marketplace")
        private String marketplace;

        /** Installed version */
        @JsonProperty("version")
        private String version;

        /** Whether the plugin is currently enabled */
        @JsonProperty("enabled")
        private Boolean enabled;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getMarketplace() { return marketplace; }
        public void setMarketplace(String marketplace) { this.marketplace = marketplace; }

        public String getVersion() { return version; }
        public void setVersion(String version) { this.version = version; }

        public Boolean getEnabled() { return enabled; }
        public void setEnabled(Boolean enabled) { this.enabled = enabled; }
    }
}
