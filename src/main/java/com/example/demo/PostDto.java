package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;
}