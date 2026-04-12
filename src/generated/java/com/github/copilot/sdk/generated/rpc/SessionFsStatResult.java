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

/** Result for the {@code sessionFs.stat} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionFsStatResult {

    /** Whether the path is a file */
    @JsonProperty("isFile")
    private Boolean isFile;

    /** Whether the path is a directory */
    @JsonProperty("isDirectory")
    private Boolean isDirectory;

    /** File size in bytes */
    @JsonProperty("size")
    private Double size;

    /** ISO 8601 timestamp of last modification */
    @JsonProperty("mtime")
    private String mtime;

    /** ISO 8601 timestamp of creation */
    @JsonProperty("birthtime")
    private String birthtime;

    public Boolean getIsFile() { return isFile; }
    public void setIsFile(Boolean isFile) { this.isFile = isFile; }

    public Boolean getIsDirectory() { return isDirectory; }
    public void setIsDirectory(Boolean isDirectory) { this.isDirectory = isDirectory; }

    public Double getSize() { return size; }
    public void setSize(Double size) { this.size = size; }

    public String getMtime() { return mtime; }
    public void setMtime(String mtime) { this.mtime = mtime; }

    public String getBirthtime() { return birthtime; }
    public void setBirthtime(String birthtime) { this.birthtime = birthtime; }
}
