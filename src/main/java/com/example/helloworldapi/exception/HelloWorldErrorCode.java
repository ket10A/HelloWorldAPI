package com.example.helloworldapi.exception;

public enum HelloWorldErrorCode implements ErrorCode {

    SystemError("2");

    private String errorCode;

    HelloWorldErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    @Override
    public String getCode() {
        return "sc-" + this.errorCode;
    }
}
