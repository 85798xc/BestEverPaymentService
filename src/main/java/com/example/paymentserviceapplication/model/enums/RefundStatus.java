package com.example.paymentserviceapplication.model.enums;

public enum RefundStatus {
    COMPLETED,
    FAILED;

    public static RefundStatus fromString(String status) {
        if (status == null) {
            throw new NullPointerException("RefundStatus cannot be null");
        }
        for (RefundStatus refundStatus : RefundStatus.values()) {
            if (refundStatus.name().equalsIgnoreCase(status)) {
                return refundStatus;
            }
        }
        throw new IllegalArgumentException("Invalid RefundStatus: " + status);
    }
}
