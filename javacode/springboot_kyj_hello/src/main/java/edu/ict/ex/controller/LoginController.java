package edu.ict.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.UserVO;


@Controller
@RequestMapping("login")
public class LoginController {

	@GetMapping("/form")
	public String formView() {

		return "login/form";
	}
	
	@PostMapping("/check")   //(HttpServletRequest req, Model model, UserVO user)
	public String check( Model model, UserVO user) {
		//String id=(String)req.getParameter("id");
		//String pw=(String)req.getParameter("pw");
		
		
		//user.setId(id);
		//user.setPw(pw);
		//UserVO user = new UserVO(id,pw); //${user.id}
		model.addAttribute("user",user);
		
//		model.addAttribute("id",id);
//		model.addAttribute("pw",pw);
		
		return "login/check";
	}

}
