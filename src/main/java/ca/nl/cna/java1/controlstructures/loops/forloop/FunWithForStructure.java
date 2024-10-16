package ca.nl.cna.java1.controlstructures.loops.forloop;

/**
 * A simple class to show you how to properly demonstrate a for loop
 *
 * To count to N you can count from 1 to <= N or
 * you can count from 0 to <N
 *
 * I prefer the latter because it's consistent with Array and List positioning which is the
 * more common use of counter controlled iteration
 *
 * @author josh.taylor
 */
public class FunWithForStructure {

    public static final int LOOP_LIMIT = 15;

    public static void main(String[] args) {
        System.out.println("For loop structure!");

        System.out.println("To count to 10 you can count like this:");
        for (int i = 1; i <= LOOP_LIMIT; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\nBut it's better to count like this:");
        for (int i = 0; i < LOOP_LIMIT; i++) {
            System.out.printf("%d ", i);
        }

    }

}
