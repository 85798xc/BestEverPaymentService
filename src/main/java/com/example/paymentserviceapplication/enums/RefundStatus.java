package com.example.paymentserviceapplication.enums;

public enum RefundStatus {
    COMPLETED,
    FAILED;

    public static RefundStatus fromString(String value) {
        if (value == null) {
            throw new NullPointerException("RefundStatus cannot be null");
        }
        try {
            return RefundStatus.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid RefundStatus: " + value, e);
        }
    }
}
