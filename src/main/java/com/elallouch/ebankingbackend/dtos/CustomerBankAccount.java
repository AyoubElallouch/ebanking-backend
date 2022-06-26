package com.elallouch.ebankingbackend.dtos;

import lombok.Data;

@Data
public class CustomerBankAccount {
    String id;
    String type;

    public CustomerBankAccount(String id, String type) {
        this.id = id;
        this.type = type;
    }
}
