package com.goydykova.microservice.kafka.hello.kafkaMoicroserviceHello.RESTController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableKafka
@RequestMapping("hello")
public class HelloController {

    private final KafkaTemplate<String, Long> kafkaTemplate;

    @Autowired
    public HelloController(KafkaTemplate<String, Long> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping
    public String sayHello(String msgId, String number){

        kafkaTemplate.send("hello", "groupId", 1L);
        return "Добрый день!";
    }
}
