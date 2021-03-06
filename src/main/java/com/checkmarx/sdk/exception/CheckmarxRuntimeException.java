package com.checkmarx.sdk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Error has occurred")
public class CheckmarxRuntimeException extends RuntimeException {
    public CheckmarxRuntimeException() {
        super();
    }

    public CheckmarxRuntimeException(String message) {
        super(message);
    }

    public CheckmarxRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
