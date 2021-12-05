package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game implements System {

    /**
     *This is a Java class for Game that implements the System interface.
     */

    //region Private Variables
    /**
     * Represents the private variables for the Game class.
     */
    private List<Player> PlayerList = new ArrayList<>();
    private Board Board;
    private List<Hotel> HotelList = new ArrayList<>();
    private List<Tile> tileBag;

    //endregion

    //region Constructors

    /**
     * Constructors that initialize the game with the player list, board, tiles, and hotel list.
     * @param pList
     * @param b
     * @param hList
     */
    public Game(List<Player> pList, Board b, List<Hotel> hList, List<Tile> tBag) {

        PlayerList = pList;
        Board = b;
        HotelList = hList;
        tileBag = tBag;
    }

    public Game() {
        tileBag = tileInventory();
        Board = edu.isu.cs.cs2263.Board.getInstance();
        PlayerList.add(new Player(0, "Player 1"));
        PlayerList.add(new Player(1, "Player 2"));
        HotelList.add(new Hotel(0, "Super 8", 1));
        HotelList.add(new Hotel(1, "Marriott", 1));
        HotelList.add(new Hotel(2, "La Quinta", 2));
        HotelList.add(new Hotel(3, "Holiday Inn", 2));
        HotelList.add(new Hotel(4, "Hampton Inn", 2));
        HotelList.add(new Hotel(5, "Red Lion", 3));
        HotelList.add(new Hotel(6, "Best Western", 3));
    }

    //endregion

    //region Get & Set

    /**
     * Getter and Setter methods for Game class.
     * Gets tiles, a player list, the board, and hotel list.
     * @return
     */
    public List<Tile> getTileBag() {
        return tileBag;
    }

    public List<Player> getPlayerList() {
        return PlayerList;
    }

    public Board getBoard() {
        return Board;
    }

    public List<Hotel> getHotelList() {
        return HotelList;
    }

    //endregion

    //region private methods

    /**
     * Represents private methods for Game class
     * drawTile draws a random tile from the board for the player.
     * fillHand sets the players hands with tiles and keeps the hand with 6 tiles.
     * getPlayersHand returns the current player's hand.
     * countTiles ---
     * tileInventory is where the player draws tiles from.
     * getStockPrice determines the stock price based off the hotel size.
     *
     * @return
     */
    public Tile drawTile() {
        Random r = new Random();
        int selection = r.nextInt(this.tileBag.size());
        Tile t = tileBag.get(selection);
        this.tileBag.remove(selection);
        return t;
    }

    public void fillHand(int playerID) {
        List<Tile> playerHand = PlayerList.get(playerID).getHand();
        while (playerHand.size() != 6) {
            playerHand.add(drawTile());
        }
        PlayerList.get(playerID).setHand(playerHand);
    }

    public List<Tile> getPlayersHand(int playerID) {
        return PlayerList.get(playerID).getHand();
    }

    private List<Tile> countTiles(List<Player> pList, Board b) {
        List<Tile> undrawnTiles = new ArrayList<>();
        return undrawnTiles;
    }

    private List<Tile> tileInventory() {
        List<Tile> retList = new ArrayList<>();
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 9; y++) {
                retList.add(new Tile(x + 1, y + 1));
            }
        }
        return retList;
    }

    public int getStockPrice(int hotelID) {
        Hotel h = HotelList.get(hotelID);
        int hotelSize = Board.getHotelSize(h);
        int retValue = 0;
        if(hotelSize < 2) {
            retValue = 0;
        } else if (hotelSize == 2) {
            retValue = 200;
        } else if (hotelSize == 3) {
            retValue = 300;
        } else if (hotelSize == 4) {
            retValue = 400;
        } else if (hotelSize == 5) {
            retValue = 500;
        } else if (hotelSize < 11) {
            retValue = 600;
        } else if (hotelSize < 21) {
            retValue = 700;
        } else if (hotelSize < 31) {
            retValue = 800;
        } else if (hotelSize < 41) {
            retValue = 900;
        } else if (hotelSize > 40) {
            retValue = 1000;
        }
        if(hotelSize > 1) {
            if (h.getTypeID() == 2) {
                retValue = retValue + 100;
            } else if (h.getTypeID() == 3) {
                retValue = retValue + 200;
            }
        }
        return retValue;
    }

    public int getStockPrice(int hotelID, int hotelSize) {
        Hotel h = HotelList.get(hotelID);
        int retValue = 0;
        if(hotelSize < 2) {
            retValue = 0;
        } else if (hotelSize == 2) {
            retValue = 200;
        } else if (hotelSize == 3) {
            retValue = 300;
        } else if (hotelSize == 4) {
            retValue = 400;
        } else if (hotelSize == 5) {
            retValue = 500;
        } else if (hotelSize < 11) {
            retValue = 600;
        } else if (hotelSize < 21) {
            retValue = 700;
        } else if (hotelSize < 31) {
            retValue = 800;
        } else if (hotelSize < 41) {
            retValue = 900;
        } else if (hotelSize > 40) {
            retValue = 1000;
        }
        if(hotelSize > 1) {
            if (h.getTypeID() == 2) {
                retValue = retValue + 100;
            } else if (h.getTypeID() == 3) {
                retValue = retValue + 200;
            }
        }
        return retValue;
    }

    //endregion

    //region public methods

    /**
     * Represents the public methods for Game class.
     * determineFirst method draws tiles and determines who goes first based off who is closest to 1A.
     * getFoundedHotels method returns a list of founded hotels.
     * getFoundableHotels method
     * removeTile
     * playTile allows the player to play a tile from their hand. From there, the tile placed will either
     * be placed successfully with nothing else happening, a hotel could be founded, a merge between hotels will start,
     * or if a tile cannot be placed (like to found a hotel after max number of hotels have been founded) then the tile
     * is returned with an error.
     * buyStock allows the player to buy stock and the price will depend on the hotel (size comes from hotel ID).
     * loadGame loads in previous game state.
     * saveGame saves current game state.
     * getStock
     * handleStock gives the option to trade or sell stock.
     * getFirstBonus and getSecondBonus gives a bonus to the player based on their owned hotel size.
     * merge happens when two chains connect. The smaller hotel merges into the larger one and the larger one remains.
     * @param idHotel
     * @param idPlayer
     * @param newHotel
     */
    public void foundHotel(int idHotel, int idPlayer, List<Tile> newHotel) {
        if (HotelList.get(idHotel).found(PlayerList.get(idPlayer))) {
            Board.foundHotel(newHotel, HotelList.get(idHotel));
        }
    }

    public int determineFirst() {
        Tile player1 = drawTile();
        playTile(player1);
        Tile player2 = drawTile();
        playTile(player2);
        if (player1.getColumn() + player1.getRow() < player2.getColumn() + player2.getRow()) {
            //Player 1 Tile was closer to 1A
            return PlayerList.get(0).getID();
        } else if (player1.getColumn() + player1.getRow() > player2.getColumn() + player2.getRow()) {
            //Player 2 Tile was closer to 1A
            return PlayerList.get(1).getID();
        } else if (player1.getColumn() + player1.getRow() == player2.getColumn() + player2.getRow()) {
            //Equal tiles, Player 1 goes first
            return PlayerList.get(0).getID();
        } else {
            //Should not get here
            return 3;
        }
    }

    public List<Hotel> getFoundedHotels() {
        List<Hotel> retList = new ArrayList<>();
        for (Hotel h : HotelList) {
            if (h.getFounded()) {
                retList.add(h);
            }
        }
        return retList;
    }

    public List<Hotel> getFoundableHotels() {
        List<Hotel> retList = new ArrayList<>();
        for (Hotel h : HotelList) {
            if (!h.getFounded()) {
                retList.add(h);
            }
        }
        return retList;
    }

    public void removeTile(Tile tile, int playerID) {
        PlayerList.get(playerID).removeTile(tile);
    }

    @Override
    public List<Tile> playTile(Tile tile) {
        List<Tile> tilesToReturn = new ArrayList<>();
        List<Tile> adjacentTiles = Board.checkAdjacent(tile);
        List<Hotel> adjacentHotels = new ArrayList<>();
        List<Hotel> hotelsFoundable = new ArrayList<>();
        for (Tile t : adjacentTiles) {
            if (t.getHotel() != null && !adjacentHotels.contains(t.getHotel())) {
                adjacentHotels.add(t.getHotel());
            }
        }
        if (adjacentTiles.size() > 0) {
            for (Hotel h : HotelList) {
                if (!h.getFounded()) {
                    hotelsFoundable.add(h);
                }
            }
        }
        if (adjacentTiles.size() > 0 && adjacentHotels.size() < 1 && hotelsFoundable.size() < 1) {
            //Error - Return Fake Tile
            tilesToReturn.add(new Tile(99,99));
            return tilesToReturn;
        }
        Board.placeTile(tile);
        if (adjacentTiles.size() < 1) {
            //Success - nothing to return
            return tilesToReturn;
        } else if (adjacentHotels.size() < 1) {
            //Found A Hotel
            tilesToReturn.addAll(adjacentTiles);
            tilesToReturn.add(tile);
            return tilesToReturn;
        } else if (adjacentHotels.size() > 1) {
            //Merge
            tilesToReturn.addAll(adjacentTiles);
            return tilesToReturn;
        } else {
            //Success
            Board.updateTile(tile, adjacentHotels.get(0));
            tile.setHotel(adjacentHotels.get(0));
            tilesToReturn.add(tile);
            return tilesToReturn;
        }
    }

    @Override
    public boolean buyStock(int playerID, int hotelID, int numOfStock) {
        List<Stock> stockList = HotelList.get(hotelID).getAvailable();
        Player p = PlayerList.get(playerID);
        int stockPrice = getStockPrice(hotelID);
        if (stockList.size() >= numOfStock && p.getMoney() >= (stockPrice * numOfStock)) {
            p.subtractMoney(numOfStock * stockPrice);
            int count = 0;
            for (Stock s : stockList) {
                if (s.getPlayer() == null) {
                    s.setPlayer(p);
                    HotelList.get(hotelID).UpdateStock(s.getID(), s);
                    count++;
                    if (count == numOfStock) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void loadGame(String filePath) {
        IOManager ioManager = new IOManager();
        Game temp = ioManager.loadGame(filePath);
        this.tileBag = temp.tileBag;
        this.HotelList = temp.HotelList;
        this.PlayerList = temp.PlayerList;
        this.Board = temp.Board;
    }

    @Override
    public void saveGame(String filePath) {
        IOManager ioManager = new IOManager();
        ioManager.saveGame(this, filePath);
    }

    //endregion

    @Override
    public void getStock(Stock Stock, Hotel Hotel) {
        //Did not find in Use Case
    }

    @Override
    public void handleStock(int action, int amount, int playerID, int defuncthotelID, int superHotelID, int defunctHotelSize) {
        // Action Keys
        // 1 = Trade
        // 2 = Sell

        int count = 0;
        List<Stock> dhStock = HotelList.get(defuncthotelID).getStockList();
        List<Stock> shStock = HotelList.get(superHotelID).getAvailable();
        if(action == 1 && amount % 2 == 1){
            amount--;
        }
        for(Stock s : dhStock){
            if(s.getPlayer().getID() == playerID){
                s.setPlayer(null);
                HotelList.get(defuncthotelID).UpdateStock(s.getID(),s);
                count++;
                if(count == amount){
                    break;
                }
            }
        }
        if (action == 1) {
            count = 0;
            for(Stock s : shStock){
                s.setPlayer(PlayerList.get(playerID));
                HotelList.get(superHotelID).UpdateStock(s.getID(),s);
                count ++;
                if(count == amount / 2){
                    break;
                }
            }
        } else if (action == 2) {
            PlayerList.get(playerID).addMoney((getStockPrice(defuncthotelID,defunctHotelSize) * amount));
        } else {
            //Shouldnt get here
        }
    }

    @Override
    public int getFirstBonus(int hotelID) {
        Hotel h = HotelList.get(hotelID);
        int hotelSize = Board.getHotelSize(h);
        int retValue = 0;
        if(hotelSize < 2) {
            retValue = 0;
        } else if (hotelSize == 2) {
            retValue = 2000;
        } else if (hotelSize == 3) {
            retValue = 3000;
        } else if (hotelSize == 4) {
            retValue = 4000;
        } else if (hotelSize == 5) {
            retValue = 5000;
        } else if (hotelSize < 11) {
            retValue = 6000;
        } else if (hotelSize < 21) {
            retValue = 7000;
        } else if (hotelSize < 31) {
            retValue = 8000;
        } else if (hotelSize < 41) {
            retValue = 9000;
        } else if (hotelSize > 40) {
            retValue = 10000;
        }
        if(hotelSize > 1) {
            if (h.getTypeID() == 2) {
                retValue = retValue + 1000;
            } else if (h.getTypeID() == 3) {
                retValue = retValue + 2000;
            }
        }
        return retValue;
    }

    public int getFirstBonus(int hotelID, int hotelSize) {
        Hotel h = HotelList.get(hotelID);
        int retValue = 0;
        if(hotelSize < 2) {
            retValue = 0;
        } else if (hotelSize == 2) {
            retValue = 2000;
        } else if (hotelSize == 3) {
            retValue = 3000;
        } else if (hotelSize == 4) {
            retValue = 4000;
        } else if (hotelSize == 5) {
            retValue = 5000;
        } else if (hotelSize < 11) {
            retValue = 6000;
        } else if (hotelSize < 21) {
            retValue = 7000;
        } else if (hotelSize < 31) {
            retValue = 8000;
        } else if (hotelSize < 41) {
            retValue = 9000;
        } else if (hotelSize > 40) {
            retValue = 10000;
        }
        if(hotelSize > 1) {
            if (h.getTypeID() == 2) {
                retValue = retValue + 1000;
            } else if (h.getTypeID() == 3) {
                retValue = retValue + 2000;
            }
        }
        return retValue;
    }

    @Override
    public int getSecondBonus(int hotelID) {
        Hotel h = HotelList.get(hotelID);
        int hotelSize = Board.getHotelSize(h);
        int retValue = 0;
        if(hotelSize < 2) {
            retValue = 0;
        } else if (hotelSize == 2) {
            retValue = 1000;
        } else if (hotelSize == 3) {
            retValue = 1500;
        } else if (hotelSize == 4) {
            retValue = 2000;
        } else if (hotelSize == 5) {
            retValue = 2500;
        } else if (hotelSize < 11) {
            retValue = 3000;
        } else if (hotelSize < 21) {
            retValue = 3500;
        } else if (hotelSize < 31) {
            retValue = 4000;
        } else if (hotelSize < 41) {
            retValue = 4500;
        } else if (hotelSize > 40) {
            retValue = 5000;
        }
        if(hotelSize > 1) {
            if (h.getTypeID() == 2) {
                retValue = retValue + 500;
            } else if (h.getTypeID() == 3) {
                retValue = retValue + 1000;
            }
        }
        return retValue;
    }

    public int getSecondBonus(int hotelID, int hotelSize) {
        Hotel h = HotelList.get(hotelID);
        int retValue = 0;
        if(hotelSize < 2) {
            retValue = 0;
        } else if (hotelSize == 2) {
            retValue = 1000;
        } else if (hotelSize == 3) {
            retValue = 1500;
        } else if (hotelSize == 4) {
            retValue = 2000;
        } else if (hotelSize == 5) {
            retValue = 2500;
        } else if (hotelSize < 11) {
            retValue = 3000;
        } else if (hotelSize < 21) {
            retValue = 3500;
        } else if (hotelSize < 31) {
            retValue = 4000;
        } else if (hotelSize < 41) {
            retValue = 4500;
        } else if (hotelSize > 40) {
            retValue = 5000;
        }
        if(hotelSize > 1) {
            if (h.getTypeID() == 2) {
                retValue = retValue + 500;
            } else if (h.getTypeID() == 3) {
                retValue = retValue + 1000;
            }
        }
        return retValue;
    }

    public int merge(int hotelID1, int hotelID2){
        Hotel h1 = HotelList.get(hotelID1);
        List<Tile> h1Tiles = new ArrayList<>();
        for(Tile t:getBoard().getTiles()){
            if(t.getHotel() != null && t.getHotel().getID() == hotelID2){
                t.setHotel(h1);
                h1Tiles.add(t);
            } else if(t.getHotel() != null && t.getHotel().getID() == hotelID1){
                h1Tiles.add(t);
            }
        }
        for(Tile t: h1Tiles){
            for(Tile aT : Board.checkAdjacent(t)){
                if(aT.getHotel() == null){
                    aT.setHotel(h1);
                    for(Tile aAT : Board.checkAdjacent(aT)){
                        if(aAT.getHotel() == null){
                            aAT.setHotel(h1);
                        }
                    }
                }
            }
        }
        HotelList.get(hotelID2).unFound();
        return hotelID1;
    }
}
