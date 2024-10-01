package ca.nl.cna.java1.controlstructures.ifelse;

import java.util.Scanner;

/**
 * Simple application to demonstrate ELSE statements
 * <p><pre>
 *  Structure:
 *     <code>
 *  if(condition){
 *      //execute if condition is true
 *  } else {
 *      //execute if condition is false
 *  }
 *      </code>
 *  </pre></p>
 *
 * @author josh.taylor
 */
public class FunWithIfElseStatements {

    public static void main(String[] args) {
        System.out.println("Fun with ... IF ELSE Statements!");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = input.nextInt();

        if (x % 2 == 0) {
            System.out.println("The number is EVEN!");
        } else {
            System.out.println("The number is ODD!");
        }

    }

}
