package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	// this comment added from git bash 1
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot 👋";
    }

    @GetMapping("/name")
    public String welcome() {
        return "Hello Spring Boot welcome 👋";
    }
    //changes made by intellij.
}
