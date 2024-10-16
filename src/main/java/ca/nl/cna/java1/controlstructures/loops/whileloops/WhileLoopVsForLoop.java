package ca.nl.cna.java1.controlstructures.loops.whileloops;

/**
 * Simple class to demonstrate the difference between while and for loops
 *
 * @author josh.taylor
 */
public class WhileLoopVsForLoop {


    public static void main(String[] args) {
        System.out.println("Comparing while loops with for loops");
        int LIMIT = 25;

        System.out.println("While version of the loop:");
        int i = 0;
        while(i < LIMIT){
            System.out.printf("%d, ", i);
            i++;
        }

        System.out.println("\n\nFor version of the loop:");
        for (int j = 0; j < LIMIT; j++) {
            System.out.printf("%d, ", j);
        }

    }

}
