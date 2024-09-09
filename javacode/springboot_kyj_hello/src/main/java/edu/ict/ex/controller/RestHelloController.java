package edu.ict.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloController {
	@GetMapping("/")
	public String hello() {
		return "안녕하세요";
	}
	
	@GetMapping("/hello")
	public String hello2() {
		return "<h1>Hello world</h1>";
	}
	@GetMapping("/h3")
	public String hello3() {
		return "<h1>홍길동</h1>";
	}
}
