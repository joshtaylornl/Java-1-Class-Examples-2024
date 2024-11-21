package ca.nl.cna.java1.assignmenthelp.a5;

import java.util.Random;

public class FunWithPrimes {

    public static void main(String[] args) {
        System.out.println("Fun With Primes");

        System.out.print("Number\tFactors\t\tPrime?");

        Random random = new Random();
        //10 large numbers
        for (int i = 0; i < 100; i++) {
            printNumberDetails(random.nextInt(2, Integer.MAX_VALUE));
        }

    }

    /**
     * Print out the numbers information
     * @param n
     */
    public static void printNumberDetails(int n){
        System.out.printf("\n%d:\t\t %40s\t %b", n,
                PrimeNumberCalculator.getUniquePrimeFactorization(n),
                PrimeNumberCalculator.isPrime(n));
    }

}
