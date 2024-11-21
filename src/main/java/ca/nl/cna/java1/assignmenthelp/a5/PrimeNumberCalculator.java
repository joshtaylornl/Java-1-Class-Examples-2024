package ca.nl.cna.java1.assignmenthelp.a5;

/**
 * //TODO write a great intro!
 */
public class PrimeNumberCalculator {

    /**
     * Determine if a number is prime. (Returns false if less than or equal to 1)
     * @param n number
     * @return true if prime
     */
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        return n == getSmallestDivisor(n);
    }

    /**
     * Generate a unique product of primes for any number. Seperated by a space character
     * @param n number
     * @return string of primes seperated by a space
     */
    public static String getUniquePrimeFactorization(int n){
        int i = getSmallestDivisor(n);
   /*
        Ternary below is the same as this:
        if(i == n){ //It's prime and we are done
            return String.valueOf(i);
        } else { //It's not prime, add the divisor to the string and repeat
            return String.valueOf(i) + " " + getUniquePrimeFactorization(n/i);
        }
   */
        return i == n ? String.valueOf(i) : String.valueOf(i) + " " + getUniquePrimeFactorization(n/i);
    }

    /**
     * Get the smallest divisor of n. If n is prime then n will be the smallest divisor.
     * @param n number
     * @return smallest divisor
     */
    private static int getSmallestDivisor(int n){
        if(n <= 1){ //keep this?
            return n;
        }
        if(n % 2 == 0){ //check for even
            return 2;
        }
        if(n % 3 == 0){
            return 3;
        }

        //All the primes will be to the left or right of multiples of 6 (2*3)
        for (int i = 6; i < Math.sqrt(n); i+=6) {
            if(n % (i-1) == 0){
                return i-1;
            }
            if(n % (i+1) == 0){
                return i+1;
            }
        }

        return n;
    }


}
