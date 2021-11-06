package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;

//region Singleton
public class Board implements System {
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
    public List<> checkAdjacent(Tile){
        List<object> tileList = new List<object>;
        if(){
            return tileList;
        }
    }
    public void placeTile(){

    }
    public void updateTile(){

    }
    public List<Hotel> checkPresentHotels(){
        return List<Hotel>;
    }
    public List<Hotel> getHotels(){
        return List<Hotel>;
    }
    public Hotel getHotel(){
        return Hotel;
    }
    public List<Stock> checkAmount(Hotel){
        return stockList;
    }
    public System loadSystem(){
        return System;
    }
    public void saveSystem(){
    }
    public int checkHotelSize(Hotel){
        return size;
    }
    public void mergeHotels(Hotel,Hotel){
    }
    public int giveBonus(){
        return bonus;
    }
    public void handleStock(int,int,Hotel,Hotel){

    }
    //endregion
}