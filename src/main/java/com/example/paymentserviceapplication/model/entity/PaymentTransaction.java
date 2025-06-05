package com.example.paymentserviceapplication.model.entity;


import com.example.paymentserviceapplication.model.Refund;
import com.example.paymentserviceapplication.model.enums.PaymentTransactionStatus;
import com.example.paymentserviceapplication.model.enums.converter.PaymentTransactionConverter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "payment_transaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentTransaction extends BaseEntity{
    private BigDecimal amount;

    private String currency;

    @Convert(converter = PaymentTransactionConverter.class)
    private PaymentTransactionStatus paymentTransactionStatus;

    private String errorMessage;

    @ManyToOne
    @JoinColumn(name = "source_bank_account_id")
    private BankAccount sourceBankAccount;

    @ManyToOne
    @JoinColumn(name = "destination_bank_account_id")
    private BankAccount destinationBankAccount;

    @OneToMany(mappedBy = "paymentTransaction", cascade = CascadeType.ALL)
    private List<Refund> refunds;
}
