package org.sebsy.bestioles.config;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "bestioles.refuge")
@Validated
public record RefugeProperties(
        @NotBlank String nom,
        @Min(1) @Max(50) int capaciteMax,
        @NotBlank @Email String emailContact) {
}
