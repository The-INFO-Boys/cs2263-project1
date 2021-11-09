package edu.isu.cs.cs2263;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;


public class Board {

    public Tile[][] Grid;

    //region Singleton
    private static volatile Board singleton;
    private Board(){}
    public Board instance(){
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
    }
    //endregion
    public static void main(String[] args){
    }

    //region Methods
    public List<Tile> checkAdjacent(Tile tile){
        List<Tile> tileList = new ArrayList<>();
        if(tile.placed){
            return tileList;
        }else{
            return tileList;
        }
    }
    public void placeTile(){

    }
    public void updateTile(Tile tile){

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
        Hotel hotel = new Hotel();
        return hotel;
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