package me.sidepjt.eatgo.interdaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {

    @GetMapping("/")
    public String hello() {
        return "Hello, world!";
    }
}
