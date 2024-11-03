package com.example.openshift.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class OpenshiftDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftDemoApplication.class, args);
	}

}
