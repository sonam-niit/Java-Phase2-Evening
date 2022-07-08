package com.simplilearn.springbootdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionController {

	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> hanldeException(ProductNotFoundException ex){
		return new ResponseEntity<Object>("Product not available with Id 0",HttpStatus.NOT_FOUND);
	}
}
