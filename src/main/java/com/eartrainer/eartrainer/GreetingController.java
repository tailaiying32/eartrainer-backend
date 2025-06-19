package com.eartrainer.eartrainer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private int idCounter = 0;

    public GreetingController() {
    }

    @GetMapping("/")
    public Greeting greeting(@RequestParam String name) {
        return new Greeting(idCounter++, String.format(template, name));
    }
}
