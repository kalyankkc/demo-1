package com.mindtree.hotelmanagement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mindtree.hotelmanagement.exceptions.HotelmanagementException;


@ControllerAdvice
public class Controllerhandler {
	
	@ExceptionHandler
	public String serviceExceptionHandler(HttpServletRequest req,HotelmanagementException e,Model model)
	{
		model.addAttribute("alert",e.getMessage());
		return "errorpage";
		
	}

}
