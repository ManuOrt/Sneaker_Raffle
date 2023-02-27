package edu.craptocraft.sneaker;

import edu.craptocraft.payment.Payment;
import edu.craptocraft.payment.Paypal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPaypal
{
    Payment payment;
    String[] emails = {"summer@paypal.com", "birdman@paypal.com", "morty@paypal.com", "summer@paypal.com", "manu@gmail.com"};

    @Before
    public void setUp(){
        payment = new Paypal();
    }

    @Test
    public void authentificationTest(){
        Assert.assertTrue(payment.autentication(emails[0]));
        Assert.assertTrue(payment.autentication(emails[1]));
        Assert.assertTrue(payment.autentication(emails[2]));
        Assert.assertTrue(payment.autentication(emails[3]));

        Assert.assertFalse(payment.autentication(emails[4]));
    }

    @Test
    public void payTest() {
        Assert.assertTrue(payment.pay(emails[0], 100d));
        Assert.assertEquals(payment.credit(emails[0]), 100d, 0);
        Assert.assertFalse(payment.pay(emails[0], 200d));
    }

}
