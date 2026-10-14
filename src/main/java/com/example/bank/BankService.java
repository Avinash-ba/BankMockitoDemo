package com.example.bank;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    private final BankRepository bankRepository;

    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    public double getBalance() {
        return bankRepository.getBalance();
    }
}