package com.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testControlador {
	
	
	@GetMapping("/")
	public String Login() {
		return "hola WORLD";
	}
}
