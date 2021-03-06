package com.mortgage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int noOfRows = input.nextInt();

        rhombus(noOfRows);
    }

    private static void rhombus(int noOfRows) {
        int midRow = noOfRows / 2;

        int columns = 1;

        for (int i = midRow; i > 0; i--) {
            //Printing i spaces at the beginning of each row
            int oddMidrow = midRow + 1;
            lineOfChars(columns, oddMidrow, " ");
            lineOfStars(columns);

            System.out.println();

            columns++;
        }


        for (int i = 0; i <= columns + i; i++) {
            //Printing i spaces at the beginning of each row
            int oddMidrow = midRow + 1;
            lineOfChars(columns, oddMidrow, " ");
            lineOfStars(columns);
            System.out.println();

            columns--;

        }
    }

    private static void lineOfChars(int numberOfChars, int numberOfRows, String symbol) {

        for (int i = 0; i < numberOfRows - numberOfChars; i++) {
            System.out.print(symbol);
        }

    }

    private static void lineOfStars(int row) {
        //Return
        int numberOfStars = row * 2 - 1;

        for (int j = 0; j < numberOfStars; j++) {
            System.out.print("*");
        }

    }

}