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

/** Result for the {@code ping} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PingResult {

    /** Echoed message (or default greeting) */
    @JsonProperty("message")
    private String message;

    /** Server timestamp in milliseconds */
    @JsonProperty("timestamp")
    private Double timestamp;

    /** Server protocol version number */
    @JsonProperty("protocolVersion")
    private Double protocolVersion;

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Double getTimestamp() { return timestamp; }
    public void setTimestamp(Double timestamp) { this.timestamp = timestamp; }

    public Double getProtocolVersion() { return protocolVersion; }
    public void setProtocolVersion(Double protocolVersion) { this.protocolVersion = protocolVersion; }
}
