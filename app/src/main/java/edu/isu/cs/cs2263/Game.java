package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;

//class TileToReplace{
//    public HotelToReplace h;
//
//    public HotelToReplace getH() {
//        return h;
//    }
//}
//class StockToReplace{}
//class HotelToReplace{
//    public boolean founded;
//
//    public boolean placed(){
//        return founded;
//    }
//}
//class PlayerToReplace{}

public class Game implements System {

    private List<Player> PlayerList;
    private Board Board;
    private List<Hotel> HotelList;

    public Game(List<Player> pList, Board b, List<Hotel> hList){
        PlayerList = pList;
        Board = b;
        HotelList = hList;
    }

    public Game(){}

    public List<Player> getPlayerList() {
        return PlayerList;
    }

    public Board getBoard() {
        return  Board;
    }

    public List<Hotel> getHotelList() {
        return HotelList;
    }

    @Override
    public boolean playTile(Tile tile){
        List<Tile> adjacentTiles = Board.checkAdjacent(tile);
        List<Hotel> adjacentHotels = new ArrayList<>();
        List<Hotel> hotelsFoundable = new ArrayList<>();
        for (Tile t:adjacentTiles) {
            adjacentHotels.add(t.getH());
        }
        for (Hotel h: HotelList){
            if(h.placed()) {
                hotelsFoundable.add(h);
            }
        }
        if(adjacentTiles.size() > 0 && adjacentHotels.size() < 1 && hotelsFoundable.size() > 0){
            return false;
        }
        Board.placeTile();
        if(adjacentTiles.size() < 1){
            return true;
        }else if(adjacentHotels.size() < 1){
            //Found A Hotel
        }else if(adjacentHotels.size() > 1){
            //Merge
        }else {
            Board.updateTile(tile);
        }
        return true;
    }

    @Override
    public void getStock(Stock Stock,Hotel Hotel){

    }

    @Override
    public void buyStock(Player Player, List<Stock> sList){

    }

    @Override
    public void loadGame(String filePath){
        IOManager ioManager = new IOManager();
        ioManager.loadGame(filePath,Board);
    }

    @Override
    public void saveGame(String filePath){
        IOManager ioManager = new IOManager();
        ioManager.saveGame(this,filePath);
    }

    @Override
    public void handleStock(int action, int amount){
        // Action Keys
        // 1 = Trade
        // 2 = Sell

        //Board.handleStock(action,int,Hotel,Hotel)
    }

    @Override
    public void getBonus(){
        Board.giveBonus();
        return;
    }
}
