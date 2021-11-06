package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;

public class Tile<string> {
    public string Name;

    public string Column;

    public int Row;

    public Hotel Hotel;

    private boolean Placed;

    public Hotel getHotel() {
        return Hotel;
    }

    private boolean Placed(){
        return Placed;
    }
}