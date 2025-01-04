package com.git_commit_therapy.emergency.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "application.emergency.task")
public class EmergencyTaskProperties {

    // Getters and setters
    private int cleanOldCall; // Time in seconds for the scheduled task
    private int maxOldCall;   // Maximum age in seconds for old calls

}