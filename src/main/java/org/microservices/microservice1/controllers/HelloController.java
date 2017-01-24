package org.microservices.microservice1.controllers;

import javax.xml.ws.RespectBinding;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index(){
		return "microservice 1";
	}

}
