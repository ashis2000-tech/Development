package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/")
public String getWelcomeMsg(Model model) {
	String msgTxt = "Welcome to AshokIt.....................";
	model.addAttribute("msg", msgTxt);
	return "index";	
}
}
