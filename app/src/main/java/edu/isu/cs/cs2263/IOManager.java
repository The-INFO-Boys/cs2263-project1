package edu.isu.cs.cs2263;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOManager {

    /**
     * This is a Java class for IOManager.
     */

    /**
     * saveGame saves the current game state.
     * @param game the current game state (tiles, player info, etc.)
     * @param fileLocation wherever the player decides to store the game state.
     */
    public void saveGame(Game game, String fileLocation){
        Gson gson = new Gson();
        try{
            File f = new File(fileLocation);
            if(f.exists()){
                f.delete();
            }
            FileWriter fw = new FileWriter(fileLocation, true);
            fw.write(gson.toJson(game));
            fw.close();
        }catch (Exception e){}
    }

    /**
     * loadGame loads in a previous game state.
     * @param fileLocation wherever the game state was saved
     * @return previous game state
     */
    public Game loadGame(String fileLocation){
        Game retGame = null;
        Gson gson = new Gson();
        File f = new File(fileLocation);
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                retGame = gson.fromJson(sc.nextLine(),Game.class);
            }
            sc.close();
        }catch (Exception e){}
        return retGame;
    }
}
