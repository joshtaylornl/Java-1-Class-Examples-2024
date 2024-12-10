package ca.nl.cna.java1.assignmenthelp.project;
import java.util.ArrayList;


public class Invoice {


    private ArrayList<InvoiceItem> invoiceItemList;

    public Invoice() {
        //todo add stuff to the constructor
        invoiceItemList = new ArrayList<>();
    }

    public void addInvoiceItem(InvoiceItem invoiceItem){
        this.invoiceItemList.add(invoiceItem);
    }

    /**
     * Remove the line number from the invoice - counts from 1
     * @param position
     */
    public void removeInvoiceItem(int position){
        if(position >= 1 && position <= invoiceItemList.size()){
            invoiceItemList.remove(position-1);
        }
    }

    /**
     * Get's the InvoiceItem at line position - counts from 1
     * @param position
     * @return
     */
    public InvoiceItem getInvoiceItem(int position){
        if(position >= 1 && position <= invoiceItemList.size()){
            return invoiceItemList.get(position - 1);
        }
        return null; //hope this doesn't happen
    }

    public int getNumberLines(){
        return invoiceItemList.size();
    }

}
