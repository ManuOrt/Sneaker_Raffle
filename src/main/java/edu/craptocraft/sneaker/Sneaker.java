package edu.craptocraft.sneaker;
import java.util.*;

public class Sneaker implements Raffle
{
    private String style;
    private String name;
    private Double price;
    private ArrayList<Sizes> sizes = new ArrayList<>();

    private Bucket bucket = new Bucket();

    public Sneaker(String style, String name, Double price)
    {
        this.style = style;
        this.name = name;
        this.price = price;
    }

    @Override
    public void sizesRun(Sizes eu, Sizes us)
    {
        sizes.add(eu);
        sizes.add(us);
    }

    @Override
    public Double price()
    {
        return price;
    }

    @Override
    public void register(Entry... args)
    {
        for (Entry entry: args){
            bucket.add(entry);
        }
    }

    @Override
    public void cancel(Entry entry)
    {
        bucket.delete(entry);
    }

    @Override
    public Integer totalEntries()
    {
        return bucket.totalEntries();
    }

    @Override
    public String listEntries()
    {
        return bucket.listEntries();
    }

    @Override
    public Entry draw()
    {
        return bucket.draw();
    }

    public ArrayList<String> sizesToString(){
        ArrayList<String> stringSizes = new ArrayList<>();
        for (Sizes size: sizes){
            stringSizes.add(size.getUSize());
        }
        return stringSizes;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(style).append("\n")
                .append(name).append("\n")
                .append(price).append(" €").append("\n")
                .append(this.sizesToString());
        return sb.toString();
    }
}
