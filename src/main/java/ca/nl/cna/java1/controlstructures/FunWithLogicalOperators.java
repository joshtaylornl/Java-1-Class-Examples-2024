package ca.nl.cna.java1.controlstructures;

/**
 * Printing out the truth tables to demonstrate the logical operators
 *
 * @author josh.taylor
 */
public class FunWithLogicalOperators {

    public static void main(String[] args) {
        System.out.println("Fun with Logical Operators");

        //Printing out the && Truth Table
        System.out.printf("\nConditional AND (&&)");
        System.out.printf("\n%b && %b: %b", false, false, false && false);
        System.out.printf("\n%b && %b: %b", false, true, false && true);
        System.out.printf("\n%b && %b: %b", true, false, true && false);
        System.out.printf("\n%b && %b: %b", true, true, true && true);

        //Printing out the || Truth Table
        System.out.printf("\n\nConditional OR (||)");
        System.out.printf("\n%b || %b: %b", false, false, false || false);
        System.out.printf("\n%b || %b: %b", false, true, false || true);
        System.out.printf("\n%b || %b: %b", true, false, true || false);
        System.out.printf("\n%b || %b: %b", true, true, true || true);

        //Printing out the ^ Truth Table
        System.out.printf("\n\nLogical Exclusive OR (^)");
        System.out.printf("\n%b ^ %b: %b", false, false, false ^ false);
        System.out.printf("\n%b ^ %b: %b", false, true, false ^ true);
        System.out.printf("\n%b ^ %b: %b", true, false, true ^ false);
        System.out.printf("\n%b ^ %b: %b", true, true, true ^ true);

        //Printing out the NOT (!) Truth Table
        System.out.printf("\n\nLogical NOT (!)");
        System.out.printf("\n!%b : %b", false, !false);
        System.out.printf("\n!%b : %b", true, !true);
    }

}
