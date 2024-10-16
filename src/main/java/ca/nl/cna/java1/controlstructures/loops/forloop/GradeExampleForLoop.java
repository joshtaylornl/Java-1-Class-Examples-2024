package ca.nl.cna.java1.controlstructures.loops.forloop;

import java.util.Scanner;

/**
 * Implementing the GradeExample application using a for loop
 *
 * @author josh.taylor
 */
public class GradeExampleForLoop {

    public static void main(String[] args) {
        System.out.println("Counting grades with a for loop!");
        Scanner input = new Scanner(System.in);

        int total = 0;
        final int NUM_STUDENTS = 3;

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter a number: ");
            int x = input.nextInt();
            total += x;
        }

        System.out.printf("Class average: %d", total/NUM_STUDENTS);
    }
}
