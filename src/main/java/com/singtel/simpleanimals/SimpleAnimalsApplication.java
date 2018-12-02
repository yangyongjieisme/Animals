package com.singtel.simpleanimals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.singtel.simpleanimals" })

public class SimpleAnimalsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleAnimalsApplication.class, args);
    }
}
