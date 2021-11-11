package edu.isu.cs.cs2263;

import java.lang.reflect.Type;
import java.util.List;
import java.util.ArrayList;

public class Hotel {

    private List<Stock> StockList;

    private boolean Founded = false;

    private String Name;

    private int TypeID;

    public boolean getFounded(){
        return Founded;
    }

    public Hotel(String name, int typeID){
        Name = name;
        TypeID = typeID;
        StockList = new ArrayList<>();
        for(int x = 0; x < 25; x++ ){
            StockList.add(new Stock(this));
        }
    }

    public void found(Player p){

    }

    public List<Stock> getAvailable(){
        List<Stock> availableStock = new ArrayList<>();
        for(Stock s : StockList){
            if(s.getPlayer() == null){
                availableStock.add(s);
            }
        }
        return availableStock;
    }

    public List<Stock> getStockList(){
        return StockList;
    }

    public void merge(){

    }
}