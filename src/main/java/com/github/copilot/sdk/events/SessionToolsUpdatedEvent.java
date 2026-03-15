/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

package com.github.copilot.sdk.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Event: session.tools_updated
 * <p>
 * Emitted when the set of available tools for the session changes.
 *
 * @since 1.1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SessionToolsUpdatedEvent extends AbstractSessionEvent {

    @JsonProperty("data")
    private Object data;

    @Override
    public String getType() {
        return "session.tools_updated";
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
