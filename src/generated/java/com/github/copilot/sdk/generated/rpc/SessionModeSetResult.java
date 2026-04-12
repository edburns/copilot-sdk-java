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

/** Result for the {@code session.mode.set} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionModeSetResult {

    /** The agent mode after switching. */
    @JsonProperty("mode")
    private SessionModeSetResultMode mode;

    public SessionModeSetResultMode getMode() { return mode; }
    public void setMode(SessionModeSetResultMode mode) { this.mode = mode; }


    /** The agent mode after switching. */
    public enum SessionModeSetResultMode {
        /** The {@code interactive} variant. */
        INTERACTIVE("interactive"),
        /** The {@code plan} variant. */
        PLAN("plan"),
        /** The {@code autopilot} variant. */
        AUTOPILOT("autopilot");

        private final String value;
        SessionModeSetResultMode(String value) { this.value = value; }
        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() { return value; }
    }
}
