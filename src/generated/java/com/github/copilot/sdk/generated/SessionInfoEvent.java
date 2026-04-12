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

/** The {@code session.info} session event. */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class SessionInfoEvent extends SessionEvent {

    @JsonProperty("data")
    private SessionInfoEventData data;

    public SessionInfoEventData getData() { return data; }
    public void setData(SessionInfoEventData data) { this.data = data; }

    /** Data payload for {@link SessionInfoEvent}. */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionInfoEventData {

        /** Category of informational message (e.g., "notification", "timing", "context_window", "mcp", "snapshot", "configuration", "authentication", "model") */
        @JsonProperty("infoType")
        private String infoType;

        /** Human-readable informational message for display in the timeline */
        @JsonProperty("message")
        private String message;

        /** Optional URL associated with this message that the user can open in a browser */
        @JsonProperty("url")
        private String url;

        public String getInfoType() { return infoType; }
        public void setInfoType(String infoType) { this.infoType = infoType; }

        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }

        public String getUrl() { return url; }
        public void setUrl(String url) { this.url = url; }
    }
}
