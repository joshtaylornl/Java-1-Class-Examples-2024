package ca.nl.cna.java1.assignmenthelp.a3;

public class InvoiceItem {
    //TODO add constrains on quantity - note negative

    private Product product;
    private int quantity;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal(){
        return this.quantity * this.product.getPrice();
    }

}
