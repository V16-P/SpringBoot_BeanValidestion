package com.example.BeanValidestion.Exception;

import java.net.http.HttpClient;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BeanValidationHandler {
//	MethodArgumentNotValidException
	@ExceptionHandler(value =MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
		
		Map<String, String> map=new HashMap<>();
		ex.getAllErrors().stream().forEach(r->{
			String name=((FieldError)r).getField();
			String erroemsg=r.getDefaultMessage();
			map.put(name, erroemsg);
		});
		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
		
	}
	
}
