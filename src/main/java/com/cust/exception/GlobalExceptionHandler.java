package com.cust.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomerNotFondException.class)
	public ResponseEntity<Object> handleCustomerNotFoundException(CustomerNotFondException ex){
		 ApiError apiError = new ApiError(
	                HttpStatus.NOT_FOUND.value(),
	                HttpStatus.NOT_FOUND.getReasonPhrase(),
	                ex.getMessage()
	        );
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND); //404
	}
	
	@ExceptionHandler(AdressNotFoundException.class)
	public ResponseEntity<Object> handleAdressNotFoundException(AdressNotFoundException ex){
		ApiError apiError = new ApiError(
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage()
        );
    return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND); //404
	}
}
