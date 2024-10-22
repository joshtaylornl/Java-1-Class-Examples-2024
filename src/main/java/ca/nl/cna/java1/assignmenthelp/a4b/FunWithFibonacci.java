package ca.nl.cna.java1.assignmenthelp.a4b;

public class FunWithFibonacci {

    public static void main(String[] args) {
        System.out.println("Fun with Fibonacci Numbers");

        int x = 0;

        System.out.println("Print the first 10 fibonacci numbers");
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n%d th fibonnaci number: %d", i, FibonacciCalculator.getFibonacciNumber(i));
        }

        System.out.println("\n\nCheck the first 25 numbers to be fibonacci numbers");
        for (int i = 0; i < 25; i++) {
            System.out.printf("Is %d a fibonnaci number? : %b\n", i, FibonacciCalculator.isFibonacciNumber(i));
        }

    }

}
