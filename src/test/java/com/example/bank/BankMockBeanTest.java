package com.example.bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class BankMockBeanTest {

    @MockBean
    private BankRepository bankRepository;

    @Autowired
    private BankService bankService;

    @Test
    void testGetBalance() {

        when(bankRepository.getBalance())
                .thenReturn(5000.0);

        double result = bankService.getBalance();

        assertEquals(5000.0, result);
    }
}