package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Comf {
 @Bean
 public Person person()
 {
	 return new Person();
 }
 
}
