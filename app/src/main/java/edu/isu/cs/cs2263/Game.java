package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game implements System {

    //region Private Variables

    private List<Player> PlayerList = new ArrayList<>();
    private Board Board;
    private List<Hotel> HotelList = new ArrayList<>();
    private List<Tile> tileBag;

    //endregion

    //region Constructors

    public Game(List<Player> pList, Board b, List<Hotel> hList){
        PlayerList = pList;
        Board = b;
        HotelList = hList;
        tileBag = countTiles(pList,b);
    }

    public Game(){
        tileBag = tileInventory();
        Board = edu.isu.cs.cs2263.Board.getInstance();
        PlayerList.add(new Player(1,"Player 1"));
        PlayerList.add(new Player(2,"Player 2"));
        HotelList.add(new Hotel(1,"Hotel 1",1));
        HotelList.add(new Hotel(2,"Hotel 2",1));
        HotelList.add(new Hotel(3,"Hotel 3",2));
        HotelList.add(new Hotel(4,"Hotel 4",2));
        HotelList.add(new Hotel(5,"Hotel 5",3));
        HotelList.add(new Hotel(6,"Hotel 6",3));
        HotelList.add(new Hotel(7,"Hotel 7",4));
        HotelList.add(new Hotel(8,"Hotel 8",4));
    }

    //endregion

    //region Get & Set

    public List<Tile> getTileBag() {
        return tileBag;
    }

    public List<Player> getPlayerList() {
        return PlayerList;
    }

    public Board getBoard() {
        return  Board;
    }

    public List<Hotel> getHotelList() {
        return HotelList;
    }

    //endregion

    //region private methods

    private Tile drawTile(){
        Random r = new Random();
        int selection = r.nextInt(this.tileBag.size());
        Tile t = tileBag.get(selection);
        this.tileBag.remove(selection);
        return t;
    }

    private List<Tile> countTiles(List<Player> pList, Board b){
        List<Tile> undrawnTiles = new ArrayList<>();
        return undrawnTiles;
    }

    private List<Tile> tileInventory(){
        List<Tile> retList = new ArrayList<>();
        for(int x = 0; x < 12; x++){
            for(int y = 0; y < 9; y++){
                retList.add(new Tile(x + 1,y + 1));
            }
        }
        return retList;
    }

    //endregion

    //region public methods

    public int determineFirst(){
        Tile player1 = drawTile();
        playTile(new Tile(1,1));
        Tile player2 = drawTile();
        playTile(new Tile(1,2));
        if(player1.getColumn() + player1.getRow() < player2.getColumn() + player2.getRow()){
            //Player 1 Tile was closer to 1A
            return 1;
        } else if(player1.getColumn() + player1.getRow() > player2.getColumn() + player2.getRow()){
            //Player 2 Tile was closer to 1A
            return 2;
        } else if(player1.getColumn() + player1.getRow() == player2.getColumn() + player2.getRow()) {
            //Equal tiles, Player 1 goes first
            return 1;
        }else {
            //Should not get here
            return 3;
        }
    }

    @Override
    public int playTile(Tile tile){
        List<Tile> adjacentTiles = Board.checkAdjacent(tile);
        List<Hotel> adjacentHotels = new ArrayList<>();
        List<Hotel> hotelsFoundable = new ArrayList<>();
        for (Tile t:adjacentTiles) {
            if(t.getHotel() != null) {
                adjacentHotels.add(t.getHotel());
            }
        }
        if(adjacentTiles.size() > 0 ) {
            for (Hotel h : HotelList) {
                if (h.getFounded() == false) {
                    hotelsFoundable.add(h);
                }
            }
        }
        if(adjacentTiles.size() > 0 && adjacentHotels.size() < 1 && hotelsFoundable.size() < 1){
            //Error
            return 1;
        }
        Board.placeTile(tile);
        if(adjacentTiles.size() < 1){
            //Success
            return 0;
        }else if(adjacentHotels.size() < 1){
            //Found A Hotel
            return 2;
        }else if(adjacentHotels.size() > 1){
            //Merge
            return 3;
        }else {
            //Success
            Board.updateTile(tile);
            return 0;
        }
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

    //endregion

    @Override
    public void getStock(Stock Stock,Hotel Hotel){
        //Did not find in Use Case
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
