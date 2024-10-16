package ca.nl.cna.java1.controlstructures.loops.forloop;

import java.util.Scanner;

/**
 * An adaption of an example in Ch 5 notes. This example uses the Math.pow() function
 */
public class FunWithInterest {

    public static void main(String[] args) {
        System.out.println("Fun with calculating compound interest....");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principle amount($): ");
        double initialValue = input.nextDouble();

        System.out.println("Enter the interest rate (fraction 0.0X): ");
        double r = input.nextDouble();

        System.out.println("Printing out 10 years of compounding interest: ");
        double x = initialValue;

        System.out.printf("Year \t\t Balance ($)\n");
        for (int i = 1; i < 11; i++) {  //Count from year 1 to 10
            /*
                How do you do X^2?
                You use Math.pow(x,2)
                -> lookup java.lang.Math on the Java API for more information
             */
            x = initialValue * Math.pow(1+r, i);
            System.out.printf("%d\t\t%10.2f\n", i, x);
        }



    }

}
