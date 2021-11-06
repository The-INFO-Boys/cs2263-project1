package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;


public class Board implements System {


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
    public List<object> checkAdjacent(String TileToReplace){
        List<object> tileList = new List<object>();
        if(){
            return tileList;
        }
    }
    public void placeTile(){

    }
    public void updateTile(){

    }
    public List<Hotel> checkPresentHotels(){
        List<HotelToReplace> hotelList = new List<HotelToReplace>();
        return hotelList;
    }
    public List<Hotel> getHotels(){
        List<HotelToReplace> hotelList = new List<HotelToReplace>();
        return hotelList;
    }
    public Hotel getHotel(){
        return Hotel;
    }
    public List<Stock> checkAmount(String HotelToReplace){
        List<StockToReplace> stockList = new List<StockToReplace>();
        return stockList;
    }
    public System loadSystem(){
        return System;
    }
    public void saveSystem(){
    }
    public int checkHotelSize(String Hotel){
        return size;
    }
    public void mergeHotels(String Hotel,String Hotel){
    }
    public int giveBonus(){
        return bonus;
    }
    public void handleStock(int player1,int player2,HotelToReplace Hotel1,HotelToReplace Hotel2){

    }
    //endregion
}