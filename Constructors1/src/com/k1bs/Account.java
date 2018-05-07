package com.k1bs;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String phoneNumber;
    private String email;

    public Account(String name, String phoneNumber, String email) {
        this("99999", 0, name, phoneNumber, email);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Account() {
        this("56789", 0, "Default", "555555555", "Default");
        System.out.println("default constructor called");
    }

    public Account(String number, double balance, String name, String phoneNumber, String email) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        System.out.println("Filled constructor called");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit (double depositAmt) {
        this.balance += depositAmt;
    }

    public void withdraw(double withdrawAmt) {
        if ((this.balance - withdrawAmt) < 0) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= withdrawAmt;
            System.out.println("New Balance is $" + this.balance);
        }
    }
}
