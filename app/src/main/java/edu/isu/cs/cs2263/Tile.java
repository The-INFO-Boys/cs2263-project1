package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;

public class Tile {
    public String name;
    public int column;
    public int row;
    public Hotel hotel = null;
    public boolean placed = false;

    public Hotel getHotel() {
        return hotel;
    }

    public String getName(){
        return name;
    }
    private boolean placed(){
        return placed;
    }
}