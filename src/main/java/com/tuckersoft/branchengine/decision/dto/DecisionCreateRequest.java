package com.tuckersoft.branchengine.decision.dto;

import jakarta.validation.constraints.*;

public record DecisionCreateRequest(
        @NotNull Long playthroughId,
        @NotBlank @Size(min = 10) String rawInput,
        @NotBlank String impactLevel
) {}

