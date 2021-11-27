package edu.isu.cs.cs2263;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOManager {

    /**
     *This is a Java class for IOManager.
     *Handles Save and Load Game.
     * @param game
     * @param fileLocation
     */

    public void saveGame(Game game, String fileLocation){
        Gson gson = new Gson();
        try{
            File f = new File(fileLocation);
            if(f.exists()){
                f.delete();
            }
            FileWriter fw = new FileWriter(fileLocation, true);
            //for(Player p : game.getPlayerList()){
            //    fw.write(gson.toJson(p) + "\n");
            //}
            //for(Hotel h : game.getHotelList()){
            //    fw.write(gson.toJson(h) + "\n");
            //}
            //BoardHelper boardHelper = new BoardHelper(game.getBoard().getBoard());
            //fw.write(gson.toJson(boardHelper + "\n"));
            fw.write(gson.toJson(game));
            fw.close();
        }catch (Exception e){}
    }

    public Game loadGame(String fileLocation){
        //List<Hotel> hList = new ArrayList<>();
        //List<Player> pList = new ArrayList<>();
        //Board b = game;
        Game retGame = null;
        Gson gson = new Gson();
        File f = new File(fileLocation);
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                //String line = sc.nextLine();
                //if(line.contains("Money")){
                //    pList.add(gson.fromJson(line,Player.class));
                //} else if(line.contains("TypeID")){
                //    hList.add(gson.fromJson(line,Hotel.class));
                //} else {
                //    b = gson.fromJson(line,Board.class);
                //}
                retGame = gson.fromJson(sc.nextLine(),Game.class);
            }
            sc.close();
        }catch (Exception e){}
        return retGame;
    }
}
