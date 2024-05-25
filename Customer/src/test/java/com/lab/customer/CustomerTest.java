package com.lab.customer;

import com.lab.bank.BankAccount;
import com.lab.customer.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void testGetName() {
        BankAccount account = new BankAccount(1, 100.0);
        Customer customer = new Customer("Dasha", account, 0, 20,"123");
        assertEquals("Dasha", customer.getName());
    }

    @Test
    public void testGetCustomerAccountBalance() {
        BankAccount account = new BankAccount(1, 100.0);
        Customer customer = new Customer("Dasha", account, 0, 21, "456");
        assertEquals(100, customer.getAccount().getBalance());
    }

    @Test
    public void testGetCreditRating() {
        BankAccount account = new BankAccount(1, 100.0);
        Customer customer = new Customer("Dasha", account, 0, 23, "789");
        assertEquals(0, customer.getCreditRating());
    }
}
