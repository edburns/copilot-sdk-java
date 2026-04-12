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

/** Request parameters for the {@code sessionFs.setProvider} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionFsSetProviderParams {

    /** Initial working directory for sessions */
    @JsonProperty("initialCwd")
    private String initialCwd;

    /** Path within each session's SessionFs where the runtime stores files for that session */
    @JsonProperty("sessionStatePath")
    private String sessionStatePath;

    /** Path conventions used by this filesystem */
    @JsonProperty("conventions")
    private SessionFsSetProviderParamsConventions conventions;

    public String getInitialCwd() { return initialCwd; }
    public void setInitialCwd(String initialCwd) { this.initialCwd = initialCwd; }

    public String getSessionStatePath() { return sessionStatePath; }
    public void setSessionStatePath(String sessionStatePath) { this.sessionStatePath = sessionStatePath; }

    public SessionFsSetProviderParamsConventions getConventions() { return conventions; }
    public void setConventions(SessionFsSetProviderParamsConventions conventions) { this.conventions = conventions; }


    /** Path conventions used by this filesystem */
    public enum SessionFsSetProviderParamsConventions {
        /** The {@code windows} variant. */
        WINDOWS("windows"),
        /** The {@code posix} variant. */
        POSIX("posix");

        private final String value;
        SessionFsSetProviderParamsConventions(String value) { this.value = value; }
        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() { return value; }
    }
}
