package com.maa.microservice.models;

public class PaymentModel {

    public enum PaymentType {
        CREDIT_CARD, DEBIT_CARD, NET_BANKING
    }

    private int id;
    private PaymentType type;
    private String from;
    private String to;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    public String getFrom() { return from; }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
