package com.k1bs;

public class Main {

    public static void main(String[] args) {
        // can't use reserved keywords

        // 1 mile is 1.609344 km

        double kilometers = 100 * 1.609344;

        if (kilometers == 40) {
            System.out.println("nope");
        }

        // if else

        if (kilometers > 40) {
            System.out.println("It's more than 40");
        } else if (kilometers >200) {
            System.out.println("Super huge@");
        } else {
            System.out.println("It's not more than 40");
        }
        // variables created in a block are inaccessible outside of the block

    }
}
