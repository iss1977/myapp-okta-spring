package com.okta.auth.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}


	@RestController
	static class SimpleController{

		@GetMapping
		String welcome (Principal principal){
			return "Hello,"+ principal.getName();
		}
	}

}
