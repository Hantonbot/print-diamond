package com.mortgage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        int rows = input.nextInt();

        rhombus(rows);

    }

    public static void rhombus(int n)
    {

        int noOfRows = n;

        int midRow = (noOfRows)/2;

        //Initializing row with 1

        int row = 1;

        for (int i = midRow; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row

            lineOfChars(row, midRow+1," ");

            lineOfStars(row);

            System.out.println();

            //Incrementing the row

            row++;
        }

        //Printing lower half of the diamond

        for (int i = 0; i <= row+i; i++) {
            //Printing i spaces at the beginning of each row

            lineOfChars(row, midRow+1," ");

            lineOfStars(row);

            System.out.println();

            //Incrementing the row

            row--;

        }
    }

    public static void lineOfChars(int ii,int nn, String symbol){

        for(int j=1;j<=nn-ii;j++){

            System.out.print(" ");

        }

    }

    public static void lineOfStars(int numberOfStarsToPrint){

        for(int k=1;k<= numberOfStarsToPrint*2-1;k++) {

            System.out.print("*");

        }

    }

}