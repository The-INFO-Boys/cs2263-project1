package edu.isu.cs.cs2263;

import java.sql.Struct;
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
            adjacentHotels.add(t.getHotel());
        }
        for (Hotel h: HotelList){
            if(h.getFounded() == true) {
                hotelsFoundable.add(h);
            }
        }
        if(adjacentTiles.size() > 0 && adjacentHotels.size() < 1 && hotelsFoundable.size() > 0){
            return false;
        }
        Board.placeTile(tile);
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
        //Did not find in Use Case
    }

    @Override
    public boolean buyStock(Player Player, Stock stockToBuy, int numOfStock){
        List<Stock> stockList = stockToBuy.getHotel().getAvailable();
        List<Player> pList = getPlayerList();
        for (Player p : pList) {
            if (p == Player) {
                int stockPrice = 50;
                if(stockList.size() >= numOfStock && p.getMoney() >= numOfStock * stockPrice /*STOCK PRICE*/){
                    p.setMoney(p.getMoney() - (numOfStock * stockPrice));
                        for(Hotel h : HotelList){
                            if(h == stockToBuy.getHotel()){
                                int count = 0;
                                while(count < numOfStock){
                                    for(Stock s : h.getStockList()){
                                        if(s.getPlayer() == null){
                                            s.setPlayer(p);
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                } else {
                    return false;
                }
            }
        }
return true;
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

        //Needs called when merge occurs?
    }

    @Override
    public void getBonus(){
        Board.giveBonus();
    }
}
