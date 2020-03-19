package com.maventest.pcks;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@EnableWebMvc
@Configuration
@ComponentScan("com.maventest.pcks")
public class MvcConfig extends WebMvcConfigurerAdapter {

}
