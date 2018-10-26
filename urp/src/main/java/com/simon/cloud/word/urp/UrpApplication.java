package com.simon.cloud.word.urp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = ("com.simon.cloud.word"))
public class UrpApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrpApplication.class, args);
	}

}
