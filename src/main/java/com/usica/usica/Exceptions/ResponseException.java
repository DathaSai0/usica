package com.usica.usica.Exceptions;

public class ResponseException extends RuntimeException {
    private int responseCode;

    public ResponseException(String message, int responseCode) {
        super(message);
        this.responseCode = responseCode;
    }

    public int getResponseCode() {
        return responseCode;
    }
}
