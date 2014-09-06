package com.expedia.lodging.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public 
	@ResponseBody
	String handleBusinessException(Exception ex) {
		return "Handled Business  Exception";
	}

}
