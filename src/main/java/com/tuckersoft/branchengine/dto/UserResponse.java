package com.tuckersoft.branchengine.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.Instant;

public record UserResponse(Long id, String email, String displayName, String role, Instant createdAt) {}