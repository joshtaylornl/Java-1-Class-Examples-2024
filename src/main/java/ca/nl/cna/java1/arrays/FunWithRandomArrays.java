package ca.nl.cna.java1.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Fun with Arrays. Printing, random generation and sorting using Arrays class.
 *
 * @author Josh
 */
public class FunWithRandomArrays {

    public static void main(String[] args) {
        System.out.println("Fun with Arrays...\n");
        final int BOUND = 10; //We are going to play with Arrays length 10

        int[] numberArray = new int[BOUND];

        randomizeValues(numberArray, 100);
        printArray(numberArray);

        //Sort the array
        Arrays.sort(numberArray);
        printArray(numberArray);

        //An Example of a hardcoded array
        int[] fibonacciSequenceFirstTen = {0,1,1,2,3,5,8,13,21,34};
        printArray(fibonacciSequenceFirstTen);

    }

    /**
     * Print the array's values to the screen
     * @param array integer array
     */
    public static void printArray(int[] array){
        System.out.println("Position \t Value");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%8d %8d\n", i, array[i]);
        }
    }

    /**
     * Randomize the values in the array passed in between 0 and limit (exclusive)
     * @param array array to randomize
     * @param limit limit of random values
     */
    public static void randomizeValues(int[] array, int limit){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(limit);
        }

    }

}
