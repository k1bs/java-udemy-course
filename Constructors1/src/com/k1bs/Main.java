package com.k1bs;

public class Main {

    public static void main(String[] args) {
        Account alex = new Account();

        Account k1bs = new Account("12345", 0, "k1bs", "555555", "k1bs@email.com");

        alex.deposit(100.00);
        alex.withdraw(40.00);

        System.out.println(k1bs.getNumber());

        VipCustomer dixie = new VipCustomer("Dixie", "dixie@email.com");
        System.out.println(dixie.getCreditLimit());
        System.out.println(dixie.getName());
    }
}
