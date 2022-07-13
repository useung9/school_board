package spring.tendinous.school.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.tendinous.school.dto.User;

@RequestMapping("")
@Controller
public class HomeController {
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	// Home
	@GetMapping("/")
	public String Home(HttpSession session) {
		User user = new User();
		user.setId("id");
		session.setAttribute("user", user.getId());
		logger.info("home page");
		return "home";
	}
}
