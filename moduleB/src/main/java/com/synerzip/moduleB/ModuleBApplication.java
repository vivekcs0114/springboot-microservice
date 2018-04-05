package com.synerzip.moduleB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ModuleBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleBApplication.class, args);
	}

	@RequestMapping("/")
	public String sayHello() {
		return "hello from moduleB!!";
	}
}
