package com.regex.matchregularexpression.exception;


import com.regex.matchregularexpression.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRegexException.class)
    public ResponseEntity<ApiResponse> handleGlobalException() {
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse(null,true));
    }

}
