package com.k1bs;

public class Main {

    public static void main(String[] args) {
        BankAccount jenny = new BankAccount(12345, 0.00, "Jenny", "jenny@jenny.com", "55555");

        jenny.setBalance(800);

        jenny.deposit(40);

        jenny.withdrawal(900);
    }
}
