package com.practice.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UsermgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermgtApplication.class, args);
	}

}
