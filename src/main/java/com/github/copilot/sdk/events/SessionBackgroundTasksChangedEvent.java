/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

package com.github.copilot.sdk.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Event: session.background_tasks_changed
 * <p>
 * Emitted when the set of background tasks for the session changes.
 *
 * @since 1.1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SessionBackgroundTasksChangedEvent extends AbstractSessionEvent {

    @JsonProperty("data")
    private Object data;

    @Override
    public String getType() {
        return "session.background_tasks_changed";
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
