package ca.nl.cna.java1.assignmenthelp.a3;

public class FunWithProducts {

    public static void main(String[] args) {
        System.out.println("Fun with Products!");

        //This is an excellent example of a test product
        Product product = new Product(1, "T-Shirt", 19.95);

        product.setPrice(-12.35);       //This no longer works

        System.out.printf("Product info - Id: %d \t%s \t$%.2f",
                product.getId(), product.getDescription(), product.getPrice());

    }

}
