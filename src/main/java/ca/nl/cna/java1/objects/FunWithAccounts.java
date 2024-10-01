package ca.nl.cna.java1.objects;

import java.util.Scanner;

/**
 * Simple class to play with the Accounts Class
 * //TODO migrate this out of package
 */
public class FunWithAccounts {

    public static void main(String[] args) {
        System.out.println("Fun with Accounts!");

        Account account = new Account("Josh's account", 1455.65);

        System.out.printf("\nAccount name: %s, balance: $%.2f", account.getName(), account.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("\nbEnter an amount of deposit: ");
        double amount = input.nextDouble();

        account.deposit(amount);

        System.out.printf("\nAccount name: %s, balance: $%.2f", account.getName(), account.getBalance());

    }

}
