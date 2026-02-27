package com.gulshan.reviewservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gulshan.reviewservice.feign.ProductClient;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/{productId}")
    public String getReview(@PathVariable int productId) {

        String productDetails = productClient.getProduct(productId);

        return "Review for -> " + productDetails + " | Rating: 5 Stars";
    }
}