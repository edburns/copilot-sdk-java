/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: api.schema.json

package com.github.copilot.sdk.generated.rpc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;

/** Request parameters for the {@code session.mode.set} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionModeSetParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** The mode to switch to. Valid values: "interactive", "plan", "autopilot". */
    @JsonProperty("mode")
    private SessionModeSetParamsMode mode;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public SessionModeSetParamsMode getMode() { return mode; }
    public void setMode(SessionModeSetParamsMode mode) { this.mode = mode; }


    /** The mode to switch to. Valid values: "interactive", "plan", "autopilot". */
    public enum SessionModeSetParamsMode {
        /** The {@code interactive} variant. */
        INTERACTIVE("interactive"),
        /** The {@code plan} variant. */
        PLAN("plan"),
        /** The {@code autopilot} variant. */
        AUTOPILOT("autopilot");

        private final String value;
        SessionModeSetParamsMode(String value) { this.value = value; }
        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() { return value; }
    }
}
