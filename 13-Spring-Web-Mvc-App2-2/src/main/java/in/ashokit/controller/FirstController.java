package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	@GetMapping("/welcome")
public ModelAndView getWelcomeMsg() {
	ModelAndView mav = new ModelAndView();
	mav.addObject("msg","Welcome to Spring Boot and Microservices");
	mav.setViewName("welcome");
	return mav;
	
}
	@GetMapping("/greet")
public ModelAndView getGreetMsg() {
	ModelAndView mav = new ModelAndView();
	mav.addObject("msg","Hello, Good Morning all of you.........");
	mav.setViewName("greet");
	return mav;
	
}
}