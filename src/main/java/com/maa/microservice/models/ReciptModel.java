package com.maa.microservice.models;

import java.time.LocalDateTime;

public class ReciptModel {

    private ReciptModel(){}

    private static int counter = 0;
    private int reciptNo;
    private LocalDateTime dateTime;
    private String from;
    private String to;
    private double amount;
    private PaymentModel.PaymentType method;
    private boolean payment;

    public static ReciptModel getRecipt(PaymentModel model){


        ReciptModel recipt = new ReciptModel();
        recipt.reciptNo = ++ReciptModel.counter;
        recipt.dateTime = LocalDateTime.now();
        recipt.from = model.getFrom();
        recipt.to = model.getTo();
        recipt.amount = model.getAmount();
        recipt.method = model.getType();
        recipt.payment = true;

        return recipt;
    }

    public int getReciptNo() {
        return reciptNo;
    }

    public void setReciptNo(int reciptNo) {
        this.reciptNo = reciptNo;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getFrom() {
        return from;
    }

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

    public PaymentModel.PaymentType getMethod() {
        return method;
    }

    public void setMethod(PaymentModel.PaymentType method) {
        this.method = method;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }
}
