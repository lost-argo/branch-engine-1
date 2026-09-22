package com.tuckersoft.branchengine.storynode.dto;

import jakarta.validation.constraints.*;

import java.time.Instant;

public record NodeCreateRequest(
        @NotBlank @Size(min = 3, max = 40) String nodeCode,
        @NotBlank @Size(min = 3, max = 80) String title,
        @NotBlank @Size(min = 10) String sceneText,
        @NotNull @Positive Integer branchCapacity,
        String primaryBranchCode,
        String glitchBranchCode
) {
    public static record NodeResponse(
            Long id, String nodeCode, String title, String sceneText,
            Integer branchCapacity, Integer currentBranches,
            String primaryBranchCode, String glitchBranchCode, Instant createdAt
    ) {}
}

