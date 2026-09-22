package com.tuckersoft.branchengine.playthrough.dto;

import jakarta.validation.constraints.*;

public record PlaythroughCreateRequest(
        @NotBlank @Size(min = 2, max = 40) String playerTag,
        @NotBlank String startNodeCode
) {}

