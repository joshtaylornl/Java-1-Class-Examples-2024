package ca.nl.cna.java1.controlstructures.loops.forloop;

import java.util.Random;

/**
 * In class example to demonstrate the use of Java.util.Random
 * @author josh.taylor
 */
public class FunWithRandoms {

    public static void main(String[] args) {
        System.out.println("Fun with Randoms [Numbers]");

        Random random = new Random();

        //Generate 100 random die rolls
        System.out.println("Random die style roll: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d, ", random.nextInt(20) + 1);
        }

    }

}
