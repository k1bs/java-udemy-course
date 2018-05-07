package com.k1bs;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // how to create a constructor vv
    public BankAccount() {
        // "this" in this contexts calls the constructor given arguments, allowing you to default values
        this(56789, 0.00, "default name", "default address", "55555");
        System.out.println("Empty constructor called, filling default values");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with params called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double withdrawal(double amountToWithdraw) {
        if (this.balance >= amountToWithdraw && amountToWithdraw > 0) {
            this.balance -= amountToWithdraw;
            System.out.println("Amount withdrawn : " + amountToWithdraw);
            System.out.println("New Balance : " + this.balance);
        } else {
            System.out.println("Insufficient Funds");
        }

        return this.balance;
    }

    public double deposit(double amountToDeposit) {
        if (amountToDeposit > 0) {
            this.balance += amountToDeposit;
            System.out.println("Amount deposited : " + amountToDeposit);
        } else {
            System.out.println("Please enter a valid deposit amount");
        }

        return this.balance;
    }
}
