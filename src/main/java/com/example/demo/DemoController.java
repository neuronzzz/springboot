package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class DemoController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }

    @GetMapping("/dto")
    public DemoResponseDto getDto(@RequestParam String id) {
        return new DemoResponseDto();
    }

    @GetMapping("/dtos")
    public List<DemoResponseDto> getDtos(@RequestParam String name) {
        return new ArrayList<DemoResponseDto>();
    }

    @PostMapping("/dto")
    public void createDto(@RequestBody DemoRequestDto dto) {
        System.out.println(dto);
    }

    @PutMapping("/dto")
    public void updateDto(@RequestBody DemoRequestDto dto) {
        System.out.println(dto);
    }

    @DeleteMapping("/dto")
    public void deleteDto(@RequestParam String id) {

    }

    @DeleteMapping("/dtos")
    public void deleteDtos(@RequestParam String name) {

    }

}
