package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

	@RequestMapping("/get")
	public String math() {
		return "basha";
	}
	@RequestMapping("/getPost")
	public String postCall(String a) {
		return "hi";
	}

}
