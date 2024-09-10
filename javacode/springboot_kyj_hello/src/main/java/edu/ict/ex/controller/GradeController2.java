package edu.ict.ex.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.GradeVO2;





@Controller  
@RequestMapping("/grade2")
public class GradeController2 {
	
	@GetMapping("/input")
	public String input(GradeVO2 gradeVO2) {
	
		
		return "grade/input";
	}
	@PostMapping("/result")
	public String result(GradeVO2 gradeVO2) {
		System.out.println("=================");
		
		return "grade/result";
	}
	
	
}
