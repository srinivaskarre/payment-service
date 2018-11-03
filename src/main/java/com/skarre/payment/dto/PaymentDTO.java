package com.skarre.payment.dto;

/*
Payment DTO
 */
public class PaymentDTO {

    public String cardNumber;

    public String expDate;

    public PaymentDTO(String cardNumber, String expDate) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }

    public String getCardNumber() {

        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }
}
