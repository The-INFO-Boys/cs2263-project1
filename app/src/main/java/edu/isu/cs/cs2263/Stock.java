package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;

public class Stock {

    //region Private Variables

    private int ID;
    private Hotel hotel;
    private Player player = null;

    //endregion

    //region Get & Set

    public int getID(){return ID;}
    public Hotel getHotel(){
        return hotel;
    }
    public Player getPlayer(){return  player;}
    public void setPlayer(Player value){player = value;}

    //endregion

    //region Constructor

    public Stock(int id, Hotel h){
        ID = id;
        hotel = h;
    }

    //endregion
}
