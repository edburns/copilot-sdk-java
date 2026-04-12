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

/** Result for the {@code session.mode.get} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionModeGetResult {

    /** The current agent mode. */
    @JsonProperty("mode")
    private SessionModeGetResultMode mode;

    public SessionModeGetResultMode getMode() { return mode; }
    public void setMode(SessionModeGetResultMode mode) { this.mode = mode; }


    /** The current agent mode. */
    public enum SessionModeGetResultMode {
        /** The {@code interactive} variant. */
        INTERACTIVE("interactive"),
        /** The {@code plan} variant. */
        PLAN("plan"),
        /** The {@code autopilot} variant. */
        AUTOPILOT("autopilot");

        private final String value;
        SessionModeGetResultMode(String value) { this.value = value; }
        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() { return value; }
    }
}
