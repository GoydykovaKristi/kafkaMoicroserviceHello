package com.goydykova.microservice.kafka.hello.kafkaMoicroserviceHello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KafkaMoicroserviceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaMoicroserviceHelloApplication.class, args);
	}

}
