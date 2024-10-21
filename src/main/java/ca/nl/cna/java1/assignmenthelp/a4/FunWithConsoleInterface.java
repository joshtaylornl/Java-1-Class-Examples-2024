package ca.nl.cna.java1.assignmenthelp.a4;

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
                System.out.println("Echo A");
            } else if (choice.equals("B")) {
                System.out.println("Echo B");
            } else {
                System.out.println("Not a valid choice! Try again!");
                System.out.println("Choice: " + choice);
            }


        } while ( !(choice.equals("Q") || choice.equals("q")) );




    }

    public static void printMenu(){
        System.out.println("Menu\n('A') Option A\n('B') Option B\n('C') Option C\n('Q') Quit\n");


    }

}
