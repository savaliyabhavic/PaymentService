package com.maa.microservice.controllers;

import com.maa.microservice.models.PaymentModel;
import com.maa.microservice.models.ReciptModel;
import com.maa.microservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService service;


    @PostMapping
    public ReciptModel doPayment(@RequestBody PaymentModel model){
        return this.service.doPayment(model);
    }



}