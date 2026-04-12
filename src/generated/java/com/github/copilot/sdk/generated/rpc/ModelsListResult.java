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

/** Result for the {@code models.list} RPC method. */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelsListResult {

    /** List of available models with full metadata */
    @JsonProperty("models")
    private List<ModelsListResultModelsItem> models;

    public List<ModelsListResultModelsItem> getModels() { return models; }
    public void setModels(List<ModelsListResultModelsItem> models) { this.models = models; }


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ModelsListResultModelsItem {

        /** Model identifier (e.g., "claude-sonnet-4.5") */
        @JsonProperty("id")
        private String id;

        /** Display name */
        @JsonProperty("name")
        private String name;

        /** Model capabilities and limits */
        @JsonProperty("capabilities")
        private ModelsListResultModelsItemCapabilities capabilities;

        /** Policy state (if applicable) */
        @JsonProperty("policy")
        private ModelsListResultModelsItemPolicy policy;

        /** Billing information */
        @JsonProperty("billing")
        private ModelsListResultModelsItemBilling billing;

        /** Supported reasoning effort levels (only present if model supports reasoning effort) */
        @JsonProperty("supportedReasoningEfforts")
        private List<String> supportedReasoningEfforts;

        /** Default reasoning effort level (only present if model supports reasoning effort) */
        @JsonProperty("defaultReasoningEffort")
        private String defaultReasoningEffort;

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public ModelsListResultModelsItemCapabilities getCapabilities() { return capabilities; }
        public void setCapabilities(ModelsListResultModelsItemCapabilities capabilities) { this.capabilities = capabilities; }

        public ModelsListResultModelsItemPolicy getPolicy() { return policy; }
        public void setPolicy(ModelsListResultModelsItemPolicy policy) { this.policy = policy; }

        public ModelsListResultModelsItemBilling getBilling() { return billing; }
        public void setBilling(ModelsListResultModelsItemBilling billing) { this.billing = billing; }

        public List<String> getSupportedReasoningEfforts() { return supportedReasoningEfforts; }
        public void setSupportedReasoningEfforts(List<String> supportedReasoningEfforts) { this.supportedReasoningEfforts = supportedReasoningEfforts; }

        public String getDefaultReasoningEffort() { return defaultReasoningEffort; }
        public void setDefaultReasoningEffort(String defaultReasoningEffort) { this.defaultReasoningEffort = defaultReasoningEffort; }


        /** Model capabilities and limits */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class ModelsListResultModelsItemCapabilities {

            /** Feature flags indicating what the model supports */
            @JsonProperty("supports")
            private ModelsListResultModelsItemCapabilitiesSupports supports;

            /** Token limits for prompts, outputs, and context window */
            @JsonProperty("limits")
            private ModelsListResultModelsItemCapabilitiesLimits limits;

            public ModelsListResultModelsItemCapabilitiesSupports getSupports() { return supports; }
            public void setSupports(ModelsListResultModelsItemCapabilitiesSupports supports) { this.supports = supports; }

            public ModelsListResultModelsItemCapabilitiesLimits getLimits() { return limits; }
            public void setLimits(ModelsListResultModelsItemCapabilitiesLimits limits) { this.limits = limits; }


            /** Feature flags indicating what the model supports */
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonInclude(JsonInclude.Include.NON_NULL)
            public static class ModelsListResultModelsItemCapabilitiesSupports {

                /** Whether this model supports vision/image input */
                @JsonProperty("vision")
                private Boolean vision;

                /** Whether this model supports reasoning effort configuration */
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
            public static class ModelsListResultModelsItemCapabilitiesLimits {

                /** Maximum number of prompt/input tokens */
                @JsonProperty("max_prompt_tokens")
                private Double maxPromptTokens;

                /** Maximum number of output/completion tokens */
                @JsonProperty("max_output_tokens")
                private Double maxOutputTokens;

                /** Maximum total context window size in tokens */
                @JsonProperty("max_context_window_tokens")
                private Double maxContextWindowTokens;

                /** Vision-specific limits */
                @JsonProperty("vision")
                private ModelsListResultModelsItemCapabilitiesLimitsVision vision;

                public Double getMaxPromptTokens() { return maxPromptTokens; }
                public void setMaxPromptTokens(Double maxPromptTokens) { this.maxPromptTokens = maxPromptTokens; }

                public Double getMaxOutputTokens() { return maxOutputTokens; }
                public void setMaxOutputTokens(Double maxOutputTokens) { this.maxOutputTokens = maxOutputTokens; }

                public Double getMaxContextWindowTokens() { return maxContextWindowTokens; }
                public void setMaxContextWindowTokens(Double maxContextWindowTokens) { this.maxContextWindowTokens = maxContextWindowTokens; }

                public ModelsListResultModelsItemCapabilitiesLimitsVision getVision() { return vision; }
                public void setVision(ModelsListResultModelsItemCapabilitiesLimitsVision vision) { this.vision = vision; }


                /** Vision-specific limits */
                @JsonIgnoreProperties(ignoreUnknown = true)
                @JsonInclude(JsonInclude.Include.NON_NULL)
                public static class ModelsListResultModelsItemCapabilitiesLimitsVision {

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

        /** Policy state (if applicable) */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class ModelsListResultModelsItemPolicy {

            /** Current policy state for this model */
            @JsonProperty("state")
            private String state;

            /** Usage terms or conditions for this model */
            @JsonProperty("terms")
            private String terms;

            public String getState() { return state; }
            public void setState(String state) { this.state = state; }

            public String getTerms() { return terms; }
            public void setTerms(String terms) { this.terms = terms; }
        }

        /** Billing information */
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class ModelsListResultModelsItemBilling {

            /** Billing cost multiplier relative to the base rate */
            @JsonProperty("multiplier")
            private Double multiplier;

            public Double getMultiplier() { return multiplier; }
            public void setMultiplier(Double multiplier) { this.multiplier = multiplier; }
        }
    }
}
