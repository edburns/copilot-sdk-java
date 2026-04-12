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

/** Request parameters for the {@code session.shell.exec} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionShellExecParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Shell command to execute */
    @JsonProperty("command")
    private String command;

    /** Working directory (defaults to session working directory) */
    @JsonProperty("cwd")
    private String cwd;

    /** Timeout in milliseconds (default: 30000) */
    @JsonProperty("timeout")
    private Double timeout;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getCommand() { return command; }
    public void setCommand(String command) { this.command = command; }

    public String getCwd() { return cwd; }
    public void setCwd(String cwd) { this.cwd = cwd; }

    public Double getTimeout() { return timeout; }
    public void setTimeout(Double timeout) { this.timeout = timeout; }
}
