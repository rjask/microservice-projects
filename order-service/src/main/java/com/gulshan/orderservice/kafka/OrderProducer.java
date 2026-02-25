package com.gulshan.orderservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.gulshan.orderservice.event.OrderEvent;

@Service
public class OrderProducer {

    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public void sendOrder(OrderEvent orderEvent) {
        kafkaTemplate.send("order-topic", orderEvent);
        System.out.println("Order Event Sent: " + orderEvent.getOrderId());
    }
}