package com.creatifsphere.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.creatifsphere.domain.ArithmaticResponse;

@RestController

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


	@RequestMapping("/add")
	//num1 is for parameter reference inside the program,number1 is used to specify the value in the webpage path
	public ResponseEntity<Integer> Addition(@RequestParam("number1")Integer num1,@RequestParam("number2")Integer num2){

		return ResponseEntity.ok(num1.intValue()+num2.intValue());
	}

	//Multiplication endpoint
	@RequestMapping("/mult")
	public ResponseEntity<Integer> Multiply(@RequestParam("number1")Integer num1,@RequestParam("number2")Integer num2 ){
		return ResponseEntity.ok(num1.intValue()*num2.intValue());
	}

	//Division endpoint
	@RequestMapping("/div")
	public ResponseEntity<ArithmaticResponse> division(@RequestParam("number1")Integer num1,@RequestParam("number2")Integer num2){
		
		ArithmaticResponse resp = new ArithmaticResponse();
		try {
			resp.setResult((float) (num1/ num2));
		}
		catch(Exception e){
			e.printStackTrace();
			resp.setErrorMessage(e.getMessage());
		}
		return ResponseEntity.ok(resp);
	}

	//Subtraction endpoint
	@RequestMapping("/sub")
	public ResponseEntity<Integer> Subtraction(@RequestParam("number1")Integer num1,@RequestParam("number2")Integer num2){
		return ResponseEntity.ok(num1.intValue()-num2.intValue());
	}






	
}
