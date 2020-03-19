package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class Testdude {
	private int age;
	@Value("${value.from.file}")
	private String valueFromFile;
	private int height;
	@Autowired
	@Qualifier("lap1")
	private Laptop lappy;
	@Autowired
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Laptop getLappy() {
		return lappy;
	}
	public void setLappy(Laptop lappy) {
		this.lappy = lappy;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Testdude() {
		super();
		System.out.println("gdamn");
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
//	@Required
	
	public void ohyeah()
	{
		System.out.println("yes bro it works!");
		System.out.println(valueFromFile);
//		lappy.show();
		person.printo();
	}
}
