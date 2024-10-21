package ca.nl.cna.java1.console;

import java.util.Scanner;

public class FunWithConsoleInterface {

    public static void main(String[] args) {
        System.out.println("Fun with Consoles");

        Scanner input = new Scanner(System.in);

        String choice = "";

        do {
            printMenu();
            choice = input.next();

            if(choice.equals("A")){
                //TODO print out whatever....
                System.out.println("Echo A");
            } else if (choice.equals("B")) {
                //TODO do whatever menu says...
                System.out.println("Echo B");
            } else {
                System.out.println("Not a valid choice! Try again!");
                System.out.println("Choice: " + choice);
            }


        } while ( !(choice.equals("Q") || choice.equals("q")) );




    }

    public static void printMenu(){
        System.out.println("Fibonacci Number Menu\n" +
                "('A') Print all values up to 1,000\n" +
                "('B') Print N fibonacci numbers\n" +
                "('C') Option C\n" +
                "('Q') Quit\n");


    }

}
