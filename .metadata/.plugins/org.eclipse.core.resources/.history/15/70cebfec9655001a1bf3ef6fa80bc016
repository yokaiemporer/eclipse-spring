package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test2 {
	@GetMapping(value = "/user/{name}")
	public void display(@PathVariable String name,@RequestParam("a") String b)
	{
		System.out.println(name+" "+b);
	}
}
