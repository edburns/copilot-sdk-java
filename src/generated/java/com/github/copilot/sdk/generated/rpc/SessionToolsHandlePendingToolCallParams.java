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

/** Request parameters for the {@code session.tools.handlePendingToolCall} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionToolsHandlePendingToolCallParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Request ID of the pending tool call */
    @JsonProperty("requestId")
    private String requestId;

    /** Tool call result (string or expanded result object) */
    @JsonProperty("result")
    private Object result;

    /** Error message if the tool call failed */
    @JsonProperty("error")
    private String error;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }

    public Object getResult() { return result; }
    public void setResult(Object result) { this.result = result; }

    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
}
