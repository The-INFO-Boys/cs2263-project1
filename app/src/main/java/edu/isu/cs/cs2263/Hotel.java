package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;

public class Hotel {

    private List<Stock> StockList;

    private boolean Founded;

    private String Name;

    private int TypeID;

    public boolean getFounded(){
        return Founded;
    }

    public void found(Player p,List<Tile> Tiles){

    }

    public List<Stock> getAvailable(){

        return new ArrayList<Stock>();
    }

    public void merge(){

    }
}