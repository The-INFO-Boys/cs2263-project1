package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;

public class Stock {
    private Hotel hotel;
    private Player player = null;

    public Hotel getHotel(){
        return hotel;
    }
    public Player getPlayer(){return  player;}
    public void setPlayer(Player value){player = value;}
}
