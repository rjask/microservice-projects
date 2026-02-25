package com.gulshan.orderservice.event;

public class OrderEvent {

    private String orderId;
    private double amount;
    private String customer;

    public OrderEvent() {}

    public OrderEvent(String orderId, double amount, String customer) {
        this.orderId = orderId;
        this.amount = amount;
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}