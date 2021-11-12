package edu.isu.cs.cs2263;

import java.util.List;

public interface System {

    public List<Tile> playTile(Tile Tile);

    public void getStock(Stock Stock,Hotel Hotel);

    public boolean buyStock(Player Player, Stock stockToBuy, int numOfStock);

    public void loadGame(String filePath);

    public void saveGame(String filePath);

    public void handleStock(int x, int y);

    public void getBonus();
}
