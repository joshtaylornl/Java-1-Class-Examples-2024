package ca.nl.cna.java1.helloworld;

import java.util.Scanner;

/**
 * Having fun with the arithmetic operations
 */
public class FunWithArithmeticOperations {

    public static void main(String[] args) {
        System.out.println("Fun with Arithmetic Operations!");

        //Create a scanner object pointed at System.in which is the cursor on the console
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int x = input.nextInt();

        System.out.println("Please enter a second number: ");
        int y = input.nextInt();

        //Addition
        System.out.printf("\n %d + %d = %d",  x, y, x+y);

        //Subtraction
        System.out.printf("\n %d - %d = %d",  x, y, x-y);

        //Multiplication
        System.out.printf("\n %d * %d = %d",  x, y, x*y);

        //Division
        System.out.printf("\n %d / %d = %d",  x, y, x/y);

        //Remainder
        System.out.printf("\n %d %% %d = %d",  x, y, x%y);

    }

}
