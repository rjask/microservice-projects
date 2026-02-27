package com.gulshan.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class NotificationConsumerService {
	
	
	@KafkaListener(topics="order-placed" ,groupId = "cg1")
	public void consume(String message) {
		System.out.println("NotificationConsumerService.consume() received message :: " +  message);
		
		
	}

}
