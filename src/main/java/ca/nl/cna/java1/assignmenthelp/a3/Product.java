package ca.nl.cna.java1.assignmenthelp.a3;

/**
 * A class to represent a Product on an invoice
 * @authoer
 *
 */
public class Product {

    //TODO mmake sure price and ID are not negative
    private int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        //TODO mmake sure price and ID are not negative
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        //TODO handle negatives
        this.price = price;
    }
}
