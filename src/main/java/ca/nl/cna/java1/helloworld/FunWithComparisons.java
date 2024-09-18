package ca.nl.cna.java1.helloworld;

import java.util.Scanner;

/**
 * Simple class to have fun with if statements*
 * Based on an example from the Ch 2 notes.
 */
public class FunWithComparisons {

    public static void main(String[] args) {
        System.out.println("Fun with Comparisons!");

        //Create a scanner object pointed at System.in which is the cursor on the console
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int x = input.nextInt();

        System.out.println("Please enter a second number: ");
        int y = input.nextInt();

        if(x == y){
            System.out.printf("\n%d == %d", x, y);
        }

        if(x != y){
            System.out.printf("\n%d != %d", x, y);
        }

        if(x < y){
            System.out.printf("\n%d < %d", x, y);
        }

        if(x > y){
            System.out.printf("\n%d > %d", x, y);
        }

        if(x <= y){
            System.out.printf("\n%d <= %d", x, y);
        }

        if(x >= y){
            System.out.printf("\n%d >= %d", x, y);
        }


    }

}
