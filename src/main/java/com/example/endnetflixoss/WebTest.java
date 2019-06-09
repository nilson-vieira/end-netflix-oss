package com.example.endnetflixoss;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "poc-istio", produces = MediaType.APPLICATION_JSON_VALUE)
public class WebTest {
	
	@GetMapping("/admin")
	public ResponseEntity<Object> getAdmin(){
		String admin = "admin";
		Map<String, Object> testeJson = new LinkedHashMap<>();
		testeJson.put("role", admin);
		return new ResponseEntity<>(testeJson, HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<Object> getUser(){
		String admin = "user";
		Map<String, Object> testeJson = new LinkedHashMap<>();
		testeJson.put("role", admin);
		return new ResponseEntity<>(testeJson, HttpStatus.OK);
	}
	
}
