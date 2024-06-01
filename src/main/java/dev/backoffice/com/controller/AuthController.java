package dev.backoffice.com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import dev.backoffice.com.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class AuthController {
	
	@Autowired
	AuthService authService;

	@GetMapping("/system/authList")
	public ModelAndView authList(HttpServletRequest request, HttpServletResponse response,ModelMap model, Map<String, Object> param) throws Exception
	{
		
		ModelAndView mav = new ModelAndView();
		List<Map<String, Object>> list = authService.selectList(param);
		mav.addObject("lists", list);        
		//mav.setViewName("main/index");
		
		log.debug("param, {}", param);
		log.trace("trace log={}", param);
		log.trace("trace log2={}", param);
		
		return mav;
	}

}