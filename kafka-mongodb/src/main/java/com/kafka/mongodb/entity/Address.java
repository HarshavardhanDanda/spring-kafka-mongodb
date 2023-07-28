package com.kafka.mongodb.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {
    private String city;

    private String state;

    private String postalcode;
}
