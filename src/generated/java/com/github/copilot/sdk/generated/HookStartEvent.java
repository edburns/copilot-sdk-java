/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.sdk.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;

/** The {@code hook.start} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class HookStartEvent extends SessionEvent {

    @JsonProperty("data")
    private HookStartEventData data;

    public HookStartEventData getData() { return data; }
    public void setData(HookStartEventData data) { this.data = data; }

    /** Data payload for {@link HookStartEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class HookStartEventData {

        /** Unique identifier for this hook invocation */
        @JsonProperty("hookInvocationId")
        private String hookInvocationId;

        /** Type of hook being invoked (e.g., "preToolUse", "postToolUse", "sessionStart") */
        @JsonProperty("hookType")
        private String hookType;

        /** Input data passed to the hook */
        @JsonProperty("input")
        private Object input;

        public String getHookInvocationId() { return hookInvocationId; }
        public void setHookInvocationId(String hookInvocationId) { this.hookInvocationId = hookInvocationId; }

        public String getHookType() { return hookType; }
        public void setHookType(String hookType) { this.hookType = hookType; }

        public Object getInput() { return input; }
        public void setInput(Object input) { this.input = input; }
    }
}
