package com.school.SchoolApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SchoolApplication.class, args);
	}

}
