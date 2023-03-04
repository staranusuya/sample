package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringproject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringproject1Application.class, args);
		Akhiil a = context.getBean(Akhiil.class);
		a.show();
	}

}
