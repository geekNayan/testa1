package com.azure.testa1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/testa1")
public class Testa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Testa1Application.class, args);
	}

	@GetMapping("/result")
	public String getResult() {
		return "Hello World!";
	}

}
