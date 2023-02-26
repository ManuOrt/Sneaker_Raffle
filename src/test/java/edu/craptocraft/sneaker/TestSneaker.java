package edu.craptocraft.sneaker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestSneaker
{
    Sneaker sneaker;

    @Before
    public void setUp(){
        sneaker = new Sneaker("Nike air", "Nike", 20d);
    }
    @Test
    public void sizesToStringTest(){
        sneaker.sizesRun(Sizes.CUARENTA,Sizes.TREINTAYNUEVE);
        ArrayList<String> result = sneaker.sizesToString();
        Assert.assertEquals("7.0", result.get(0));
        Assert.assertEquals("6.5", result.get(1));
    }

    @Test
    public void registerTest(){
        Entry entry = new Entry("manu@gmail.com");
        sneaker.register(entry);
        Assert.assertEquals(1, sneaker.totalEntries().intValue());
    }

    @Test
    public void registerNoDuplicatesTest(){
        Entry entry = new Entry("manu@gmail.com");
        sneaker.register(entry);
        sneaker.register(entry);
        Assert.assertEquals(1, sneaker.totalEntries().intValue());
    }

    @Test
    public void registerNoDuplicatesByPaymentTest(){
        Entry entry = new Entry("manu@gmail.com");
        entry.payment("manu@gmail.com");

        Entry entry2 = new Entry("payment@gmail.com");
        entry2.payment("manu@gmail.com");

        sneaker.register(entry);
        sneaker.register(entry2);
        Assert.assertEquals(1, sneaker.totalEntries().intValue());
    }

    @Test
    public void toStringTest(){
        Assert.assertEquals(sneaker.toString(), "Nike air\n" +
                "Nike\n" +
                "20.0 €\n" +
                "[]");
    }
}
