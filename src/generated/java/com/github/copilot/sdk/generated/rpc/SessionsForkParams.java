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

/** Request parameters for the {@code sessions.fork} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionsForkParams {

    /** Source session ID to fork from */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Optional event ID boundary. When provided, the fork includes only events before this ID (exclusive). When omitted, all events are included. */
    @JsonProperty("toEventId")
    private String toEventId;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getToEventId() { return toEventId; }
    public void setToEventId(String toEventId) { this.toEventId = toEventId; }
}
