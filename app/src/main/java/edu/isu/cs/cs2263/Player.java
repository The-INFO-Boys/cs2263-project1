package edu.isu.cs.cs2263;

import java.util.List;

public class Player {
    private List<Tile> Tiles;

    private String Name;

    private int Money;

    public Player(){
        Money = 6000;
        
    }

    public int getMoney(){
        return Money;
    }

    public void setMoney(int value){
        Money = value;
    }
}