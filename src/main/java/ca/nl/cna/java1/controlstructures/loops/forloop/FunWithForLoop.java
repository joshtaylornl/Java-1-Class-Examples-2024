package ca.nl.cna.java1.controlstructures.loops.forloop;

public class FunWithForLoop {

    public static void main(String[] args) {
        System.out.println("Fun with For Loop");

        for (int i = 0; i < 10; i++) {
            System.out.printf("\n%d", i);
        }

        //The While Loop Equivalent
        int i = 0;  //Local to the method!
        while(i < 10){
            System.out.printf("\n%d", i);
            i++;
        }

    }

}
