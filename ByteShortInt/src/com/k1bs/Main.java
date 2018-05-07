package com.k1bs;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int myMin = -2147483648;
        int myMax = 2147483647;

        int myMinTotal = (myMin / 2);

        // byte has a width of 8
        byte myByte = 127;

        byte myByteTotal = (byte) (myByte / 2);

        // byte has a width of 16
        short myShort = 32767;

        short myShortTotal = (short) (myShort / 2);
//        System.out.println(myShortTotal);

        // long has a width of 64
        long myLong = 50000 + (10 * myByte) + myShort + myMinTotal;
        System.out.println(myLong);
    }
}
