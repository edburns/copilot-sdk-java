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

/** Result for the {@code session.extensions.list} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionExtensionsListResult {

    /** Discovered extensions and their current status */
    @JsonProperty("extensions")
    private List<SessionExtensionsListResultExtensionsItem> extensions;

    public List<SessionExtensionsListResultExtensionsItem> getExtensions() { return extensions; }
    public void setExtensions(List<SessionExtensionsListResultExtensionsItem> extensions) { this.extensions = extensions; }


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionExtensionsListResultExtensionsItem {

        /** Source-qualified ID (e.g., 'project:my-ext', 'user:auth-helper') */
        @JsonProperty("id")
        private String id;

        /** Extension name (directory name) */
        @JsonProperty("name")
        private String name;

        /** Discovery source: project (.github/extensions/) or user (~/.copilot/extensions/) */
        @JsonProperty("source")
        private SessionExtensionsListResultExtensionsItemSource source;

        /** Current status: running, disabled, failed, or starting */
        @JsonProperty("status")
        private SessionExtensionsListResultExtensionsItemStatus status;

        /** Process ID if the extension is running */
        @JsonProperty("pid")
        private Double pid;

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public SessionExtensionsListResultExtensionsItemSource getSource() { return source; }
        public void setSource(SessionExtensionsListResultExtensionsItemSource source) { this.source = source; }

        public SessionExtensionsListResultExtensionsItemStatus getStatus() { return status; }
        public void setStatus(SessionExtensionsListResultExtensionsItemStatus status) { this.status = status; }

        public Double getPid() { return pid; }
        public void setPid(Double pid) { this.pid = pid; }


        /** Discovery source: project (.github/extensions/) or user (~/.copilot/extensions/) */
        public enum SessionExtensionsListResultExtensionsItemSource {
            /** The {@code project} variant. */
            PROJECT("project"),
            /** The {@code user} variant. */
            USER("user");

            private final String value;
            SessionExtensionsListResultExtensionsItemSource(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }

        /** Current status: running, disabled, failed, or starting */
        public enum SessionExtensionsListResultExtensionsItemStatus {
            /** The {@code running} variant. */
            RUNNING("running"),
            /** The {@code disabled} variant. */
            DISABLED("disabled"),
            /** The {@code failed} variant. */
            FAILED("failed"),
            /** The {@code starting} variant. */
            STARTING("starting");

            private final String value;
            SessionExtensionsListResultExtensionsItemStatus(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }
    }
}
