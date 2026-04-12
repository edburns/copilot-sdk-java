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

/** Result for the {@code session.plan.read} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionPlanReadResult {

    /** Whether the plan file exists in the workspace */
    @JsonProperty("exists")
    private Boolean exists;

    /** The content of the plan file, or null if it does not exist */
    @JsonProperty("content")
    private String content;

    /** Absolute file path of the plan file, or null if workspace is not enabled */
    @JsonProperty("path")
    private String path;

    public Boolean getExists() { return exists; }
    public void setExists(Boolean exists) { this.exists = exists; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }
}
