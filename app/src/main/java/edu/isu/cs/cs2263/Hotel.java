package edu.isu.cs.cs2263;

import java.lang.reflect.Type;
import java.util.List;
import java.util.ArrayList;

public class Hotel {

    //region Private Variables

    private int ID;
    private List<Stock> StockList;
    private boolean Founded = false;
    private String Name;
    private int TypeID;

    //endregion

    //region Get & Set

    public String getName(){return Name;}

    public int getID(){
        return ID;
    }

    public boolean getFounded(){
        return Founded;
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

    //endregion

    //region Constructor

    public Hotel(int id, String name, int typeID){
        ID = id;
        Name = name;
        TypeID = typeID;
        StockList = new ArrayList<>();
        for(int x = 0; x < 25; x++ ){
            StockList.add(new Stock(x));
        }
    }

    //endregion

    //region Public Method
    public boolean found(Player p){
        this.Founded = true;
        Stock stockToGive = getUnownedStock().get(0);
        stockToGive.setPlayer(p);
        StockList.set(stockToGive.getID(),stockToGive);
        return true;
    }

    public void UpdateStock(int stockID, Stock updatedStock){
        StockList.set(stockID,updatedStock);
    }

    public int ownedStock(int playerID){
        int retNum = 0;
        for(Stock s : StockList){
            if(s.getPlayer() != null &&s.getPlayer().getID() == playerID){
                retNum++;
            }
        }
        return retNum;
    }

    //endregion

    //region Private Methods

    private List<Stock> getUnownedStock(){
        List<Stock> UnownedStock = new ArrayList<>();
        for(Stock s : this.StockList){
            if(s.getPlayer() == null) {
                UnownedStock.add(s);
            }
        }
        return UnownedStock;
    }

    //endregion
}