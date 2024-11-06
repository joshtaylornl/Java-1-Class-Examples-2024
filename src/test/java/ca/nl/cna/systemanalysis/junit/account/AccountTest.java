package ca.nl.cna.systemanalysis.junit.account;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.*;

class AccountTest {

    public static final String TEST_NAME = "Josh";
    private Account account = new Account(TEST_NAME, 0);

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals(TEST_NAME, account.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        String newName = "Josh";
        account.setName(newName);
        assertEquals(newName, account.getName());
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        assertEquals(0, account.getBalance());
    }

//    @org.junit.jupiter.api.Test
//    void credit() {
//        //TODO
//    }
//
//    @org.junit.jupiter.api.Test
//    void debit() {
//        //TODO
//    }
//
//    @org.junit.jupiter.api.Test
//    void reset() {
//        //TODO
//    }
}