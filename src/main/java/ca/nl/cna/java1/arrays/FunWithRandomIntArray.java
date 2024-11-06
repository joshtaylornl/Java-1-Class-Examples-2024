package ca.nl.cna.java1.arrays;

import java.util.Arrays;
import java.util.Random;

public class FunWithRandomIntArray {

    public static void main(String[] args) {
        System.out.println("Fun with Array's AND friends!");

        int[] randomInts = new int[10];     //Create a new Array of ints, length 10

        printIntArray(randomInts);  //Print out a bunch of 0's

        Random random = new Random();

        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = random.nextInt(100);
        }

        printIntArray(randomInts);  //Print out a bunch of Random ints in no order

        System.out.println("\nSorting the array....");
        Arrays.sort(randomInts);

        printIntArray(randomInts);

    }

    public static void printIntArray(int[] randomInts){
        for (int i = 0; i < randomInts.length; i++) {
            System.out.printf("\n[%d] -> %d", i, randomInts[i]);
        }
    }

}
