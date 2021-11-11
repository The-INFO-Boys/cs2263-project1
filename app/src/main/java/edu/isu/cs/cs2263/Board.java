package edu.isu.cs.cs2263;

import java.lang.reflect.*;
import java.util.List;
import java.util.ArrayList;


public class Board {

    //region private variables

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

    private Tile[][] setBoard(){
        Tile[][] tileBoard = new Tile [12][9];
        for(int x = 0; x < 12; x++){
            for(int y = 0; y < 9; y++){
                tileBoard[x][y] = (new Tile(x + 1,y + 1));
            }
        }
        return tileBoard;
    }

    //endregion

    //region public methods

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

    public void placeTile(Tile tile){
        this.board[tile.getColumn()][tile.getRow()].setPlaced();
    }
    public void updateTile(Tile tile){
        tile.setHotel(tile.getHotel());
    }
    public List<Hotel> checkPresentHotels(){
        List<Hotel> hotelList = new ArrayList<Hotel>();
        return hotelList;
    }
    public List<Hotel> getHotels(){
        List<Hotel> hotelList = new ArrayList<Hotel>();
        return hotelList;
    }
    public Hotel getHotel(){

        return new Hotel(99,"To be Implemented",5);
    }
    public void loadSystem(){

    }
    public void saveSystem(){
    }
    public int checkHotelSize(String Hotel){
        int size = 0;
        return size;
    }
    public void mergeHotels(String HotelToReplace1,String HotelToReplace2) {
    }
    public int giveBonus(){
        int bonus = 0;
        return bonus;
    }
    public void handleStock(int player1,int player2,Hotel Hotel1,Hotel Hotel2){

    }
    //endregion
}