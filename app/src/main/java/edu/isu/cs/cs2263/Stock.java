package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;
import com.google.gson.*;

public class Stock {

    /**
     *This is a Java class for Stock.
     */
    //region Private Variables
    /**
     * Variables for Stock class.
     */
    private int ID;
    private Player player = null;

    //endregion

    //region Get & Set

    /**
     * Getters and Setters for Stock class.
     * getID finds the stock ID.
     * @return the stock ID.
     */
    public int getID(){return ID;}

    /**
     * getPlayer finds the player.
     * @return the current player.
     */
    public Player getPlayer(){return  player;}

    /**
     * setPlayer sets the value of a stock based on the player's stock.
     * @param value the value of purchasable stock based on the player's currently owned stock
     */
    public void setPlayer(Player value){player = value;}

    //endregion

    //region Constructor

    /**
     * Constructor that sets an ID for stock.
     * @param id all of the IDs for stocks.
     */
    public Stock(int id){
        ID = id;
    }

    //endregion
}
