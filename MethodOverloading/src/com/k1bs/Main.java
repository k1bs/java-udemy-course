package com.k1bs;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("k1bs", 500);
        System.out.println("new score is " + newScore);
        calculateScore(400);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(3, 5));
        System.out.println(calcFeetAndInchesToCentimeters(45));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player scored no points.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, double inches) {
        if (feet >= 0 && inches <= 12 && inches >= 0) {
            return ((feet * 12) + inches) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            int feet = (int) (inches / 12);
            return calcFeetAndInchesToCentimeters(feet, inches % 12);
        }
        return -1;
    }
}
