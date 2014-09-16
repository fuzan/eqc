package com.expedia.lodging.connectivity.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ControllerAdvice
@EnableWebMvc
public class ControllerExceptionHandler{
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * customized error handling
	 * @param ex
	 * @return
	 */	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)  // 500
	@ExceptionHandler
	public ModelAndView handleServerException(Exception ex) {
		log.error(ex.getStackTrace().toString());
		ModelAndView model = new ModelAndView("error/error");
		return model;
	}
	
}
	

