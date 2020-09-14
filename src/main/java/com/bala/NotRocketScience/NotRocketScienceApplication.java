package com.bala.NotRocketScience;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class NotRocketScienceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotRocketScienceApplication.class, args);
	}

	@GetMapping("/")
	public String receiveResult(@RequestParam(value = "msg",defaultValue = "") String msg ){
		log.info("--- index method invoked ---");
		return String.format("It's Not a Rocket Science %s", msg);
	}

}
