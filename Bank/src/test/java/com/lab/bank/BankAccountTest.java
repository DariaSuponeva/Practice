package com.lab.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(1, 100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testWithdrawSufficientFunds() {
        BankAccount account = new BankAccount(1, 100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(1, 100.0);
        account.withdraw(150.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testLockAccount() {
        BankAccount account = new BankAccount(1, 100.0);
        account.lockAccount();
        assertTrue(account.checkLocked());

        account.deposit(50.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testUnlockAccount() {
        BankAccount account = new BankAccount(1, 100.0);
        account.lockAccount();
        account.unlockAccount();
        assertFalse(account.checkLocked());
    }
}