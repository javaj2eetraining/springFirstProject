package com.example.springFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages =  {"com.example"})
@SpringBootApplication
public class SpringFirstProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringFirstProjectApplication.class, args);

		//creating the application context.
		//perform the scanning for components , configurations
		//start the embded tomcat web server if application is web applicaiton
	}

}
