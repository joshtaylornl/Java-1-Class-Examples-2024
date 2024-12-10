package ca.nl.cna.java1.assignmenthelp.project;

import java.util.Random;

public class FunWithRandomProducts {

    public static void main(String[] args) {
        System.out.println("Fun with Random Products");

        for (int i = 0; i < 10; i++) {
            printProductInfo(generateRandomProduct());
        }

    }

    public static Product generateRandomProduct(){
        Random random = new Random();
        int randomId = random.nextInt(1000)+1;
        double randomPrice = random.nextDouble() * (random.nextInt(1000)+1);
        Product product = new Product(randomId, "RandProduct_" + randomId, randomPrice);
        return product;
    }

    public static void printProductInfo(Product product){
        System.out.printf("\nId: %d, Desc: %s, $%.2f", product.getId(), product.getDescription(), product.getPrice());
    }

}
