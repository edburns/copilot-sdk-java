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

/** Request parameters for the {@code session.shell.kill} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionShellKillParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Process identifier returned by shell.exec */
    @JsonProperty("processId")
    private String processId;

    /** Signal to send (default: SIGTERM) */
    @JsonProperty("signal")
    private SessionShellKillParamsSignal signal;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getProcessId() { return processId; }
    public void setProcessId(String processId) { this.processId = processId; }

    public SessionShellKillParamsSignal getSignal() { return signal; }
    public void setSignal(SessionShellKillParamsSignal signal) { this.signal = signal; }


    /** Signal to send (default: SIGTERM) */
    public enum SessionShellKillParamsSignal {
        /** The {@code SIGTERM} variant. */
        SIGTERM("SIGTERM"),
        /** The {@code SIGKILL} variant. */
        SIGKILL("SIGKILL"),
        /** The {@code SIGINT} variant. */
        SIGINT("SIGINT");

        private final String value;
        SessionShellKillParamsSignal(String value) { this.value = value; }
        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() { return value; }
    }
}
