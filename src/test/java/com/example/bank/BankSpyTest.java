package com.example.bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BankSpyTest {

    @Spy
    private BankRepository bankRepository = new BankRepository();

    @Test
    void testSpy() {

        when(bankRepository.getBalance())
                .thenReturn(5000.0);

        double result = bankRepository.getBalance();

        assertEquals(5000.0, result);
    }
}