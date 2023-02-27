package edu.craptocraft.sneaker;

import java.util.Optional;

public interface Raffle
{
    public void sizesRun(Sizes eu,Sizes us);
    public Double price();
    public void register(Entry... entry);
    public void cancel(Entry entry);

    public Integer totalEntries();
    public String listEntries();
    public Entry draw();
}
