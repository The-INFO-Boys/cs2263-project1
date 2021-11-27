package edu.isu.cs.cs2263;

import java.util.List;

public interface System {
    /**
     *
     * @param Tile
     * @return
     */
    public List<Tile> playTile(Tile Tile);

    public void getStock(Stock Stock,Hotel Hotel);

    public boolean buyStock(int playerID, int hotelID, int numOfStock);

    public void loadGame(String filePath);

    public void saveGame(String filePath);

    public void handleStock(int x, int y, int z);

    public int getFirstBonus(int hotelID, int playerID);

    public int getSecondBonus(int hotelID, int playerID);


}
