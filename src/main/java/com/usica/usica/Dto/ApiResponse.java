package com.usica.usica.Dto;


import lombok.Data;


@Data
public class ApiResponse<T> {
    private String message;
    private int responseCode;
    private T data;

    public ApiResponse() {} // no-args constructor

    public ApiResponse(String message, int responseCode, T data) {
        this.message = message;
        this.responseCode = responseCode;
        this.data = data;
    }
}
