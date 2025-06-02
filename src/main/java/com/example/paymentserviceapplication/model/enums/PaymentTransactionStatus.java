package com.example.paymentserviceapplication.model.enums;

import lombok.Getter;

@Getter
public enum PaymentTransactionStatus {
    PROCESSING, SUCCESS, FAILED;

    public static PaymentTransactionStatus fromString(String status) {
        for(PaymentTransactionStatus pts : PaymentTransactionStatus.values()) {
            if(pts.toString().equalsIgnoreCase(status)) {
                return pts;
            }
        }
        throw new IllegalArgumentException("Invalid Payment Transaction Status: " + status);
    }
}
