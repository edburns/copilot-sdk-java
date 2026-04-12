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

/** Request parameters for the {@code session.ui.elicitation} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionUiElicitationParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Message describing what information is needed from the user */
    @JsonProperty("message")
    private String message;

    /** JSON Schema describing the form fields to present to the user */
    @JsonProperty("requestedSchema")
    private SessionUiElicitationParamsRequestedSchema requestedSchema;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public SessionUiElicitationParamsRequestedSchema getRequestedSchema() { return requestedSchema; }
    public void setRequestedSchema(SessionUiElicitationParamsRequestedSchema requestedSchema) { this.requestedSchema = requestedSchema; }


    /** JSON Schema describing the form fields to present to the user */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionUiElicitationParamsRequestedSchema {

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
