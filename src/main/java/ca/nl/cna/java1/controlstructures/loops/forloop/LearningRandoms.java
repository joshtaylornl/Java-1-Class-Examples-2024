package ca.nl.cna.java1.controlstructures.loops.forloop;

import java.util.Random;

public class LearningRandoms {

    public static void main(String[] args) {
        System.out.println("Learning how Random works...");

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.printf("\n%d Random value: %d", i, random.nextInt(100));
        }


    }

}
