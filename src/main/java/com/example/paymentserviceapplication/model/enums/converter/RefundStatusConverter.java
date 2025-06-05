package com.example.paymentserviceapplication.model.enums.converter;

import com.example.paymentserviceapplication.model.enums.RefundStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RefundStatusConverter implements AttributeConverter<RefundStatus, String> {

    @Override
    public String convertToDatabaseColumn(RefundStatus status) {
        if (status == null) {
            return null;
        }
        return status.name();
    }

    @Override
    public RefundStatus convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        return RefundStatus.valueOf(dbData);
    }
}
