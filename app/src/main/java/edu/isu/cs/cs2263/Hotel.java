package edu.isu.cs.cs2263;

import java.lang.reflect.Type;
import java.util.List;
import java.util.ArrayList;

public class Hotel {

    /**
     *This is a Java class for Hotel.
     */

    //region Private Variables

    /**
     *Represents the variables for the Hotel class.
     */

    private int ID;
    private List<Stock> StockList;
    private boolean Founded = false;
    private String Name;
    private int TypeID;

    //endregion

    //region Get & Set

    /**
     *Getters and Setters for Hotel class.
     *getName retrieves the Hotel name
     *getID retrieves the Hotel ID
     *getFounded is a boolean that determines if a hotel is founded or not
     *getAvailable lists the available stock to purchase
     */

    public int getTypeID() {return TypeID;}

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

    /**
     * Constructor for Hotel class that gets info from a hotel
     * including ID, name, the typeID, and stock list.
     * @param id
     * @param name
     * @param typeID
     */
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

    /**
     * Public methods for the Hotel class
     * found method is a boolean that
     * UpdateStock method finds the stockID and updates the stock list.
     * @param p
     * @return
     */
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

    /**
     * Private methods for Hotel class.
     * getUnownedStock method lists the unowned stocks and returns the list.
     * @return
     */
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