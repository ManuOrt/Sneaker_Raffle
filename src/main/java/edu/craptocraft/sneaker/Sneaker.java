package edu.craptocraft.sneaker;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sneaker implements Raffle
{
    private String style;
    private String name;
    private Double price;
    private ArrayList<Sizes> sizes = new ArrayList<>();
    private Map<String, Entry> entries = new HashMap<>();

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
            if (!this.checkIfEntryExists(entry)) {
                entries.put(entry.getEmail(), entry);
            }
        }
    }

    @Override
    public void cancel(Entry entry)
    {
        if (this.checkIfEntryExists(entry)){
            entries.remove(entry.getEmail());
        }
    }

    private boolean checkIfEntryExists(Entry entry) {
        for(Map.Entry<String, Entry> entryMap : entries.entrySet()){
            if(entryMap.getValue().equals(entry)){
                return true;
            }
        }

        return false;
    }

    @Override
    public Integer totalEntries()
    {
        return entries.size();
    }

    @Override
    public String listEntries()
    {
        List<String> lEntries = new ArrayList<>();
        for (Map.Entry<String, Entry> registerEntries : entries.entrySet()){
            lEntries.add(registerEntries.getKey());
        }
        return lEntries.toString();
    }


    @Override
    public Entry draw()
    {
        return null;
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
