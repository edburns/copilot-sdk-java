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

/** Result for the {@code session.agent.select} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionAgentSelectResult {

    /** The newly selected custom agent */
    @JsonProperty("agent")
    private SessionAgentSelectResultAgent agent;

    public SessionAgentSelectResultAgent getAgent() { return agent; }
    public void setAgent(SessionAgentSelectResultAgent agent) { this.agent = agent; }


    /** The newly selected custom agent */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionAgentSelectResultAgent {

        /** Unique identifier of the custom agent */
        @JsonProperty("name")
        private String name;

        /** Human-readable display name */
        @JsonProperty("displayName")
        private String displayName;

        /** Description of the agent's purpose */
        @JsonProperty("description")
        private String description;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getDisplayName() { return displayName; }
        public void setDisplayName(String displayName) { this.displayName = displayName; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
    }
}
