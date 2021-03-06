package edu.isu.cs.cs2263;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Board {

    /**
     *This is a Java class for Board.
     */

    //region private variables

    /**
     * Represents private variables for Board class.
     */
    private Tile[][] board = setBoard();

    //endregion

    //region Singleton

    //private static volatile Board singleton
    /* public static Board instance(){
        Board local = singleton;
        if(local==null){
            synchronized (this){
                local = singleton;
                if(local==null){
                    singleton = local = new Board();
                }
            }
        }
        return singleton;
    }*/
    private Board(){}
    private static Board single_instance = null;
    public static Board getInstance(){
        if(single_instance == null){
            single_instance = new Board();
        }
        return single_instance;
    }
    //endregion

    //region private methods

    /**
     * Represents the private methods for Board class.
     * getBoard retrieves board.
     * @return the board itself.
     */
    public Tile[][] getBoard() {
        return board;
    }

    /**
     * setBoard sets up the game board itself.
     * @return the board being set up.
     */
    private Tile[][] setBoard(){
        Tile[][] tileBoard = new Tile [12][9];
        for(int x = 0; x < 12; x++){
            for(int y = 0; y < 9; y++){
                tileBoard[x][y] = (new Tile(x + 1,y + 1));
            }
        }
        return tileBoard;
    }

    /**
     * getTiles retrieves a list of tiles from the board.
     * @return a list of tiles pulled from the board.
     */
    public List<Tile> getTiles(){
        List<Tile> retList = new ArrayList<>();
        for(int x = 0; x < 12; x++){
            retList.addAll(Arrays.asList(board[x]).subList(0, 9));
        }
        return retList;
    }

    //endregion

    //region public methods

    /**
     * Represents public methods for Hotel class.
     * foundHotel method gets the tile list and founds a new hotel on the board if the tiles are together.
     * @param newHotel the new hotel to found.
     * @param h the hotel from list of hotels.
     */
    public void foundHotel(List<Tile> newHotel, Hotel h){
        for(Tile t: newHotel){
            board[t.getColumn()][t.getRow()].setHotel(h);
        }
    }

    /**
     * checkAdjacent method checks the board to see if there are any adjacent tiles
     * on the board prior to a tile being placed.
     * @param tile the tiles currently played on the board.
     * @return tile list.
     */
    public List<Tile> checkAdjacent(Tile tile){
        List<Tile> tileList = new ArrayList<>();
        Tile north = null;
        Tile south = null;
        Tile east = null;
        Tile west = null;
        if(tile.getColumn() + 1 < 12) {
            north = board[tile.getColumn() + 1][tile.getRow()];
        }
        if(tile.getColumn() - 1 > -1) {
            south = board[tile.getColumn() - 1][tile.getRow()];
        }
        if(tile.getRow() + 1 < 9) {
            east = board[tile.getColumn()][tile.getRow() + 1];
        }
        if(tile.getRow() - 1 > -1) {
            west = board[tile.getColumn()][tile.getRow() - 1];
        }
        if (north != null && north.getPlaced() == true) {
            tileList.add(north);
        }
        if (south != null && south.getPlaced() == true) {
            tileList.add(south);
        }
        if (east != null && east.getPlaced() == true) {
            tileList.add(east);
        }
        if (west != null && west.getPlaced() == true) {
            tileList.add(west);
        }
        return tileList;
    }

    /**
     * placeTile method places a tile on the board.
     * updateTIle method updates the tile on the board.
     * @param tile
     */
    public void placeTile(Tile tile){
        this.board[tile.getColumn()][tile.getRow()].setPlaced();
    }
    public void updateTile(Tile tile, Hotel h){
        this.board[tile.getColumn()][tile.getRow()].setHotel(h);
    }

    /**
     * checkPresentHotels method checks the board for present hotels and returns a list of present hotels.
     * getHotels method also checks the board hotels and returns a list.
     * @return hotelList
     */
    public List<Hotel> checkPresentHotels(){
        List<Hotel> hotelList = new ArrayList<Hotel>();
        return hotelList;
    }
    public List<Hotel> getHotels(){
        List<Hotel> hotelList = new ArrayList<Hotel>();
        return hotelList;
    }

    /**
     * getHotelSize method finds a hotel and returns its size.
     * @param h the hotels on the board
     * @return the size of hotel(s) that was found
     */
    public int getHotelSize(Hotel h){
        int size = 0;
        for (Tile t: getTiles()){
            if(t.getHotel() != null && t.getHotel().getID() == h.getID()){
                size++;
            }
        }
        return size;
    }
    //endregion
}


