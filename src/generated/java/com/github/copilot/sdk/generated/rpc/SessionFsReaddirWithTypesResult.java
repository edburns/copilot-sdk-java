/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: api.schema.json

package com.github.copilot.sdk.generated.rpc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;

/** Result for the {@code sessionFs.readdirWithTypes} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionFsReaddirWithTypesResult {

    /** Directory entries with type information */
    @JsonProperty("entries")
    private List<SessionFsReaddirWithTypesResultEntriesItem> entries;

    public List<SessionFsReaddirWithTypesResultEntriesItem> getEntries() { return entries; }
    public void setEntries(List<SessionFsReaddirWithTypesResultEntriesItem> entries) { this.entries = entries; }


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionFsReaddirWithTypesResultEntriesItem {

        /** Entry name */
        @JsonProperty("name")
        private String name;

        /** Entry type */
        @JsonProperty("type")
        private SessionFsReaddirWithTypesResultEntriesItemType type;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public SessionFsReaddirWithTypesResultEntriesItemType getType() { return type; }
        public void setType(SessionFsReaddirWithTypesResultEntriesItemType type) { this.type = type; }


        /** Entry type */
        public enum SessionFsReaddirWithTypesResultEntriesItemType {
            /** The {@code file} variant. */
            FILE("file"),
            /** The {@code directory} variant. */
            DIRECTORY("directory");

            private final String value;
            SessionFsReaddirWithTypesResultEntriesItemType(String value) { this.value = value; }
            @com.fasterxml.jackson.annotation.JsonValue
            public String getValue() { return value; }
        }
    }
}
