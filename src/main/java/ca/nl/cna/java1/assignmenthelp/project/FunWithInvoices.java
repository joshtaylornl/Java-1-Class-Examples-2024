package ca.nl.cna.java1.assignmenthelp.project;

public class FunWithInvoices {

    public static void main(String[] args) {
        System.out.println("Fun with Invoices!");

        BillableItemsDatabase billableItemsDatabase = new BillableItemsDatabase();
        Invoice invoice = new Invoice();

        invoice.addInvoiceItem(new InvoiceItem(billableItemsDatabase.findById(101),3));
        invoice.addInvoiceItem(new InvoiceItem(billableItemsDatabase.findById(102),1));
        invoice.addInvoiceItem(new InvoiceItem(billableItemsDatabase.findById(103),5));

        for (int i = 0; i < invoice.getNumberLines(); i++) {
            FunWithInvoiceItems.printInvoiceItem(invoice.getInvoiceItem(i+1));
        }

    }

}
