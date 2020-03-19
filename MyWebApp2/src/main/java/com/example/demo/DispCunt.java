package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class DispCunt {
	@RequestMapping("add")
	public ModelAndView display(GenericParams params)
	{
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj", params);
		mv.setViewName("home");
		
		
		return mv;
	}
	
}
