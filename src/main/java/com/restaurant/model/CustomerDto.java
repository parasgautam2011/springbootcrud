package com.restaurant.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDto {

    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private String ssn;
    private String homeAddress;
    private String telephone;
    private String email;
}
