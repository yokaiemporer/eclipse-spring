package com.example.demo;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Entity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@XmlRootElement
@Entity
//@Configuration
@Component
public class Alien {
	private String name;
	private int points;
	@Id
	int id;
	@Override
	public String toString() {
		return "Alien [name=" + name + ", points=" + points + ", id=" + id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
}
