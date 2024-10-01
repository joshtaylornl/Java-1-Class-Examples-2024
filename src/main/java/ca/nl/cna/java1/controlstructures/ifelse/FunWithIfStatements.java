package ca.nl.cna.java1.controlstructures.ifelse;

import java.util.Scanner;

/**
 * Simple application to demonstrate IF statements
 * <p> <code> <pre>
 * Structure:
 *  if(condition){
 *      //execute if condition is true
 *  }
 * </pre> </code> </p>
 * @author josh.taylor
 */
public class FunWithIfStatements {

    public static void main(String[] args) {
        System.out.println("Fun with ... IF Statements!");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = input.nextInt();

        if(x % 2 == 0){
            System.out.println("The number is EVEN!");
        }

        if(x % 2 != 0 ){
            System.out.println("The number is ODD!");
        }
    }

}
