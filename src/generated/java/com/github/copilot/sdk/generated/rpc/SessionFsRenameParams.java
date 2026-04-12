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

/** Request parameters for the {@code sessionFs.rename} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionFsRenameParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Source path using SessionFs conventions */
    @JsonProperty("src")
    private String src;

    /** Destination path using SessionFs conventions */
    @JsonProperty("dest")
    private String dest;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getSrc() { return src; }
    public void setSrc(String src) { this.src = src; }

    public String getDest() { return dest; }
    public void setDest(String dest) { this.dest = dest; }
}
