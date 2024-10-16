package ca.nl.cna.java1.controlstructures.loops.whileloops;

import java.util.Scanner;

public class FunWithForLoops {

    public static void main(String[] args) {
        System.out.println("Fun with For Loops");

        Scanner input = new Scanner(System.in);

        System.out.println("How many Whaddayats do you want?");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Whadda yat?");
        }

    }

}
