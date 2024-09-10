package edu.ict.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ict.ex.vo.GradeVO;


@Controller  
@RequestMapping("/grade")
public class GradeController {
	
	@GetMapping("/total")
	public String write(Model model) {
		
		int kor =80;
		int eng =70;
		int math =60;
		
		GradeVO grade = new GradeVO(kor,eng,math);
		
		model.addAttribute("grade",grade);
		
		//model.addAttribute("kor",grade.getKor());
		//model.addAttribute("eng",grade.getEng());
		//model.addAttribute("math",grade.getMath());
		//model.addAttribute("total",grade.getTotal());
		
		
		return "grade/total";
	}
	
	//http://localhost:8282/grade/total2?kor=80&eng=60&math=100
	@GetMapping("/total2")
	public String total2(HttpServletRequest req,Model model) {
		
		int kor=Integer.valueOf(req.getParameter("kor"));
		int eng=Integer.valueOf(req.getParameter("eng"));
		int math=Integer.valueOf(req.getParameter("math"));
		GradeVO grade = new GradeVO(kor,eng,math);
	
		model.addAttribute("grade",grade);
	
		return "grade/total2";
	}
	
}
