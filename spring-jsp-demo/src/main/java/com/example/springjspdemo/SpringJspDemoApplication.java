package com.example.springjspdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.example.springjspdemo")
public class SpringJspDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJspDemoApplication.class, args);
	}

}
