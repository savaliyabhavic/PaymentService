package com.maa.microservice.services;

import com.maa.microservice.models.PaymentModel;
import com.maa.microservice.models.ReciptModel;
import com.maa.microservice.payment_types.CreditCard;
import com.maa.microservice.payment_types.DebitCard;
import com.maa.microservice.payment_types.NetBanking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private CreditCard creditCard;
    @Autowired
    private DebitCard debitCard;
    @Autowired
    private NetBanking netBanking;

    public ReciptModel doPayment(PaymentModel model){

        if (model.getType() == PaymentModel.PaymentType.CREDIT_CARD){
            return this.creditCard.doPayment(model);
        }else if (model.getType() == PaymentModel.PaymentType.DEBIT_CARD){
            return this.debitCard.doPayment(model);
        }else if (model.getType() == PaymentModel.PaymentType.NET_BANKING){
                return this.netBanking.doPayment(model);
        }
        return null;
    }

}
