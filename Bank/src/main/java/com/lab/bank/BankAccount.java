package com.lab.bank;

// Класс BankAccount представляет банковский счет
public class BankAccount {
    private int accountNumber;
    private double balance;
    private boolean isLocked; // Флаг, указывающий на состояние счета

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isLocked = false; // Изначально счет разблокирован
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean checkLocked() {
        return isLocked;
    }

    // Метод для блокировки счета
    public void lockAccount() {
        isLocked = true;
        System.out.println("Account " + accountNumber + " is locked.");
    }

    // Метод для разблокировки счета
    public void unlockAccount() {
        isLocked = false;
        System.out.println("Account " + accountNumber + " is unlocked.");
    }    

    public void deposit(double amount) {
        if (!isLocked) {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber);
        } else {
            System.out.println("Account " + accountNumber + " is locked. Cannot deposit.");
        }
    }

    public void withdraw(double amount) {
        if (!isLocked) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds in account " + accountNumber);
            }
        } else {
            System.out.println("Account " + accountNumber + " is locked. Cannot withdraw.");
        }
    }
}
