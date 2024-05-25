package com.lab.customer;

import com.lab.bank.BankAccount;

// Класс Customer представляет клиента банка
public class Customer {
    private String name;
    private BankAccount account;
    private int creditRating;
    private int age;
    private String number;

    public Customer(String name, BankAccount account, int creditRating, int age, String number) {
        this.name = name;
        this.account = account;
        this.creditRating = creditRating;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public int  getCreditRating() { return creditRating; }
    public int  getAge() { return age; }

    public String  getNumber() { return number; }

}