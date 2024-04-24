package com.lab.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BankTest {

    @Test
    public void testGetName() {
        Bank bank = new Bank("Test Bank");
        assertEquals("Test Bank", bank.getName());
    }
}