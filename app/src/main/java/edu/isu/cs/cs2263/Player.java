package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private int ID;
    private List<Tile> Tiles = new ArrayList<>();
    private String Name;
    private int Money;

    public Player(int id, String name){
        ID = id;
        Money = 6000;
        Name = name;
    }

    public int getID(){return ID;};

    public int getMoney(){
        return Money;
    }

    public void setMoney(int value){
        Money = value;
    }

    public String getName(){return Name;}

    public void drawTile(Tile e){
        Tiles.add(e);
    }

    public void removeTile(Tile e){Tiles.remove(e);};

    public List<Tile> getHand(){return Tiles;}

    public void setHand(List<Tile> hand){Tiles = hand;}
}