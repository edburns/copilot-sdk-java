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

/** Request parameters for the {@code sessionFs.writeFile} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionFsWriteFileParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Path using SessionFs conventions */
    @JsonProperty("path")
    private String path;

    /** Content to write */
    @JsonProperty("content")
    private String content;

    /** Optional POSIX-style mode for newly created files */
    @JsonProperty("mode")
    private Double mode;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Double getMode() { return mode; }
    public void setMode(Double mode) { this.mode = mode; }
}
