package com.velocity.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	/*
	 * Design restful web service to return "This is executable jar" message on
	 * screen
	 */

	@GetMapping("/getMyService")
	public String getMyService() {
		return "This is My Service Page";
	}
}
