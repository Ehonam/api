package fr.m2i.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "hello";
    }
    
    @GetMapping("/admin")
    public String admin() {
        return "hello admin";
    }
}