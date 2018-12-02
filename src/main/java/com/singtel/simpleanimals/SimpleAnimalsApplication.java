package com.singtel.simpleanimals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = { "com.singtel.simpleanimals" })
@ImportResource(locations = { "classpath:spring-mvc.xml" })
public class SimpleAnimalsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleAnimalsApplication.class, args);
    }
}
