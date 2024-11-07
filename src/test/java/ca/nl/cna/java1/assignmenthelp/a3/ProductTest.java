package ca.nl.cna.java1.assignmenthelp.a3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
class ProductTest {

    public static final int DEFAULT_ID = 1;
    public static final String DEFAULT_DESCRIPTION = "Socks";
    public static final double DEFAULT_PRICE = 12.99;

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product(DEFAULT_ID, DEFAULT_DESCRIPTION, DEFAULT_PRICE);
    }

    @Test
    void getId() {
        assertEquals(DEFAULT_ID, product.getId());
    }

    @Test
    void setId() {
        //Good case
        int goodValue = 10;
        product.setId(goodValue);
        assertEquals(product.getId(), goodValue);

        //Bad case
        int badValue = -11;
        product.setId(badValue);
        assertNotEquals(product.getId(), badValue);
    }

    @Test
    void getDescription() {
        assertEquals(product.getDescription(), DEFAULT_DESCRIPTION);
    }

    @Test
    void setDescription() {
        String randomDescription = "Boxers";
        product.setDescription(randomDescription);
        assertEquals(product.getDescription(), randomDescription);
    }

    @Test
    void getPrice() {
        assertEquals(product.getPrice(), DEFAULT_PRICE);
    }

    @Test
    void setPrice() {
        Random random = new Random();
        double randomPrice;

        //Do 100 tests
        for (int i = 0; i < 10000; i++) {
            randomPrice = random.nextDouble()*random.nextInt();
            product.setPrice(randomPrice);
            if(randomPrice >= 0){
                assertEquals(product.getPrice(), randomPrice);
            } else {
                assertNotEquals(product.getPrice(), randomPrice);
            }
        }
    }
}