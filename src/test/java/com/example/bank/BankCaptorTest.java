package com.example.bank;

import com.example.bank.BankRepository;
import com.example.bank.BankService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BankCaptorTest {

    @Mock
    private BankRepository bankRepository;

    @InjectMocks
    private BankService bankService;

    @Captor
    private ArgumentCaptor<String> captor;

    @Test
    void testAccountNumber() {

        when(bankRepository.getAccountType("ACC123"))
                .thenReturn("SAVINGS");

        String result = bankService.getAccountType("ACC123");

        verify(bankRepository).getAccountType(captor.capture());

        assertEquals("ACC123", captor.getValue());
        assertEquals("SAVINGS", result);
    }
}
