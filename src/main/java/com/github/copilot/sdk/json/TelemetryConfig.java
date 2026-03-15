/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

package com.github.copilot.sdk.json;

/**
 * OpenTelemetry configuration for the Copilot CLI server.
 * <p>
 * When set on {@link CopilotClientOptions#setTelemetry(TelemetryConfig)}, the
 * CLI server is started with OpenTelemetry instrumentation enabled. The
 * configuration maps to the following environment variables:
 *
 * <ul>
 * <li>{@link #setOtlpEndpoint(String)} →
 * {@code OTEL_EXPORTER_OTLP_ENDPOINT}</li>
 * <li>{@link #setFilePath(String)} →
 * {@code COPILOT_OTEL_FILE_EXPORTER_PATH}</li>
 * <li>{@link #setExporterType(String)} →
 * {@code COPILOT_OTEL_EXPORTER_TYPE}</li>
 * <li>{@link #setSourceName(String)} → {@code COPILOT_OTEL_SOURCE_NAME}</li>
 * <li>{@link #setCaptureContent(Boolean)} →
 * {@code OTEL_INSTRUMENTATION_GENAI_CAPTURE_MESSAGE_CONTENT}</li>
 * </ul>
 *
 * <h2>Example Usage</h2>
 *
 * <pre>{@code
 * var options = new CopilotClientOptions()
 * 		.setTelemetry(new TelemetryConfig().setOtlpEndpoint("http://localhost:4318").setExporterType("otlp-http"));
 * }</pre>
 *
 * @see CopilotClientOptions#setTelemetry(TelemetryConfig)
 * @since 1.1.0
 */
public class TelemetryConfig {

    private String otlpEndpoint;
    private String filePath;
    private String exporterType;
    private String sourceName;
    private Boolean captureContent;

    /**
     * Gets the OTLP exporter endpoint URL.
     *
     * @return the OTLP endpoint, or {@code null} if not set
     */
    public String getOtlpEndpoint() {
        return otlpEndpoint;
    }

    /**
     * Sets the OTLP exporter endpoint URL.
     * <p>
     * Maps to the {@code OTEL_EXPORTER_OTLP_ENDPOINT} environment variable.
     *
     * @param otlpEndpoint
     *            the OTLP endpoint URL (e.g., {@code "http://localhost:4318"})
     * @return this config instance for method chaining
     */
    public TelemetryConfig setOtlpEndpoint(String otlpEndpoint) {
        this.otlpEndpoint = otlpEndpoint;
        return this;
    }

    /**
     * Gets the file path for the file exporter.
     *
     * @return the file path, or {@code null} if not set
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the file path for the file exporter.
     * <p>
     * Maps to the {@code COPILOT_OTEL_FILE_EXPORTER_PATH} environment variable.
     *
     * @param filePath
     *            the output file path for telemetry data
     * @return this config instance for method chaining
     */
    public TelemetryConfig setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Gets the exporter type.
     *
     * @return the exporter type, or {@code null} if not set
     */
    public String getExporterType() {
        return exporterType;
    }

    /**
     * Sets the exporter type.
     * <p>
     * Maps to the {@code COPILOT_OTEL_EXPORTER_TYPE} environment variable. Typical
     * values are {@code "otlp-http"} or {@code "file"}.
     *
     * @param exporterType
     *            the exporter type string
     * @return this config instance for method chaining
     */
    public TelemetryConfig setExporterType(String exporterType) {
        this.exporterType = exporterType;
        return this;
    }

    /**
     * Gets the source name for telemetry spans.
     *
     * @return the source name, or {@code null} if not set
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the source name for telemetry spans.
     * <p>
     * Maps to the {@code COPILOT_OTEL_SOURCE_NAME} environment variable.
     *
     * @param sourceName
     *            the source name
     * @return this config instance for method chaining
     */
    public TelemetryConfig setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * Returns whether to capture message content as part of telemetry.
     *
     * @return {@code true} to capture content, {@code false} to suppress it, or
     *         {@code null} to use the default
     */
    public Boolean getCaptureContent() {
        return captureContent;
    }

    /**
     * Sets whether to capture message content as part of telemetry.
     * <p>
     * Maps to the {@code OTEL_INSTRUMENTATION_GENAI_CAPTURE_MESSAGE_CONTENT}
     * environment variable.
     *
     * @param captureContent
     *            {@code true} to capture content, {@code false} to suppress it
     * @return this config instance for method chaining
     */
    public TelemetryConfig setCaptureContent(Boolean captureContent) {
        this.captureContent = captureContent;
        return this;
    }
}
