package com.k1bs;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;

        int previousResult = result;
        result = result - 1;

        result = result % 2;

        System.out.println(result);

        result++;
        result--;

        result += 2;

        System.out.println(result);

        result /= 1;

        System.out.println(result);

        boolean isAlien = false;

        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 90;

        if (topScore >= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;

        // && and || works the same as js

        if (topScore > secondTopScore && topScore < 100)
            System.out.println("greater than top, but less than 100");

        if (topScore > secondTopScore || topScore > 200)
            System.out.println("Super score!");

        int newVal = 50;

        boolean isCar = false;

        if (isAlien)
            System.out.println("nope");

        // Ternaries are the same as JS.
        boolean wasCar = isCar ? true : false;

        double myDouble = 20d;

        double secondDouble = 80d;

        double myTotal = (myDouble + secondDouble) * 25d;

        double myRealTotal = myTotal % 40;

        if (myRealTotal <= 20)
            System.out.println("Total was over the limit");

    }
}
