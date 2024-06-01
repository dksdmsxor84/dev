package dev.backoffice.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {
	
	@GetMapping("/")
	public String index() {
		
		log.debug("index start, {}");
		
		return "index.html";
	}

}
