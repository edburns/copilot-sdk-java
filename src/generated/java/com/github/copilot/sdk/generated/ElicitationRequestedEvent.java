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
import java.util.Map;
import javax.annotation.processing.Generated;

/** The {@code elicitation.requested} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class ElicitationRequestedEvent extends SessionEvent {

    @JsonProperty("data")
    private ElicitationRequestedEventData data;

    public ElicitationRequestedEventData getData() { return data; }
    public void setData(ElicitationRequestedEventData data) { this.data = data; }

    /** Data payload for {@link ElicitationRequestedEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ElicitationRequestedEventData {

        /** Unique identifier for this elicitation request; used to respond via session.respondToElicitation() */
        @JsonProperty("requestId")
        private String requestId;

        /** Tool call ID from the LLM completion; used to correlate with CompletionChunk.toolCall.id for remote UIs */
        @JsonProperty("toolCallId")
        private String toolCallId;

        /** The source that initiated the request (MCP server name, or absent for agent-initiated) */
        @JsonProperty("elicitationSource")
        private String elicitationSource;

        /** Message describing what information is needed from the user */
        @JsonProperty("message")
        private String message;

        /** Elicitation mode; "form" for structured input, "url" for browser-based. Defaults to "form" when absent. */
        @JsonProperty("mode")
        private ElicitationRequestedEventDataMode mode;

        /** JSON Schema describing the form fields to present to the user (form mode only) */
        @JsonProperty("requestedSchema")
        private ElicitationRequestedEventDataRequestedSchema requestedSchema;

        /** URL to open in the user's browser (url mode only) */
        @JsonProperty("url")
        private String url;

        public String getRequestId() { return requestId; }
        public void setRequestId(String requestId) { this.requestId = requestId; }

        public String getToolCallId() { return toolCallId; }
        public void setToolCallId(String toolCallId) { this.toolCallId = toolCallId; }

        public String getElicitationSource() { return elicitationSource; }
        public void setElicitationSource(String elicitationSource) { this.elicitationSource = elicitationSource; }

        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }

        public ElicitationRequestedEventDataMode getMode() { return mode; }
        public void setMode(ElicitationRequestedEventDataMode mode) { this.mode = mode; }

        public ElicitationRequestedEventDataRequestedSchema getRequestedSchema() { return requestedSchema; }
        public void setRequestedSchema(ElicitationRequestedEventDataRequestedSchema requestedSchema) { this.requestedSchema = requestedSchema; }

        public String getUrl() { return url; }
        public void setUrl(String url) { this.url = url; }


        /** Elicitation mode; "form" for structured input, "url" for browser-based. Defaults to "form" when absent. */
        public enum ElicitationRequestedEventDataMode {
            /** The {@code form} variant. */
            FORM("form"),
            /** The {@code url} variant. */
            URL("url");

            private final String value;
            ElicitationRequestedEventDataMode(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }

        /** JSON Schema describing the form fields to present to the user (form mode only) */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class ElicitationRequestedEventDataRequestedSchema {

            /** Schema type indicator (always 'object') */
            @JsonProperty("type")
            private String type;

            /** Form field definitions, keyed by field name */
            @JsonProperty("properties")
            private Map<String, Object> properties;

            /** List of required field names */
            @JsonProperty("required")
            private List<String> required;

            public String getType() { return type; }
            public void setType(String type) { this.type = type; }

            public Map<String, Object> getProperties() { return properties; }
            public void setProperties(Map<String, Object> properties) { this.properties = properties; }

            public List<String> getRequired() { return required; }
            public void setRequired(List<String> required) { this.required = required; }
        }
    }
}
