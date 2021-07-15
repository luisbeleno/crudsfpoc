package com.dane.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DanepocApplication {

	@Autowired
	CustomerRepository customRepo;
	
	@GetMapping("/test")
	public String test() {
		Customer custom = new Customer("Luis","Beleno","ing.luisfernando@gmail.com");
		customRepo.save(custom);
		
		return customRepo.findAll().stream().findFirst().toString();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DanepocApplication.class, args);
	}

}
