package edu.isu.cs.cs2263;

import java.util.List;

public interface System {

    public void playTile(TileToReplace Tile);

    public void getStock(StockToReplace Stock,HotelToReplace Hotel);

    public void buyStock(PlayerToReplace Player, List<StockToReplace> sList);

    public void loadGame();

    public void saveGame();

    public void handleStock(int x, int y);

    public int getBonus();
}
