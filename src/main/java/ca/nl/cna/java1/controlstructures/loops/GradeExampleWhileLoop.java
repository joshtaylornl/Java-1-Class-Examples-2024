package ca.nl.cna.java1.controlstructures.loops;

import java.util.Scanner;

/**
 * Fun with a while loop
 * <p>
 * A while loop looks like the following: <br/>
 * while(condition){ <br/>
 *     //Continue if the condition is true <br/>
 *     ...<br/>
 *     //do stuff that hopefully changes the condition<br/>
 * }<br/>
 * </p>
 * @author josh.taylor
 */
public class GradeExampleWhileLoop {

    public static void main(String[] args) {
        System.out.println("Fun with loops!");
        Scanner input = new Scanner(System.in);

        System.out.println("How many students?");
        int n = input.nextInt();

        int total = 0;
        int gradeCounter = 0;

        while(gradeCounter < n) {
            System.out.println("Enter a number: ");
            int x = input.nextInt();
            total += x;
            gradeCounter++;
        }

        System.out.printf("Class average: %d", total/n);
    }

}
