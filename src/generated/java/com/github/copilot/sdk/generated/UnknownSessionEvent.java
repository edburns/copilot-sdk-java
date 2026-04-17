/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.sdk.generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;

/**
 * Fallback for event types not yet known to this SDK version.
 *
 * <p>The {@link #getOriginalType()} method returns the raw event-type discriminator
 * value received on the wire, which can be used for forward-compatibility
 * telemetry and handling.
 *
 * @since 1.0.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public final class UnknownSessionEvent extends SessionEvent {

    @JsonProperty("type")
    private String originalType;

    /**
     * Returns the raw event-type discriminator string received on the wire,
     * or {@code "unknown"} if the value was not present in the JSON payload.
     *
     * @return the original wire type string, or {@code "unknown"}
     */
    @Override
    @JsonProperty("type")
    public String getType() { return originalType != null ? originalType : "unknown"; }

    /**
     * Returns the raw event-type discriminator string received on the wire.
     *
     * @return the original wire type string, or {@code null} if not present
     */
    @JsonIgnore
    public String getOriginalType() { return originalType; }

    public void setOriginalType(String originalType) { this.originalType = originalType; }
}
