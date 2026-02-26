package com.gulshan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders/")
public class OrderController {
	
	
	@Autowired
	OrderService orderService;
	
	
	@PostMapping("/place")
	public String placeOrder(@RequestBody OrderRequest orderRequest) {
		
	String response =	orderService.createOrder(orderRequest);
		
		return response;
	}

}
