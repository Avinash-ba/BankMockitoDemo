package com.example.bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
class BankSpyBeanTest {

    @SpyBean
    private BankRepository bankRepository;

    @Autowired
    private BankService bankService;

    @Test
    void testGetBalance() {

        doReturn(5000.0)
                .when(bankRepository).getBalance();

        double result = bankService.getBalance();

        assertEquals(5000.0, result);
    }
}