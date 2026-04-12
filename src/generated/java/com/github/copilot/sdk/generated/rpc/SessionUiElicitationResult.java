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

/** Result for the {@code session.ui.elicitation} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionUiElicitationResult {

    /** The user's response: accept (submitted), decline (rejected), or cancel (dismissed) */
    @JsonProperty("action")
    private SessionUiElicitationResultAction action;

    /** The form values submitted by the user (present when action is 'accept') */
    @JsonProperty("content")
    private Map<String, Object> content;

    public SessionUiElicitationResultAction getAction() { return action; }
    public void setAction(SessionUiElicitationResultAction action) { this.action = action; }

    public Map<String, Object> getContent() { return content; }
    public void setContent(Map<String, Object> content) { this.content = content; }


    /** The user's response: accept (submitted), decline (rejected), or cancel (dismissed) */
    public enum SessionUiElicitationResultAction {
        /** The {@code accept} variant. */
        ACCEPT("accept"),
        /** The {@code decline} variant. */
        DECLINE("decline"),
        /** The {@code cancel} variant. */
        CANCEL("cancel");

        private final String value;
        SessionUiElicitationResultAction(String value) { this.value = value; }
        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() { return value; }
    }
}
