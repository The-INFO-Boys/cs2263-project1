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
    public int getRawColumn(){return column;}
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
    public String getRawRow() {
        String alpha = null;
        if(row == 1){
            alpha = "A";
        } else if(row == 2){
            alpha = "B";
        } else if(row == 3){
            alpha = "C";
        } else if(row == 4){
            alpha = "D";
        } else if(row == 5){
            alpha = "E";
        } else if(row == 6){
            alpha = "F";
        } else if(row == 7){
            alpha = "G";
        } else if(row == 8){
            alpha = "H";
        } else if(row == 9){
            alpha = "I";
        }
        return alpha;
    }
    public String getTileName(){
        return (getRawRow()+String.valueOf(getRawColumn()));
    }

    //endregion


    //region Constructor

    public Tile(int vColumn, int vRow){
        column = vColumn;
        row = vRow;
    }

    //endregion
    
}