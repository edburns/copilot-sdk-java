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

/** Request parameters for the {@code session.model.switchTo} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionModelSwitchToParams {

    /** Target session identifier */
    @JsonProperty("sessionId")
    private String sessionId;

    /** Model identifier to switch to */
    @JsonProperty("modelId")
    private String modelId;

    /** Reasoning effort level to use for the model */
    @JsonProperty("reasoningEffort")
    private String reasoningEffort;

    /** Override individual model capabilities resolved by the runtime */
    @JsonProperty("modelCapabilities")
    private SessionModelSwitchToParamsModelCapabilities modelCapabilities;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getModelId() { return modelId; }
    public void setModelId(String modelId) { this.modelId = modelId; }

    public String getReasoningEffort() { return reasoningEffort; }
    public void setReasoningEffort(String reasoningEffort) { this.reasoningEffort = reasoningEffort; }

    public SessionModelSwitchToParamsModelCapabilities getModelCapabilities() { return modelCapabilities; }
    public void setModelCapabilities(SessionModelSwitchToParamsModelCapabilities modelCapabilities) { this.modelCapabilities = modelCapabilities; }


    /** Override individual model capabilities resolved by the runtime */
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SessionModelSwitchToParamsModelCapabilities {

        /** Feature flags indicating what the model supports */
        @JsonProperty("supports")
        private SessionModelSwitchToParamsModelCapabilitiesSupports supports;

        /** Token limits for prompts, outputs, and context window */
        @JsonProperty("limits")
        private SessionModelSwitchToParamsModelCapabilitiesLimits limits;

        public SessionModelSwitchToParamsModelCapabilitiesSupports getSupports() { return supports; }
        public void setSupports(SessionModelSwitchToParamsModelCapabilitiesSupports supports) { this.supports = supports; }

        public SessionModelSwitchToParamsModelCapabilitiesLimits getLimits() { return limits; }
        public void setLimits(SessionModelSwitchToParamsModelCapabilitiesLimits limits) { this.limits = limits; }


        /** Feature flags indicating what the model supports */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionModelSwitchToParamsModelCapabilitiesSupports {

            @JsonProperty("vision")
            private Boolean vision;

            @JsonProperty("reasoningEffort")
            private Boolean reasoningEffort;

            public Boolean getVision() { return vision; }
            public void setVision(Boolean vision) { this.vision = vision; }

            public Boolean getReasoningEffort() { return reasoningEffort; }
            public void setReasoningEffort(Boolean reasoningEffort) { this.reasoningEffort = reasoningEffort; }
        }

        /** Token limits for prompts, outputs, and context window */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SessionModelSwitchToParamsModelCapabilitiesLimits {

            @JsonProperty("max_prompt_tokens")
            private Double maxPromptTokens;

            @JsonProperty("max_output_tokens")
            private Double maxOutputTokens;

            /** Maximum total context window size in tokens */
            @JsonProperty("max_context_window_tokens")
            private Double maxContextWindowTokens;

            @JsonProperty("vision")
            private SessionModelSwitchToParamsModelCapabilitiesLimitsVision vision;

            public Double getMaxPromptTokens() { return maxPromptTokens; }
            public void setMaxPromptTokens(Double maxPromptTokens) { this.maxPromptTokens = maxPromptTokens; }

            public Double getMaxOutputTokens() { return maxOutputTokens; }
            public void setMaxOutputTokens(Double maxOutputTokens) { this.maxOutputTokens = maxOutputTokens; }

            public Double getMaxContextWindowTokens() { return maxContextWindowTokens; }
            public void setMaxContextWindowTokens(Double maxContextWindowTokens) { this.maxContextWindowTokens = maxContextWindowTokens; }

            public SessionModelSwitchToParamsModelCapabilitiesLimitsVision getVision() { return vision; }
            public void setVision(SessionModelSwitchToParamsModelCapabilitiesLimitsVision vision) { this.vision = vision; }


            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonInclude(JsonInclude.Include.NON_NULL)
            public static class SessionModelSwitchToParamsModelCapabilitiesLimitsVision {

                /** MIME types the model accepts */
                @JsonProperty("supported_media_types")
                private List<String> supportedMediaTypes;

                /** Maximum number of images per prompt */
                @JsonProperty("max_prompt_images")
                private Double maxPromptImages;

                /** Maximum image size in bytes */
                @JsonProperty("max_prompt_image_size")
                private Double maxPromptImageSize;

                public List<String> getSupportedMediaTypes() { return supportedMediaTypes; }
                public void setSupportedMediaTypes(List<String> supportedMediaTypes) { this.supportedMediaTypes = supportedMediaTypes; }

                public Double getMaxPromptImages() { return maxPromptImages; }
                public void setMaxPromptImages(Double maxPromptImages) { this.maxPromptImages = maxPromptImages; }

                public Double getMaxPromptImageSize() { return maxPromptImageSize; }
                public void setMaxPromptImageSize(Double maxPromptImageSize) { this.maxPromptImageSize = maxPromptImageSize; }
            }
        }
    }
}
