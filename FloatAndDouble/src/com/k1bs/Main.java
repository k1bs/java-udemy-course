package com.k1bs;

public class Main {

    public static void main(String[] args) {

        // width of int is 32
        int myIntValue = 5 / 2;

        // width of float is 32
        float myFloatValue = 5f / 3f;

        // width of double is 64
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double weightInPounds = 4.256d;

        double weightInKilos = weightInPounds * 0.45359237d;

        System.out.println(weightInKilos);
    }
}
