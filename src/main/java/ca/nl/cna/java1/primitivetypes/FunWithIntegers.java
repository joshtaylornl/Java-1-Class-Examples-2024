package ca.nl.cna.java1.primitivetypes;

import java.util.Random;

/**
 * Primitive type int has support (Wrapper Class) Integer
 * Api 20 docs: https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Integer.html
 * Demonstrating some of the value of Integer class in this example.
 * @author josh.taylor
 */
public class FunWithIntegers {

    public static void main(String[] args) {
        System.out.println("Fun with Integers!");

        System.out.printf("\nLargest possible int: %d", Integer.MAX_VALUE);
        System.out.printf("\nSmallest possible int: %d", Integer.MIN_VALUE);

        //Generate a Random int
        Random random = new Random();
        System.out.printf("\nRandom value possible int: %d", random.nextInt());

    }

}
