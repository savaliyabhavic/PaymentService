package com.maa.microservice.payment_types;

import com.maa.microservice.models.PaymentModel;
import com.maa.microservice.models.ReciptModel;

public interface PaymentService {

    abstract ReciptModel doPayment(PaymentModel pmodel);

}
