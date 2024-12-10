package ca.nl.cna.java1.assignmenthelp.project;

public class FunWithInvoiceItems {

    public static void main(String[] args) {
        System.out.println("Fun with Invoice Items");

        Product product = new Product(1, "Jeans", 39.95);

        InvoiceItem invoiceItem = new InvoiceItem(product, 2);

        System.out.printf("Invoice Information: QTY: %d \t%s \t$%.2f",
                invoiceItem.getQuantity(),invoiceItem.getProduct().getDescription(), invoiceItem.getTotal());

    }

    public static void printInvoiceItem(InvoiceItem invoiceItem){
        System.out.printf("\nInvoice Information: QTY: %d \t%s \t$%.2f",
                invoiceItem.getQuantity(),invoiceItem.getProduct().getDescription(), invoiceItem.getTotal());
    }


}
