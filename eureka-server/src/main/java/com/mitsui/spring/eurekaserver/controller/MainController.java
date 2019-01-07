package com.mitsui.spring.eurekaserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/main")
public class MainController {

	@RequestMapping("/index")
	@ResponseBody
	public String index() {
		return "index12";
	}

}
