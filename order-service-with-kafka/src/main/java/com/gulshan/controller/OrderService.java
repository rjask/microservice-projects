package com.gulshan.controller;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	public  String createOrder( OrderRequest orderRequest) {
		return "order created";
		
	}

}
