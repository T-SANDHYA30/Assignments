package com.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.validation.ValidationException;

@ControllerAdvice
public class GlobalExceptionClass {
	
	@ExceptionHandler(ItemNotFoundException.class)
	public ResponseEntity<String> handleItemNotFoundException(ItemNotFoundException ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<String> handleValidationException(Exception ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.CREATED);
	}

}
