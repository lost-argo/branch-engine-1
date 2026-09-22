package com.tuckersoft.branchengine.dto;

import jakarta.validation.constraints.*;
import java.time.Instant;
import java.util.List;

public record PlaythroughCreateRequest(
        @NotBlank @Size(min = 2, max = 40) String playerTag,
        @NotBlank String startNodeCode
) {}

