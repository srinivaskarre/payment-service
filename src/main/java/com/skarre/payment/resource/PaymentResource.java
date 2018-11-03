package com.skarre.payment.resource;

import com.skarre.payment.dto.PaymentDTO;
import com.skarre.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/rest/payment")
public class PaymentResource {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/get")
    public List<PaymentDTO> getPaymentById(){

        return paymentService.getPaymentData(1L);
    }

    @GetMapping("/test")
    public String getTestString(){

        return "from payment-service";
    }
}
