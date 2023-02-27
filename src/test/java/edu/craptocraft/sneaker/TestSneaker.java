package edu.craptocraft.sneaker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

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
    public void listEntriesTest(){
        Entry entry = new Entry("manu@gmail.com");
        sneaker.register(entry);
        Assert.assertEquals("[manu@gmail.com]", sneaker.listEntries());
    }

    @Test
    public void cancelTest(){
        Entry entry = new Entry("manu@gmail.com");
        sneaker.register(entry);
        Assert.assertEquals(1, sneaker.totalEntries().intValue());
        sneaker.cancel(entry);
        Assert.assertEquals(0, sneaker.totalEntries().intValue());
    }

    @Test
    public void drawTest(){
        String[] emails = {"manu@gmail.com", "manus@gmail.com"};

        Entry entry = new Entry(emails[0]);
        Entry entry2 = new Entry(emails[1]);

        sneaker.register(entry);
        sneaker.register(entry2);

        Entry winner = sneaker.draw();
        Assert.assertTrue(Arrays.asList(emails).contains(winner.getEmail()));
    }

    @Test
    public void toStringTest(){
        Assert.assertEquals(sneaker.toString(), "Nike air\n" +
                "Nike\n" +
                "20.0 €\n" +
                "[]");
    }
}
