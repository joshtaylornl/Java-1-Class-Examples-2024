package ca.nl.cna.java1.objects;

/**
 * Account class modelled from Chapter 3 course notes
 */
public class Account {

    private String name;
    private double balance;

    /**
     * Simple constructor that can assign a starting balance (greater than 0)
     * @param name name
     * @param balance balance (must be greater than 0 to be assigned)
     */
    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0){
            this.balance = balance;
        }
    }

    /**
     * Get the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposit an amount into an account. Amount must be greater than 0.
     * @param amount amount (greater than 0)
     */
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}
