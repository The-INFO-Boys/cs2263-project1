package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;
import com.google.gson.*;

public class Stock {

    /**
     *
     */
    //region Private Variables

    private int ID;
    private Player player = null;

    //endregion

    //region Get & Set

    public int getID(){return ID;}
    public Player getPlayer(){return  player;}
    public void setPlayer(Player value){player = value;}

    //endregion

    //region Constructor

    public Stock(int id){
        ID = id;
    }

    //endregion
}
