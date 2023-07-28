package com.mongo.springboot.mongospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.mongo.springboot.mongospringboot.repository")
@ComponentScan("com.mongo.springboot.mongospringboot.*")
public class MongospringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongospringbootApplication.class, args);
	}

}
