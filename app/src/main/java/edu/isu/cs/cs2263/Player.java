package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;

public class Player {

    /**
     *This is a Java class for Player.
     */

    /**
     * Represents the variables for Player
     */
    private int ID;
    private List<Tile> Tiles = new ArrayList<>();
    private String Name;
    private int Money;

    /**
     * Player setup.
     * @param id the player's ID
     * @param name the player's Name
     */
    public Player(int id, String name){
        ID = id;
        Money = 6000;
        Name = name;
    }

    /**
     * Getters and Setters for Player
     * getID finds the Player ID, gets their money.
     * @return the player's ID
     */
    public int getID(){return ID;};

    /**
     * getMoney finds the player's money.
     * @return the player's Money.
     */
    public int getMoney(){
        return Money;
    }

    /**
     * setMoney gives money a value.
     * @param value sets player's money value.
     */
    public void setMoney(int value){
        Money = value;
    }

    /**
     * addMoney
     * @param value money being added to player's Money.
     */
    public void addMoney(int value){Money = Money + value;}

    /**
     * subtractMoney
     * @param value money being subtracted from player's Money
     */
    public void subtractMoney(int value){Money = Money - value;}

    /**
     * getName retrieves the player's name.
     * @return the player's Name.
     */
    public String getName(){return Name;}

    /**
     * drawTile draws a tile for the player.
     * @param e tiles from a tile bag.
     */
    public void drawTile(Tile e){
        Tiles.add(e);
    }

    /**
     * removeTile removes a tile from player.
     * @param e tiles in player's hand.
     */
    public void removeTile(Tile e){Tiles.remove(e);};

    /**
     * getHand returns a list of tiles to player.
     * @return list of tile in player's hand.
     */
    public List<Tile> getHand(){return Tiles;}

    /**
     * setHand sets the player's hand with its tiles.
     * @param hand the list of tiles currently in player's hand.
     */
    public void setHand(List<Tile> hand){Tiles = hand;}

    public List<Tile> getTiles(){return Tiles;}

}