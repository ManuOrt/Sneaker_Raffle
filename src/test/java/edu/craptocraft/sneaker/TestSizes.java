package edu.craptocraft.sneaker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSizes
{
    Sizes sizes1;
    Sizes sizes2;

    @Before
    public void setUp(){

       sizes1 = Sizes.TREINTAYNUEVE;
       sizes2 = Sizes.CUARENTA;

    }
    @Test
    public void treintaYnueveEuTest(){
        Assert.assertEquals("39",sizes1.getEUSize());
        Assert.assertEquals("6.5", sizes1.getUSize());
    }

    @Test
    public void treintaYnueveEuTestFail(){
        Assert.assertNotEquals("10", sizes1.getEUSize());
        Assert.assertNotEquals("3.5", sizes1.getUSize());
    }

    @Test
    public void cuarentaEuTest(){
        Assert.assertEquals("40",sizes2.getEUSize());
        Assert.assertEquals("7.0", sizes2.getUSize());
    }

    @Test
    public void cuarentaEuTestFail(){
        Assert.assertNotEquals("432",sizes2.getEUSize());
        Assert.assertNotEquals("12.0", sizes2.getUSize());
    }
}
