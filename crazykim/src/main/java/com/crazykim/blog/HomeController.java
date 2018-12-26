package com.crazykim.blog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		return "base";
	}
}