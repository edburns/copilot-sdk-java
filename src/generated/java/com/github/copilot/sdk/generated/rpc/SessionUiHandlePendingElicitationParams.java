/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: api.schema.json

package com.github.copilot.sdk.generated.rpc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import javax.annotation.processing.Generated;

/** Request parameters for the {@code session.ui.handlePendingElicitation} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionUiHandlePendingElicitationParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** The unique request ID from the elicitation.requested event */
    @JsonProperty("requestId")
    private String requestId;

    /** The elicitation response (accept with form values, decline, or cancel) */
    @JsonProperty("result")
    private SessionUiHandlePendingElicitationParamsResult result;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }

    public SessionUiHandlePendingElicitationParamsResult getResult() { return result; }
    public void setResult(SessionUiHandlePendingElicitationParamsResult result) { this.result = result; }


    /** The elicitation response (accept with form values, decline, or cancel) */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionUiHandlePendingElicitationParamsResult {

        /** The user's response: accept (submitted), decline (rejected), or cancel (dismissed) */
        @JsonProperty("action")
        private SessionUiHandlePendingElicitationParamsResultAction action;

        /** The form values submitted by the user (present when action is 'accept') */
        @JsonProperty("content")
        private Map<String, Object> content;

        public SessionUiHandlePendingElicitationParamsResultAction getAction() { return action; }
        public void setAction(SessionUiHandlePendingElicitationParamsResultAction action) { this.action = action; }

        public Map<String, Object> getContent() { return content; }
        public void setContent(Map<String, Object> content) { this.content = content; }


        /** The user's response: accept (submitted), decline (rejected), or cancel (dismissed) */
        public enum SessionUiHandlePendingElicitationParamsResultAction {
            /** The {@code accept} variant. */
            ACCEPT("accept"),
            /** The {@code decline} variant. */
            DECLINE("decline"),
            /** The {@code cancel} variant. */
            CANCEL("cancel");

            private final String value;
            SessionUiHandlePendingElicitationParamsResultAction(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }
    }
}
