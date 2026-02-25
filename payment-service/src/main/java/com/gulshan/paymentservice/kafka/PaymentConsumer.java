package com.gulshan.paymentservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.gulshan.orderservice.event.OrderEvent;
@Service
public class PaymentConsumer {
	
    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void consume(OrderEvent orderEvent) {
        System.out.println("Payment Received Order: " 
            + orderEvent.getOrderId() 
            + " | Amount: " + orderEvent.getAmount()
            + " | Customer: " + orderEvent.getCustomer());
    }
}


