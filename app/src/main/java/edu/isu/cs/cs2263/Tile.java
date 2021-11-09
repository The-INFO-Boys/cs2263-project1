package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;

public class Tile {
    private String name;
    private int column;
    private int row;
    private Hotel hotel = null;
    private boolean placed = false;
    
    //region Getters
    public String getName(){
        return name;
    }
    public int getColumn(){
        return column;
    }
    public int getRow(){
        return row;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public boolean getPlaced(){
        return placed;
    }
    //endregion
    //region Setters
    public void setName(String name){
        this.name = name;
    }
    public void setColumn(int column){
        this.column = column;
    }
    public void setRow(int row){
        this.row = row;
    }
    public void setHotel(Hotel hotel){
        this.hotel = hotel;
    }
    public void setPlaced(){
        placed =true;
    }
    //endregion
    
}