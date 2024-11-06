package ca.nl.cna.java1.assignmenthelp.a4;

public class FunWithFibonacci {

    public static void main(String[] args) {
        System.out.println("Fun with Fibonacci Numbers");

        int x = 0;


        FibonacciCalculator fibonacciCalculator1 = new FibonacciCalculator();
        FibonacciCalculator fibonacciCalculator2 = new FibonacciCalculator();

        System.out.println("Print the first 10 fibonacci numbers");
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n%d th fibonnaci number: %d", i, FibonacciCalculator.getFibonacciNumber(i));
        }

        System.out.println("\n\nCheck the first 25 numbers to be fibonacci numbers");
        for (int i = 0; i < 25; i++) {
            System.out.printf("Is %d a fibonnaci number? : %b\n", i, FibonacciCalculator.isFibonacciNumber(i));
        }

        /*
         * 2)	Create an application that application that does the following:
         * a.	Determines and displays all the Fibonacci numbers less than a value input by the user (ie. print all Fibonacci numbers up to 1,000)
         * b.	Prints n Fibonacci numbers (ie. Print the first 25 Fibonacci numbers)
         * c.	Checks to see if a number input by the user is a Fibonacci number (ie. Is 23 a Fibonacci number?
         * d.	Has a nice console interface to manage these options.
         */
    }

}
