package edu.craptocraft.sneaker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEntry
{
    Entry entry;

    @Before
    public void setUp(){
        entry = new Entry("manu@gmail.com");
        entry.setSize(Sizes.CUARENTA);
        entry.setAddress("Carrer Carretó");
        entry.payment("manu@paypal.com");
        entry.setTotal(20d);
    }
    @Test
    public void toStringTest(){
        Assert.assertEquals(entry.toString(), "\nemail: manu@gmail.com\n" +
                "Size: CUARENTA\n" +
                "Address: Carrer Carretó\n" +
                "Payment: manu@paypal.com\n" +
                "Total: 20.0");
    }
}
