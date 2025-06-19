package com.eartrainer.eartrainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EartrainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EartrainerApplication.class, args);
    }

}
