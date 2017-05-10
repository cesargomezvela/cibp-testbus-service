package com.dummy.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	@Value("${custom.message}")
	private String message;
	
	@RequestMapping("/showMessage")
	public String showMessage(){
		return message;
	}
}
