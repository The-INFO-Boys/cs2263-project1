package edu.isu.cs.cs2263;

import java.util.List;

public interface System {
    /**
     * A java interface class with methods.
     * playTile is a method that plays a Tile
     * @param Tile all tiles.
     */
    public List<Tile> playTile(Tile Tile);

    /**
     * getStock gets the stock for the hotel.
     * @param Stock all the stock for a hotel.
     * @param Hotel all the hotels available.
     */
    public void getStock(Stock Stock,Hotel Hotel);

    /**
     * buyStock method gets the player's ID, the hotel's ID, and the
     * amount of stock available to buy.
     * @param playerID the ID from any player's playing
     * @param hotelID the ID from any available founded hotel.
     * @param numOfStock the number of stock available to buy.
     * @return if stock can be bought or not.
     */
    public boolean buyStock(int playerID, int hotelID, int numOfStock);

    /**
     * loadGame method loads in a game when the button is clicked.
     * @param filePath the location where the previous game state is stored.
     */
    public void loadGame(String filePath);

    /**
     * saveGame method saves the current game when the button is clicked.
     * @param filePath the location where the current game state will be stored.
     */
    public void saveGame(String filePath);

    /**
     * handleStock
     * @param action what to do with stock (buy/sell)
     * @param amount the amount of stock
     * @param playerID the player(s) ID
     * @param defunctHotelID ID for a hotel that is no longer founded.
     * @param superHotelID the ID for a super hotel
     */
    public void handleStock(int action, int amount, int playerID, int defunctHotelID, int superHotelID);

    /**
     * getFirstBonus
     * @param hotelID the ID for the hotel
     * @return bonus for the player
     */
    public int getFirstBonus(int hotelID);

    /**
     * getSecondBonus
     * @param hotelID the ID for the hotel
     * @return bonus for the player.
     */
    public int getSecondBonus(int hotelID);


}
