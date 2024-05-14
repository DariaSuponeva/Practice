package com.lab.main;

import com.lab.bank.Bank;
import com.lab.bank.BankAccount;
import com.lab.customer.Customer;

/* Написать программу для работы с банковскими счетами.
Программа должна позволять создавать новые счета, вносить и снимать деньги со счета,
а также показывать информацию о балансе счетов.*/
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        BankAccount account = new BankAccount(123456789, 1000);
        Customer customer = new Customer("Alice", account, 0);

        System.out.println("Welcome to " + bank.getName() + "!");
        System.out.println("Customer " + customer.getName() + " has account number " +
                customer.getAccount().getAccountNumber() +
                " with balance " + customer.getAccount().getBalance() + " USD");
        System.out.println("Customer credit rating is " + customer.getCreditRating());

        customer.getAccount().deposit(500);
        customer.getAccount().withdraw(200);
        customer.getAccount().lockAccount();
        customer.getAccount().deposit(10000);
        customer.getAccount().unlockAccount();
        customer.getAccount().withdraw(2000);
    }
}