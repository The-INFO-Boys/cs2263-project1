package edu.isu.cs.cs2263;

import java.util.List;
import java.util.ArrayList;


public class Board {


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
    public List<TileToReplace> checkAdjacent(TileToReplace tile){
        List<TileToReplace> tileList = new ArrayList<>();
        //if(i=0; i<=1; i++){
            return tileList;
        //}
    }
    public void placeTile(){

    }
    public void updateTile(TileToReplace tile){

    }
    public List<HotelToReplace> checkPresentHotels(){
        List<HotelToReplace> hotelList = new ArrayList<HotelToReplace>();
        return hotelList;
    }
    public List<HotelToReplace> getHotels(){
        List<HotelToReplace> hotelList = new ArrayList<HotelToReplace>();
        return hotelList;
    }
    public HotelToReplace getHotel(){
        HotelToReplace hotel = new HotelToReplace();
        return hotel;
    }
    public List<StockToReplace> checkAmount(String HotelToReplace){
        List<StockToReplace> stockList = new ArrayList<StockToReplace>();
        return stockList;
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
    public void handleStock(int player1,int player2,HotelToReplace Hotel1,HotelToReplace Hotel2){

    }
    //endregion
}