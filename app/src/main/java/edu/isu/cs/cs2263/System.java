package edu.isu.cs.cs2263;

import java.util.List;

public interface System {
    /**
     *A java interface class with methods.
     * The getStock gets the stock for the hotel.
     * The buyStock method gets the player's ID, the hotel's ID, and the
     * amount of stock available to buy.
     * The loadGame method loads in a game when the button is clicked.
     * The saveGame method saves the current game when the button is clicked.
     *
     * @param Tile
     * @return
     */
    public List<Tile> playTile(Tile Tile);

    public void getStock(Stock Stock,Hotel Hotel);

    public boolean buyStock(int playerID, int hotelID, int numOfStock);

    public void loadGame(String filePath);

    public void saveGame(String filePath);

    public void handleStock(int action, int amount, int playerID, int hotelID);

    public int getFirstBonus(int hotelID);

    public int getSecondBonus(int hotelID);


}
