package com.k1bs;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while (count!=5) {
            System.out.println("count value is " + count);
            count++;
        }

        count = 1;

        do {
            System.out.println("Count value is " + count);
            count++;
        } while(count < 6);

        int number = 4;
        int finishNumber = 20;

        int evenCounter = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; // continue is like a break, except it goes back to the first part of the while loop
            }
            evenCounter++;
            System.out.println("Even number " + number);

            if (evenCounter >= 5) break;
        }
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        }

        return false;
    }
}
