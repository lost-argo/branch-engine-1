package com.tuckersoft.branchengine.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ApiException extends RuntimeException {
    private final HttpStatus status;
    private final String errorType;

    public ApiException(HttpStatus status, String errorType, String message) {
        super(message);
        this.status = status;
        this.errorType = errorType;
    }

    public static ApiException badRequest(String msg) { return new ApiException(HttpStatus.BAD_REQUEST, "BAD_REQUEST", msg); }
    public static ApiException notFound(String msg) { return new ApiException(HttpStatus.NOT_FOUND, "NOT_FOUND", msg); }
    public static ApiException conflict(String msg) { return new ApiException(HttpStatus.CONFLICT, "CONFLICT", msg); }
    public static ApiException forbidden(String msg) { return new ApiException(HttpStatus.FORBIDDEN, "FORBIDDEN", msg); }
    public static ApiException unauthorized(String msg) { return new ApiException(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", msg); }
}
