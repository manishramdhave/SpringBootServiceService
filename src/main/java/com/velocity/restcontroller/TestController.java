package com.velocity.restcontroller;

import com.velocity.model.ServiceResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.Arrays;

@RestController
public class TestController {

    /**
     * Enhanced Service Page returning detailed JSON metadata
     */
    @GetMapping("/get-my-service")
    public ServiceResponse getMyService() {
        return new ServiceResponse(
            "UP",
            "This is an executable Spring Boot Jar running in Kubernetes",
            LocalDateTime.now().toString(),
            Arrays.asList("REST API", "JSON Payload", "Health Monitoring", "Containerized")
        );
    }

    /**
     * Added Feature: Simple Health Check
     * Useful for Kubernetes Liveness/Readiness probes
     */
    @GetMapping("/health")
    public String checkHealth() {
        return "Service is healthy and responding from pod: " + System.getenv("HOSTNAME");
    }
}
