package com.k1bs;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("That's a big number");
                break;
            default:
                System.out.println("Way too big!");
                break;
        }

        char myChar = 'A';

        switch(myChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("One of the first 5 letters");
                break;
            default:
                System.out.println("wasn't!");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("brr!");
                break;
            default:
                System.out.println("thank fuck it's not january");
                break;
        }
    }
}
