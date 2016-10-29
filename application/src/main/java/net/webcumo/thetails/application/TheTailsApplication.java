package net.webcumo.thetails.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "net.webcumo.thetails")
public class TheTailsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TheTailsApplication.class, args);
    }
}
