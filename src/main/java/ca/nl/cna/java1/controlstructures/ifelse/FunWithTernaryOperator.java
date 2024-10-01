package ca.nl.cna.java1.controlstructures.ifelse;

import java.util.Scanner;

/**
 * Fun with the Ternary Operator.
 *
 *
 */
public class FunWithTernaryOperator {

    public static void main(String[] args) {

        System.out.println("Fun with ... IF Statements!");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = input.nextInt();

        //This is slick but it's not so easy to read and people might not understand
        //This are best used to avoid if/else return statements - we will see it later
        System.out.println( x % 2 == 0 ? "The number is EVEN!" : "The number is ODD!" );

        //Same as this...
        if(x % 2 == 0){
            System.out.println("The number is EVEN!");
        } else {
            System.out.println("The number is ODD!" );
        }

        /*

        //Very useful in this scenario
        //You have a method that has to return something based on a condition
        //Note: don't use it for boolean methods

        if(some condition){
            return variable;
        } else {
            return some other variable;
        }

        //looks better as:
        return some condition
            ? variable
            : some other variable

        */


    }

}
