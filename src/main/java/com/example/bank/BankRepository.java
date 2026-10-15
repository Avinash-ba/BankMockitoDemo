package com.example.bank;

import org.springframework.stereotype.Repository;

@Repository
public class BankRepository {

    public double getBalance() {
        return 1000.0;
    }
    public String getAccountType(String accountNumber) {
        return "SAVINGS";
    }
}