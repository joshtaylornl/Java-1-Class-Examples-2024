package ca.nl.cna.java1.assignmenthelp.project;

import java.util.ArrayList;

public class BillableItemsDatabase {

    private ArrayList<Product> productArrayList;
    //TODO make one for services

    public BillableItemsDatabase() {
        productArrayList = new ArrayList<>();
        loadProductList();
    }

    public ArrayList<Product> getProductList(){
        return productArrayList;
    }

    public Product findById(int id){
        for(Product product : productArrayList){
            if(product.getId() == id){
                return product;
            }
        }

        return null; //Hopefully you don't get here by using a bad ID
    }

    private void loadProductList(){
        productArrayList.add(new Product(101, "Windshield Wiper Blades", 25.99));
        productArrayList.add(new Product(102, "Engine Oil (5W-30, 1 Quart)", 9.99));
        productArrayList.add(new Product(103, "Air Filter", 15.50));

    }

}
