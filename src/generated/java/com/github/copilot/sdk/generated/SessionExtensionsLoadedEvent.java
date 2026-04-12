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

/** The {@code session.extensions_loaded} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionExtensionsLoadedEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionExtensionsLoadedEventData data;

    public SessionExtensionsLoadedEventData getData() { return data; }
    public void setData(SessionExtensionsLoadedEventData data) { this.data = data; }

    /** Data payload for {@link SessionExtensionsLoadedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionExtensionsLoadedEventData {

        /** Array of discovered extensions and their status */
        @JsonProperty("extensions")
        private List<SessionExtensionsLoadedEventDataExtensionsItem> extensions;

        public List<SessionExtensionsLoadedEventDataExtensionsItem> getExtensions() { return extensions; }
        public void setExtensions(List<SessionExtensionsLoadedEventDataExtensionsItem> extensions) { this.extensions = extensions; }


        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionExtensionsLoadedEventDataExtensionsItem {

            /** Source-qualified extension ID (e.g., 'project:my-ext', 'user:auth-helper') */
            @JsonProperty("id")
            private String id;

            /** Extension name (directory name) */
            @JsonProperty("name")
            private String name;

            /** Discovery source */
            @JsonProperty("source")
            private SessionExtensionsLoadedEventDataExtensionsItemSource source;

            /** Current status: running, disabled, failed, or starting */
            @JsonProperty("status")
            private SessionExtensionsLoadedEventDataExtensionsItemStatus status;

            public String getId() { return id; }
            public void setId(String id) { this.id = id; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public SessionExtensionsLoadedEventDataExtensionsItemSource getSource() { return source; }
            public void setSource(SessionExtensionsLoadedEventDataExtensionsItemSource source) { this.source = source; }

            public SessionExtensionsLoadedEventDataExtensionsItemStatus getStatus() { return status; }
            public void setStatus(SessionExtensionsLoadedEventDataExtensionsItemStatus status) { this.status = status; }


            /** Discovery source */
            public enum SessionExtensionsLoadedEventDataExtensionsItemSource {
                /** The {@code project} variant. */
                PROJECT("project"),
                /** The {@code user} variant. */
                USER("user");

                private final String value;
                SessionExtensionsLoadedEventDataExtensionsItemSource(String value) { this.value = value; }
                @com.fasterxml.jackson.annotation.JsonValue
                public String getValue() { return value; }
            }

            /** Current status: running, disabled, failed, or starting */
            public enum SessionExtensionsLoadedEventDataExtensionsItemStatus {
                /** The {@code running} variant. */
                RUNNING("running"),
                /** The {@code disabled} variant. */
                DISABLED("disabled"),
                /** The {@code failed} variant. */
                FAILED("failed"),
                /** The {@code starting} variant. */
                STARTING("starting");

                private final String value;
                SessionExtensionsLoadedEventDataExtensionsItemStatus(String value) { this.value = value; }
                @com.fasterxml.jackson.annotation.JsonValue
                public String getValue() { return value; }
            }
        }
    }
}
