package ca.nl.cna.java1.assignmenthelp.a5;

public class FunWithPrimes {

    public static void main(String[] args) {
        System.out.println("Fun With Primes");

        System.out.print("Number\tFactors\t\tPrime?");
        //Checking the first 25 numbers for prime
        for (int i = 2; i < 25; i++) {
            System.out.printf("\n%d:\t\t %s\t\t\t %b", i,
                    PrimeNumberCalculator.getUniquePrimeFactorization(i),
                    PrimeNumberCalculator.isPrime(i));
        }

    }

}
