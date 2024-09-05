package com.example.helloworldapi.exception;

public interface ErrorMessage {
    ErrorCode getErrorCode();
    Throwable getThrowable();
    String getMessage();
}
