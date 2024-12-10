package ca.nl.cna.java1.assignmenthelp.project;

public class FunWithProducts {

    public static void main(String[] args) {
        System.out.println("Fun with Products!");

        BillableItemsDatabase billableItemsDatabase = new BillableItemsDatabase();

        //This is an excellent example of a test product
        Product product = billableItemsDatabase.findById(101);

        System.out.printf("Product info - Id: %d \t%s \t$%.2f",
                product.getId(), product.getDescription(), product.getPrice());

    }

}
