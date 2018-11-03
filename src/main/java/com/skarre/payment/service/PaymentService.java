package com.skarre.payment.service;

import com.skarre.payment.dataaccessor.PaymentDataAccesor;
import com.skarre.payment.dto.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentDataAccesor paymentDataAccesor;

    public List<PaymentDTO> getPaymentData(Long id){
        return paymentDataAccesor.getPaymentDetails(id);

    }
}
