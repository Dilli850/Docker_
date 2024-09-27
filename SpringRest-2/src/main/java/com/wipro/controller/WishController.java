package com.wipro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class WishController {
@GetMapping("/wish")
public String wishmap()
{
	return "hello world";
}
}
