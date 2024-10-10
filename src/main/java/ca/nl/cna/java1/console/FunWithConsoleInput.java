package ca.nl.cna.java1.console;

import java.util.Scanner;

public class FunWithConsoleInput {

    public static void main(String[] args) {
        System.out.println("Fun with console input!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an int:");
        int i = input.nextInt();
        input.nextLine();   //This eats the dangling \n
        System.out.printf("Echo: %d\n", i);

        System.out.println("Enter an String:");
        String s = input.nextLine();
        System.out.printf("Echo: %s\n", s);

        System.out.println("Enter an Double:");
        double x = input.nextDouble();
        System.out.printf("Echo: %f\n", x);




    }


}
