package ca.nl.cna.java1.primitivetypes;

import java.util.Scanner;

/**
 * Simple class to demonstrate int overflow problems.
 *
 * @author josh.taylor
 */
public class DemonstrateIntegerOverflow {

    public static void main(String[] args) {
        System.out.println("Fun with Comparisons!");
        Scanner input = new Scanner(System.in);

        int x = Integer.MAX_VALUE;
        System.out.printf("Max integer value: %d", x);


        //Calculating max ints in a loop
        int z = 1;
        //8 is the number of bits in a byte and there are 4 bytes in a java int
        //But one bit is used for +/-
        //So the max java in value is 2^(4*8-1) - 1 = 2^31 - 1 = 2147483647
        for (int i = 0; i < 4*8; i++) {
            System.out.printf("\nz: %d", z);
            z *= 2;

            System.out.printf(" -> 2 ^ %d = %.0f ", i, Math.pow(2, i));
        }

    }
}
