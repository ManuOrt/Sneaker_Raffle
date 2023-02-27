package edu.craptocraft.payment;

public interface Payment
{
    public boolean autentication(String auth);
    public boolean pay(String p, Double d);
    public Double credit(String credit);
}
