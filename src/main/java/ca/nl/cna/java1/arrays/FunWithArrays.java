package ca.nl.cna.java1.arrays;

import java.util.Random;

public class FunWithArrays {

    public static void main(String[] args) {
        System.out.println("Fun with Arrays!");

        //Let's play with an integer Array of size 10
        int[] array = new int[10];

        //Let's fill it with Randoms
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);     //Generates randoms between 0 and 99
        }

        printArray(array);

    }

    /**
     * Helper method to print an Array
     * @param array
     */
    public static void printArray(int[] array){
        System.out.printf("[%s]:\t %s", "Index", "Value\n");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]:\t\t %d\n", i, array[i]);
        }

    }

}
