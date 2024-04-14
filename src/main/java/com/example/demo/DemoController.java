package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }

    @PostMapping("/dto")
    public void createDto(@RequestBody DemoRequestDto dto) {
        System.out.println(dto);
    }

}
