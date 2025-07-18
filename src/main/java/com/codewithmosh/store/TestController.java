package com.codewithmosh.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test")
    public String test() {
        System.out.println("Test page rendered");
        return "test.html";
    }
}
