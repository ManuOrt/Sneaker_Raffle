package edu.craptocraft.sneaker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestSneaker
{
    Sneaker sneaker;

    @Test
    public void sizesToStringTest(){
        sneaker = new Sneaker("Nike air", "Nike", 20d);
        sneaker.sizesRun(Sizes.CUARENTA,Sizes.TREINTAYNUEVE);
        ArrayList<String> result = sneaker.sizesToString();
        Assert.assertEquals("7.0", result.get(0));
        Assert.assertEquals("6.5", result.get(1));
    }

    @Test
    public void toStringTest(){
        sneaker = new Sneaker("Nike air", "Nike", 20d);
        Assert.assertEquals(sneaker.toString(), "Nike air\n" +
                "Nike\n" +
                "20.0 €\n" +
                "[]");
    }
}
