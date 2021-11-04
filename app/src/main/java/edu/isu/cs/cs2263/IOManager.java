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
            for(PlayerToReplace p : game.getPlayerList()){
                fw.write(gson.toJson(p) + "\n");
            }
            for(HotelToReplace h : game.getHotelList()){
                fw.write(gson.toJson(h) + "\n");
            }
            fw.write(gson.toJson(game.getBoard() + "\n"));
            fw.close();
        }catch (Exception e){}
    }

    public Game loadGame(String fileLocation){
        List<HotelToReplace> hList = new ArrayList<>();
        List<PlayerToReplace> pList = new ArrayList<>();
        BoardToReplace b = new BoardToReplace();
        Gson gson = new Gson();
        File f = new File(fileLocation);
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.contains("Money")){
                    pList.add(gson.fromJson(line,PlayerToReplace.class));
                } else if(line.contains("TypeID")){
                    hList.add(gson.fromJson(line,HotelToReplace.class));
                } else {
                    b = gson.fromJson(line,BoardToReplace.class);
                }
            }
            sc.close();
            Game retGame = new Game(pList,b,hList);
        }catch (Exception e){}
        return new Game();
    }
}
