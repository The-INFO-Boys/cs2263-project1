package edu.isu.cs.cs2263;

public class Tile {

    //region Private Variables

    private int column;
    private int row;
    private Hotel hotel = null;
    private boolean placed = false;

    //endregion

    //region Get & set

    public int getColumn(){
        return column - 1;
    }
    public int getRow(){
        return row - 1;
    }
    public Hotel getHotel() {return hotel;    }
    public boolean getPlaced(){
        return placed;
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
    public void setPlaced(){placed =true;}

    //endregion


    //region Constructor

    public Tile(int vColumn, int vRow){
        column = vColumn;
        row = vRow;
    }

    //endregion
    
}