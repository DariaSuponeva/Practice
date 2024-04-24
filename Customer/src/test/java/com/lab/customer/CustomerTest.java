package com.lab.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.lab.bank.BankAccount;
import com.lab.customer.Customer;

public class CustomerTest {

    @Test
    public void testGetName() {
        BankAccount account = new BankAccount(1, 100.0);
        Customer customer = new Customer("Dasha", account, 0);
        assertEquals("Dasha", customer.getName());
    }

    @Test
    public void testGetCustomerAccountBalance() {
        BankAccount account = new BankAccount(1, 100.0);
        Customer customer = new Customer("Dasha", account, 0);
        assertEquals(100, customer.getAccount().getBalance());
    }

    @Test
    public void testGetCreditRating() {
        BankAccount account = new BankAccount(1, 100.0);
        Customer customer = new Customer("Dasha", account, 0);
        assertEquals(0, customer.getCreditRating());
    }
}
