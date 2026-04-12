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

/** Request parameters for the {@code sessionFs.mkdir} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionFsMkdirParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Path using SessionFs conventions */
    @JsonProperty("path")
    private String path;

    /** Create parent directories as needed */
    @JsonProperty("recursive")
    private Boolean recursive;

    /** Optional POSIX-style mode for newly created directories */
    @JsonProperty("mode")
    private Double mode;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    public Boolean getRecursive() { return recursive; }
    public void setRecursive(Boolean recursive) { this.recursive = recursive; }

    public Double getMode() { return mode; }
    public void setMode(Double mode) { this.mode = mode; }
}
