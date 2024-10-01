package com.wipro.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishMessage {
	@GetMapping("/map")
	public ResponseEntity<String> showMessage()
	{
		return new ResponseEntity<>("gm jrtp",HttpStatus.OK);
	}

}
