package edu.ict.ex.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.CircleVO;
import edu.ict.ex.vo.RectangleVO;
import edu.ict.ex.vo.TriangleVO;



@Controller
@RequestMapping("/shape")
public class ShapeController {

	@GetMapping("/form")
	public String form() {

		return "shape/area";
	}
	
	
	@PostMapping("/recArea")   //(HttpServletRequest req, Model model, UserVO user)
	public String recarea( RectangleVO rectangleVO ) {

	
		return "shape/recArea";
	}
	
	@PostMapping("/triArea")   //(HttpServletRequest req, Model model, UserVO user)
	public String triarea( TriangleVO triangleVO ) {

	
		return "shape/triArea";
	}
	@PostMapping("/circleArea")   //(HttpServletRequest req, Model model, UserVO user)
	public String circlearea( CircleVO circleVO ) {

	
		return "shape/circleArea";
	}
	
	//위에 shapeVO로하던지 밑에 모델 주석으로 하던지 결과같음
//	@PostMapping("/recArea")   //(HttpServletRequest req, Model model, UserVO user)
//	public String area( Model model, ShapeVO shape) {
//
//		model.addAttribute("shape",shape);
//	
//		return "shape/recArea";
//	}

}
