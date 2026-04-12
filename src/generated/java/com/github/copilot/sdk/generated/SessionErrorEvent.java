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

/** The {@code session.error} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionErrorEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionErrorEventData data;

    public SessionErrorEventData getData() { return data; }
    public void setData(SessionErrorEventData data) { this.data = data; }

    /** Data payload for {@link SessionErrorEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionErrorEventData {

        /** Category of error (e.g., "authentication", "authorization", "quota", "rate_limit", "context_limit", "query") */
        @JsonProperty("errorType")
        private String errorType;

        /** Human-readable error message */
        @JsonProperty("message")
        private String message;

        /** Error stack trace, when available */
        @JsonProperty("stack")
        private String stack;

        /** HTTP status code from the upstream request, if applicable */
        @JsonProperty("statusCode")
        private Double statusCode;

        /** GitHub request tracing ID (x-github-request-id header) for correlating with server-side logs */
        @JsonProperty("providerCallId")
        private String providerCallId;

        /** Optional URL associated with this error that the user can open in a browser */
        @JsonProperty("url")
        private String url;

        public String getErrorType() { return errorType; }
        public void setErrorType(String errorType) { this.errorType = errorType; }

        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }

        public String getStack() { return stack; }
        public void setStack(String stack) { this.stack = stack; }

        public Double getStatusCode() { return statusCode; }
        public void setStatusCode(Double statusCode) { this.statusCode = statusCode; }

        public String getProviderCallId() { return providerCallId; }
        public void setProviderCallId(String providerCallId) { this.providerCallId = providerCallId; }

        public String getUrl() { return url; }
        public void setUrl(String url) { this.url = url; }
    }
}
