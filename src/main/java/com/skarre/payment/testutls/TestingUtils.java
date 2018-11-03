package com.skarre.payment.testutls;

import com.skarre.payment.dto.PaymentDTO;

import java.util.Arrays;
import java.util.List;

public class TestingUtils {

    public static List<PaymentDTO> generateDummyPaymentData() {
        return Arrays.asList(
                new PaymentDTO("123","10/11"),
                new PaymentDTO("123","10/11"),
                new PaymentDTO("123","10/11"),
                new PaymentDTO("123","10/11")
        );
    }
}
