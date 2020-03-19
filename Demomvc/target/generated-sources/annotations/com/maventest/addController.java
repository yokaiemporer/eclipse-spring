package com.maventest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.maventest.service.addService;

@Controller
public class addController {
	@Autowired
	addService as;
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i ,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
	{
//		System.out.println("Iam here");
//		int i=Integer.parseInt(request.getParameter("t1"));
//		int j=Integer.parseInt(request.getParameter("t2"));
		int k;
		
		k=as.addnums(i,j);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
	}
}
