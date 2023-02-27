package edu.craptocraft.sneaker;

public interface Raffle
{
    public void sizesRun(Sizes eu,Sizes us);
    public Double price();
    public void register(Entry... entry);
//    public void cancel();

    public Integer totalEntries();
    public String listEntries();
    public Entry draw();
}
