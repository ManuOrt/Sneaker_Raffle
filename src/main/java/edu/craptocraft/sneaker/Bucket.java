package edu.craptocraft.sneaker;

import java.util.*;

public class Bucket
{
    private Random rand;

    private Map<String, Entry> entries = new HashMap<>();

    public Bucket()
    {}

    public void add(Entry entry){
        if (!isDoubleEntry(entry)) {
            entries.put(entry.getEmail(), entry);
        }
    }

    public void delete(Entry entry){
        if (isDoubleEntry(entry)) {
            entries.remove(entry.getEmail());
        }
    }

    public Integer totalEntries(){
        return entries.size();
    }

    public String listEntries(){
        List<String> lEntries = new ArrayList<>();

        for (Map.Entry<String, Entry> registerEntries : entries.entrySet()){
            lEntries.add(registerEntries.getKey());
        }

        return lEntries.toString();
    }

    public Entry draw(){
        List<String> lEntries = new ArrayList<>();

        for (Map.Entry<String, Entry> registerEntries : entries.entrySet()){
            lEntries.add(registerEntries.getKey());
        }

        int randomIndex = new Random().nextInt(entries.size());

        return entries.get(lEntries.get(randomIndex));
    }

    public boolean isDoubleEntry(Entry entry){
        for(Map.Entry<String, Entry> entryMap : entries.entrySet()){
            if(entryMap.getValue().equals(entry)){
                return true;
            }
        }

        return false;
    }
}
