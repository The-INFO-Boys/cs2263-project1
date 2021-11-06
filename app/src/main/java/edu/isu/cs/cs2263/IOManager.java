package edu.isu.cs.cs2263;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOManager {

    public void saveGame(Game game, String fileLocation){
        Gson gson = new Gson();
        try{
            File f = new File(fileLocation);
            if(f.exists()){
                f.delete();
            }
            FileWriter fw = new FileWriter(fileLocation, true);
            for(Player p : game.getPlayerList()){
                fw.write(gson.toJson(p) + "\n");
            }
            for(Hotel h : game.getHotelList()){
                fw.write(gson.toJson(h) + "\n");
            }
            fw.write(gson.toJson(game.getBoard() + "\n"));
            fw.close();
        }catch (Exception e){}
    }

    public Game loadGame(String fileLocation, Board game){
        List<Hotel> hList = new ArrayList<>();
        List<Player> pList = new ArrayList<>();
        Board b = game;
        Gson gson = new Gson();
        File f = new File(fileLocation);
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.contains("Money")){
                    pList.add(gson.fromJson(line,Player.class));
                } else if(line.contains("TypeID")){
                    hList.add(gson.fromJson(line,Hotel.class));
                } else {
                    b = gson.fromJson(line,Board.class);
                }
            }
            sc.close();
            Game retGame = new Game(pList,b,hList);
        }catch (Exception e){}
        return new Game();
    }
}
