package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AlienResource {

	@RequestMapping("aliens")
	public List<Alien> getAliens()
	{
		List<Alien> aliens=new ArrayList<Alien>();
		Alien a1=new Alien();
		a1.setId(101);
		a1.setName("taran");
		a1.setPoints(200);
		Alien a2=new Alien();
		a2.setId(102);
		a2.setName("Rishit");
		a2.setPoints(300);
		aliens.add(a1);
		aliens.add(a2);
		return aliens;
	}
}
