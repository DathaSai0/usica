package com.usica.usica.Exceptions;



import com.usica.usica.Dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResponseException.class)
    public ResponseEntity<ApiResponse<Object>> handleResponseException(ResponseException ex) {
        ApiResponse<Object> response = new ApiResponse<>(ex.getMessage(), ex.getResponseCode(), null);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Object>> handleGenericException(Exception exce){
        ApiResponse<Object> errorResponse = new ApiResponse<>("Internal Server Error" , 500 , null);
        return ResponseEntity.badRequest().body(errorResponse);
    }

}
