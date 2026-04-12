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

/** The {@code hook.end} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class HookEndEvent extends SessionEvent {

    @JsonProperty("data")
    private HookEndEventData data;

    public HookEndEventData getData() { return data; }
    public void setData(HookEndEventData data) { this.data = data; }

    /** Data payload for {@link HookEndEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class HookEndEventData {

        /** Identifier matching the corresponding hook.start event */
        @JsonProperty("hookInvocationId")
        private String hookInvocationId;

        /** Type of hook that was invoked (e.g., "preToolUse", "postToolUse", "sessionStart") */
        @JsonProperty("hookType")
        private String hookType;

        /** Output data produced by the hook */
        @JsonProperty("output")
        private Object output;

        /** Whether the hook completed successfully */
        @JsonProperty("success")
        private Boolean success;

        /** Error details when the hook failed */
        @JsonProperty("error")
        private HookEndEventDataError error;

        public String getHookInvocationId() { return hookInvocationId; }
        public void setHookInvocationId(String hookInvocationId) { this.hookInvocationId = hookInvocationId; }

        public String getHookType() { return hookType; }
        public void setHookType(String hookType) { this.hookType = hookType; }

        public Object getOutput() { return output; }
        public void setOutput(Object output) { this.output = output; }

        public Boolean getSuccess() { return success; }
        public void setSuccess(Boolean success) { this.success = success; }

        public HookEndEventDataError getError() { return error; }
        public void setError(HookEndEventDataError error) { this.error = error; }


        /** Error details when the hook failed */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class HookEndEventDataError {

            /** Human-readable error message */
            @JsonProperty("message")
            private String message;

            /** Error stack trace, when available */
            @JsonProperty("stack")
            private String stack;

            public String getMessage() { return message; }
            public void setMessage(String message) { this.message = message; }

            public String getStack() { return stack; }
            public void setStack(String stack) { this.stack = stack; }
        }
    }
}
