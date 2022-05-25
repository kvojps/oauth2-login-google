package com.example.oauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String olaMundo() {
		return "Você ainda não está logado!";
	}
	
	@GetMapping("/restricted")
	public String restricted() {
		return "Você está logado!";
	}
}
