package com.gulshan.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gulshan.orderservice.event.OrderEvent;
import com.gulshan.orderservice.kafka.OrderProducer;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderProducer producer;

    @PostMapping
    public String createOrder(@RequestBody OrderEvent orderEvent) {
        producer.sendOrder(orderEvent);
        return "Order Event Sent to Kafka!";
    }
}