package ca.nl.cna.java1.helloworld;

/**
 * A simple application to play around with Strings.
 * Demonstrating the newline ("\n"), tabe ("\t") and quote (\") special escape characters in Strings
 *
 * To learn more about Escape Characters visit: https://www.javatpoint.com/java-escape-characters
 *
 * @author josh.taylor
 */
public class FunWithStringEscapeCharacters {

    /**
     * Simple main method
     * @param args - none needed
     */
    public static void main(String[] args) {
        //Examples using the "\n" new line character
        System.out.println("Example 1) This \nis a \nMultiLine \nMeSsAgE!\n");

        //Example using the "\t" tab character
        System.out.println("Example 2) This is a tab ->\t<----");
        System.out.println("\ttabbed in line 1");
        System.out.println("\ttabbed in line 2\n");

        //Here is an example using the quote
        System.out.println("Example 3) Someone said \"To be or not to be! That is the question!\" but I can't remember who");

    }

}
