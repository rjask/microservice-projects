package com.gulshan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/{id}")
    public String getProduct(@PathVariable int id) {
        return "Product ID: " + id + " | Name: Laptop | Price: 50000";
    }
}