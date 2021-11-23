package edu.vinaenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.vinaenter.models.User;

@Controller
public class UserController {
	
	@Autowired
	private User user12;
	
	@GetMapping("user")
	public String user(Model model) {
		model.addAttribute("user", user12);
		return "user/index";
	}
}
