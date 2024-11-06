package ca.nl.cna.systemanalysis.junit.account;

/**
 *  An account class that allows a simple account with debit, credit and reset functionality.
 *
 * @author josh.taylor
 */
public class Account {

    private String name;
    private double balance;

    /**
     * Constructor that creates an account with an inital balance
     * @param name persons name on the account
     * @param balance opening balance (must be > 0)
     */
    public Account(String name, double balance){
        this.name = name;
        if(balance > 0){
            this.balance = balance;
        }
    }

    /**
     * Get the account name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the account name
     * @param name account name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the account balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Credit money into the account
     * @param amount amount to credit (must be > 0)
     */
    public void credit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
        }
    }

    /**
     * Debit money from the account
     * @param amount ammount to debit (must be > 0)
     */
    public void debit(double amount){
        if(amount > 0){
            if(amount < this.getBalance()){
                this.balance -= amount;
            } else {
                //NOTE: you should never print to the console from inside an object like this
                System.err.println("Debit amount exceeded account balance.");
            }
        }
    }

    /**
     * Reset the balance!
     */
    //TODO Remove this?
    public void reset(){
        //This method really shouldn't exist
        this.balance = 0;
    }

}
