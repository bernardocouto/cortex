package com.bernardocouto.cortex.controller.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bernardocouto.cortex")
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
