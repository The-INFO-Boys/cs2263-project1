package edu.isu.cs.cs2263;

public class Tile {

    /**
     *This is a Java class for Tile.
     */

    //region Private Variables
    /**
     * Represents Tile variables.
     */
    private int column;
    private int row;
    private Hotel hotel = null;
    private boolean placed = false;

    //endregion

    //region Get & set

    /**
     * Getters and Setters used to find and place a tile
     * on the board.
     */

    /**
     * getColumn finds column for tile
     * @return column minus 1
     */
    public int getColumn(){
        return column - 1;
    }

    /**
     * getRow finds the row for tile
     * @return row minus 1
     */
    public int getRow(){
        return row - 1;
    }

    /**
     * getRawColumn finds the raw column for tile
     * @return column
     */
    public int getRawColumn(){return column;}

    /**
     * getHotel finds any hotel
     * @return any hotels that were found.
     */
    public Hotel getHotel() {return hotel;}

    /**
     * getPlaced is a boolean to determine if a tile has been placed or not
     * @return placed
     */
    public boolean getPlaced(){
        return placed;
    }

    /**
     * setColumn sets the column of the tile
     * @param column all of the available columns.
     */
    public void setColumn(int column){
        this.column = column;
    }

    /**
     * setRow sets the row of the tile
     * @param row all the available rows.
     */
    public void setRow(int row){
        this.row = row;
    }

    /**
     * setHotel sets the tile to a hotel
     * @param hotel all the available hotels (founded).
     */
    public void setHotel(Hotel hotel){
        this.hotel = hotel;
    }

    /**
     * setPlaced is a boolean that deterines if a tile was placed or not.
     */
    public void setPlaced(){placed =true;}

    /**
     * getRawRow are fixed rows
     * @return a letter for each row (A-I)
     */
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

    /**
     * getTileName gets the tile based off of getRawRow and getRawColumn
     * @return the value of getRawRow and getRawColumn
     */
    public String getTileName(){
        return (getRawRow()+String.valueOf(getRawColumn()));
    }

    //endregion


    //region Constructor

    /**
     * Tile is where the tile will be placed
     * @param vColumn the available columns
     * @param vRow the available rows
     */
    public Tile(int vColumn, int vRow){
        column = vColumn;
        row = vRow;
    }

    //endregion
    
}