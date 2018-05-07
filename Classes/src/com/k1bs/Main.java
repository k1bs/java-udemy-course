package com.k1bs;

public class Main {

    public static void main(String[] args) {
        // how to instantialize a Class.
        Car mustang = new Car();
        Car camaro = new Car();

        mustang.setModel("Fastback");
        System.out.println(mustang.getModel());
    }
}
