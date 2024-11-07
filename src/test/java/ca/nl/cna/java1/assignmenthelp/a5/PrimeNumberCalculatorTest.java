package ca.nl.cna.java1.assignmenthelp.a5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCalculatorTest {

    @Test
    void isPrime() {
        assertFalse(PrimeNumberCalculator.isPrime(0));
        assertFalse(PrimeNumberCalculator.isPrime(1));
        assertTrue(PrimeNumberCalculator.isPrime(2));
    }

    /**
     * Tests to ensure the first 25 primes works
     */
    @Test
    void checkPrimes(){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (int prime : primes) {
            assertTrue(PrimeNumberCalculator.isPrime(prime));
        }
    }

    @Test
    void getUniquePrimeFactorization() {
        //TODO
        fail();
    }
}