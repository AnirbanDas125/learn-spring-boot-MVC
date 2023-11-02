package com.anirban.learnspringbootMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping
	public String callingHome() {
		return "index.jsp";
	}
}
