package ca.nl.cna.java1.assignmenthelp.a3;

public class FunWithProducts {

    public static void main(String[] args) {
        System.out.println("Fun with Products!");

        Product product = new Product(1, "T-Shirt", 19.95);

        product.setPrice(-12.35);

        System.out.printf("Product info - Id: %d \t%s \t$%.2f",
                product.getId(), product.getDescription(), product.getPrice());

    }

}
