package com.practica.starter4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.starter3.model.Recurso;

@RestController
public class ConfigController {
	
	@Autowired Recurso r;
	
	@GetMapping("/validez")
	public String pruebaValidez() {
		return r.mostrarRecurso();
	}
//	
//	@GetMapping("/")
//	public String getOkey() {
//		return "ok";
//	}
	

}
