package com.example.paymentserviceapplication.model.entity;

import com.example.paymentserviceapplication.model.enums.converter.RefundStatusConverter;
import com.example.paymentserviceapplication.model.enums.RefundStatus;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Refund extends BaseEntity {

    private BigDecimal refundedAmount;

    private String reason;

    @Convert(converter = RefundStatusConverter.class)
    private RefundStatus status;

    @ManyToOne
    @JoinColumn(name = "payment_transaction_id")
    private PaymentTransaction paymentTransaction;
}
