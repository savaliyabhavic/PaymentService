package com.maa.microservice.payment_types;

import com.maa.microservice.models.PaymentModel;
import com.maa.microservice.models.ReciptModel;
import org.springframework.stereotype.Service;

@Service
public class CreditCard implements PaymentService {

    @Override
    public ReciptModel doPayment(PaymentModel pmodel) {
        return ReciptModel.getRecipt(pmodel);
    }
}
