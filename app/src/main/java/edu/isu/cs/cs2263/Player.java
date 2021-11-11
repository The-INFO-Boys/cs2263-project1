package edu.isu.cs.cs2263;

import java.util.List;

public class Player {

    private int ID;
    private List<Tile> Tiles;
    private String Name;
    private int Money;

    public Player(int id, String name){
        ID = id;
        Money = 6000;
        Name = name;
    }

    public int getMoney(){
        return Money;
    }

    public void setMoney(int value){
        Money = value;
    }

    public void drawTile(Tile e){
        Tiles.add(e);
    }
}