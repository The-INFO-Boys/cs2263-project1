package edu.isu.cs.cs2263;

import java.lang.reflect.*;
import java.util.List;
import java.util.ArrayList;


public class Board {

    //region private variables

    private Tile[][] board = setBoard();

    //endregion

    //region Singleton

    //private static volatile Board singleton
    /* public static Board instance(){
        Board local = singleton;
        if(local==null){
            synchronized (this){
                local = singleton;
                if(local==null){
                    singleton = local = new Board();
                }
            }
        }
        return singleton;
    }*/
    private Board(){}
    private static Board single_instance = null;
    public static Board getInstance(){
        if(single_instance == null){
            single_instance = new Board();
        }
        return single_instance;
    }
    //endregion

    //region private methods


    public Tile[][] getBoard() {
        return board;
    }

    private Tile[][] setBoard(){
        Tile[][] tileBoard = new Tile [12][9];
        for(int x = 0; x < 12; x++){
            for(int y = 0; y < 9; y++){
                tileBoard[x][y] = (new Tile(x + 1,y + 1));
            }
        }
        return tileBoard;
    }

    //endregion

    //region public methods

    public void foundHotel(List<Tile> newHotel, Hotel h){
        for(Tile t: newHotel){
            board[t.getColumn()][t.getRow()].setHotel(h);
        }
    }

    public List<Tile> checkAdjacent(Tile tile){
        List<Tile> tileList = new ArrayList<>();
        Tile north = null;
        Tile south = null;
        Tile east = null;
        Tile west = null;
        if(tile.getColumn() + 1 < 12) {
            north = board[tile.getColumn() + 1][tile.getRow()];
        }
        if(tile.getColumn() - 1 > -1) {
            south = board[tile.getColumn() - 1][tile.getRow()];
        }
        if(tile.getRow() + 1 < 9) {
            east = board[tile.getColumn()][tile.getRow() + 1];
        }
        if(tile.getRow() - 1 > -1) {
            west = board[tile.getColumn()][tile.getRow() - 1];
        }
        if (north != null && north.getPlaced() == true) {
            tileList.add(north);
        }
        if (south != null && south.getPlaced() == true) {
            tileList.add(south);
        }
        if (east != null && east.getPlaced() == true) {
            tileList.add(east);
        }
        if (west != null && west.getPlaced() == true) {
            tileList.add(west);
        }
        return tileList;
    }

    public void placeTile(Tile tile){
        this.board[tile.getColumn()][tile.getRow()].setPlaced();
    }
    public void updateTile(Tile tile, Hotel h){
        tile.setHotel(h);
    }
    public List<Hotel> checkPresentHotels(){
        List<Hotel> hotelList = new ArrayList<Hotel>();
        return hotelList;
    }
    public List<Hotel> getHotels(){
        List<Hotel> hotelList = new ArrayList<Hotel>();
        return hotelList;
    }
    public Hotel getHotel(){

        return new Hotel(99,"To be Implemented",5);
    }
    public void loadSystem(){

    }
    public void saveSystem(){
    }
    public int checkHotelSize(String Hotel){
        int size = 0;
        return size;
    }
    public void mergeHotels(String HotelToReplace1,String HotelToReplace2) {
    }
    public int giveBonus(){
        int bonus = 0;
        return bonus;
    }
    public void handleStock(int player1,int player2,Hotel Hotel1,Hotel Hotel2){

    }
    //endregion
}

//Some late night stuff that I forgot to push awhile ago

//public class Board {
    //private Map <String, Hotel> board;
    //private List <String> row;
    //private List <String> column;
    //private Map <String, Set<String>> hotelTiles;
    //private static Board b;

    //private Board() {
        //row = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I");
        //column = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        //board = new HashMap<String, Hotel>();
        //hotelTiles = new HashMap<String, Set<String>>();
    //}

    //public static Board getInstance() {
        //return new Board();
    //}

//public Board createBoard() {
        //for (String row: row) {
            //for (String column: column) {
                //Tile tile = new Tile();
                //tile.setColumn(column);
                //tile.setRow(row);
                //this.board.put(tile.getTileLabel(row, column), null);
            //}
        //}
        //return board;
    //}

    //public Map<String, Hotel> getOccupiedTile() {
        //Map <String, Hotel> occupiedTile = new HashMap<>();
        //for (String tile : board.keySet()) {
            //if (board.get(tile) != null) {
                //occupiedTile.put(tile, board.get(tile));
            //}
        //}
        //return occupiedTile;
    //}

    //public Map<String, Set<String>> getHotelTile() {
        //Map <String, Hotel> occupiedTile = getOccupiedTile();
        //Map <String, List<String>> hotelTile = new HashMap<>();
        //for (String tile : occupiedTile.keySet()) {
            //if (!occupiedTile.get(tile).getLabel().equals(Config.Moves.SINGLETON.getMove())) {
                //if (!hotelTile.containsKey(occupiedTile.get(tile).getLabel())) {
                    //hotelTile.put(occupiedTile.get(tile).getLabel(), new HashSet<>(Arrays.asList(tile)));
                //} else {
                    //Set<String> tiles = hotelTile.get(occupiedTile.get(tile).getLabel());
                    //tiles.add(tile);
                    //hotelTile.put(occupiedTile.get(tile).getLabel(), tiles);
                //}


            //}
        //}
        //return hotelTile;

    //}

    //public List<String> getRow(){
        //return row;
    //}

    //public List<String> getColumn(){
        //return columns;
    //}

    //public Map <String, Hotel> getBoard() {
        //return board;
    //}

    //public void clear() {
        //b = null;
    //}

    //public List<String> getEmptyTile() {
        //List<String> allTile = new ArrayList<>();
        //for (String row: row) {
            //for (String column: column) {
                //allTile.add(column + row);
            //}
        //}
        //allTile.removeAll(board.keySet());
        //return allTiles;
    //}
//}