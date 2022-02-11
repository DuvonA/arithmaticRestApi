package com.creatifsphere.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {

	@RequestMapping("/")
	public ResponseEntity<String> index() {
		return ResponseEntity.ok("Greetings, What's today's mathmatics?")  ;
	}
	
	@RequestMapping("/status")
	public ResponseEntity<String> status() {
		return ResponseEntity.ok("up")  ;
	}
	
	@RequestMapping("/echo")
	public ResponseEntity<String> echo(@RequestParam("text")String text) {
		return ResponseEntity.ok("echo::::"+text)  ;
	}
	
}
