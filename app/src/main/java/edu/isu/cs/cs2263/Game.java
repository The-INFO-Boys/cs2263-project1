package edu.isu.cs.cs2263;

import java.util.List;

class TileToReplace{}
class StockToReplace{}
class HotelToReplace{}
class PlayerToReplace{}
class BoardToReplace{}

public class Game {

    private List<PlayerToReplace> PlayerList;
    private BoardToReplace Board;
    private List<HotelToReplace> HotelList;

    public Game(List<PlayerToReplace> pList, BoardToReplace b, List<HotelToReplace> hList){
        PlayerList = pList;
        Board = b;
        HotelList = hList;
    }

    public Game(){}

    public List<PlayerToReplace> getPlayerList() {
        return PlayerList;
    }

    public BoardToReplace getBoard() {
        return  Board;
    }

    public List<HotelToReplace> getHotelList() {
        return HotelList;
    }
}
