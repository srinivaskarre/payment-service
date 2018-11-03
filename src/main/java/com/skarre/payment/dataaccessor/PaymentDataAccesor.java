package com.skarre.payment.dataaccessor;

import com.skarre.payment.dto.PaymentDTO;
import com.skarre.payment.testutls.TestingUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentDataAccesor {

    public List<PaymentDTO> getPaymentDetails(Long id){
        return TestingUtils.generateDummyPaymentData();
    }
}
