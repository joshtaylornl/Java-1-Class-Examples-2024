package ca.nl.cna.java1.controlstructures.loops.whileloops;

import java.util.Random;

/**
 * A simple class to demonstrate a do while loop
 */
public class FunWithDoWhileLoop {

    public static void main(String[] args) {

        //The algorithm for the corrupt DM who wants to slaughter your party!
        int roll;
        do {
            roll = rollDie();
            System.out.printf("\nRoll: %d", roll);
        } while (roll != 6);

    }

    /**
     * Roll a single die value between 1 and 6 with equal probability
     * @return d6 value between 1 and 6
     */
    public static int rollDie(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

}
