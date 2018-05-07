package com.k1bs;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println("10000 at " + (i + 2) + " % is equal to " + calculateInterest(10000, (i + 2)));
        }

        for (int i = 8; i >=2; i--) {
            System.out.println("10000 at " + i + " % is equal to " + calculateInterest(10000, i));
        }

        int counter = 0;

        for (int i = 7; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime!");
                counter++;
                if (counter == 3) {
                    System.out.println("found three primes!");
                    break;
                }
            }

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }

    public static boolean isPrime (int n) {
        if (n == 1) return false;

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
