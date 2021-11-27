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
     * Finds the player and their ID and sets the value of the stock.
     * @return
     */
    public int getID(){return ID;}
    public Player getPlayer(){return  player;}
    public void setPlayer(Player value){player = value;}

    //endregion

    //region Constructor

    /**
     * Constructor that sets an ID for stock.
     * @param id
     */
    public Stock(int id){
        ID = id;
    }

    //endregion
}
