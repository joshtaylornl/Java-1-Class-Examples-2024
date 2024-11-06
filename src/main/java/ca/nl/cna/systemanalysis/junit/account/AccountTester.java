package ca.nl.cna.systemanalysis.junit.account;

/**
 * Class to test the Account class
 *
 * @author josh.taylor
 */
public class AccountTester {

    public static void main(String[] args) {

        System.out.println("Account Tester Class!");

        //TEST 1: Creat an account and echo out the details
        Account account = new Account("Josh Taylor", 20.0);
        printAccountInfo(account);

        //TEST 2: Deposit and check the balance
        System.out.println("\nDeposit 10 dollars....");
        account.credit(10.0);
        printAccountInfo(account);

        //TEST 3: Deposit a negative amount
        System.out.println("\nDeposit -100 dollars....");
        account.credit(-100.0);
        printAccountInfo(account);

        //TEST 4: Debit money from the account
        System.out.println("\nDebit 10 dollars....");
        account.debit(10);
        printAccountInfo(account);

        //TEST 5: Debit a negative amount from the account
        System.out.println("\nDebit -10 dollars....");
        account.debit(-10);
        printAccountInfo(account);

        //TEST 5: Debit an amount larger than the balance from the account
        System.out.printf("\nDebit %f dollars....\n", account.getBalance() + 1);
        account.debit(account.getBalance() + 1);
        printAccountInfo(account);

    }

    public static void printAccountInfo(Account account){
        System.out.printf("Account name: %s, Balance: $%.2f\n", account.getName(), account.getBalance());
    }

}
