package com.attaditya.parkinglot.models;

import com.attaditya.parkinglot.enums.PaymentMode;
import com.attaditya.parkinglot.enums.PaymentStatus;

public class Payment extends BaseModel {
    private PaymentMode mode;
    private PaymentStatus status;
    private Long amount;

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
