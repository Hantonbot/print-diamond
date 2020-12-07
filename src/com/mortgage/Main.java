package com.mortgage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int noOfRows = input.nextInt();

        rhombus(noOfRows);
        //lineOfChars(0, noOfRows, "*");
    }

    private static void rhombus(int noOfRows) {
        int midRow = noOfRows / 2;

        int noOfStars = 1;

        for (int i = 0; i < midRow; i++) {
            printChars(midRow - i, ' ');
            printChars(noOfStars, '*');
            System.out.println();
            noOfStars += 2;
        }

        for (int i = midRow; i >= 0; i--) {

            printChars(midRow - i, ' ');
            printChars(noOfStars, '*');
            System.out.println();
            noOfStars -= 2;
        }
    }

    private static void printChars(int noOfChars, char ch) {
        for (int i = 0; i < noOfChars; i++) {
            System.out.print("" + ch);
        }
    }

}