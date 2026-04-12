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

/** Request parameters for the {@code sessionFs.rm} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionFsRmParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Path using SessionFs conventions */
    @JsonProperty("path")
    private String path;

    /** Remove directories and their contents recursively */
    @JsonProperty("recursive")
    private Boolean recursive;

    /** Ignore errors if the path does not exist */
    @JsonProperty("force")
    private Boolean force;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    public Boolean getRecursive() { return recursive; }
    public void setRecursive(Boolean recursive) { this.recursive = recursive; }

    public Boolean getForce() { return force; }
    public void setForce(Boolean force) { this.force = force; }
}
