package ca.nl.cna.java1.helloworld;

import java.util.Scanner;

/**
 * In this example we will use simple console input from your keyboard
 * using a Scanner object to read integers
 *
 * @author josh.taylor
 */
public class FunWithConsoleInput {

    public static void main(String[] args) {
        //Create a scanner object pointed at System.in which is the cursor on the console
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int x = input.nextInt();

        System.out.println("Please enter a second number: ");
        int y = input.nextInt();

        int sum = x + y;

        //Printing out variable sum in a string. Note: %d for integers!
        System.out.printf("\nSum value is %d",  sum);

    }

}
