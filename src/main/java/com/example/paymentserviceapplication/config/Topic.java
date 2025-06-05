package com.example.paymentserviceapplication.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Topic {
    private String topicName;

    private int partitions;

    private short replicationFactor;
}
