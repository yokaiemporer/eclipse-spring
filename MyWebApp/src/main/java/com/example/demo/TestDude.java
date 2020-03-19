package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestDude {

	@RequestMapping("disp")
	public String display()
	{
		System.out.print("yeap");
		return "home.jsp";
	}
}
