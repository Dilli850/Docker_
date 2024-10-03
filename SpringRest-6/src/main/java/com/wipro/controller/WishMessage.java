package com.wipro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishMessage {
	
	@GetMapping("/msg")
	public ResponseEntity<String> wishMessage()
	{
		String msg="hello world";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
