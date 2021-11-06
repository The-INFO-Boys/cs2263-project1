package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;

class TileToReplace{}
class StockToReplace{}
class HotelToReplace{}
class PlayerToReplace{}

public class Game implements System {

    private List<PlayerToReplace> PlayerList;
    private Board Board;
    private List<HotelToReplace> HotelList;

    public Game(List<PlayerToReplace> pList, Board b, List<HotelToReplace> hList){
        PlayerList = pList;
        Board = b;
        HotelList = hList;
    }

    public Game(){}

    public List<PlayerToReplace> getPlayerList() {
        return PlayerList;
    }

    public Board getBoard() {
        return  Board;
    }

    public List<HotelToReplace> getHotelList() {
        return HotelList;
    }

    @Override
    public boolean playTile(TileToReplace Tile){
        List<TileToReplace> adjacentTiles = Board.checkAdjacent(Tile);
        List<HotelToReplace> adjacentHotels = new ArrayList<>();
        List<HotelToReplace> hotelsFoundable = new ArrayList<>();
        for (TileToReplace t:adjacentTiles) {
            adjacentHotels.add(t.Hotel);
        }
        for (HotelToReplace h: HotelList){
            if(h.placed() == true) {
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
            Board.updateTile(Tile);
        }
        return true;
    }

    @Override
    public void getStock(StockToReplace Stock,HotelToReplace Hotel){

    }

    @Override
    public void buyStock(PlayerToReplace Player, List<StockToReplace> sList){

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
