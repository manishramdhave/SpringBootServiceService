package com.velocity.model;

import java.util.List;

public class ServiceResponse {
    private String status;
    private String message;
    private String timestamp;
    private List<String> features;

    // Constructor
    public ServiceResponse(String status, String message, String timestamp, List<String> features) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
        this.features = features;
    }

    // Getters and Setters
    public String getStatus() { return status; }
    public String getMessage() { return message; }
    public String getTimestamp() { return timestamp; }
    public List<String> getFeatures() { return features; }
}
