package edu.isu.cs.cs2263;

import java.util.List;

public interface System {

    public boolean playTile(TileToReplace Tile);

    public void getStock(StockToReplace Stock,HotelToReplace Hotel);

    public void buyStock(PlayerToReplace Player, List<StockToReplace> sList);

    public void loadGame(String filePath);

    public void saveGame(String filePath);

    public void handleStock(int x, int y);

    public void getBonus();
}
