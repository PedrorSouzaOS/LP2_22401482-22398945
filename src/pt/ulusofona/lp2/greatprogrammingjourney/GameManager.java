package pt.ulusofona.lp2.greatprogrammingjourney;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class GameManager {
    GameManager(){}
    public boolean createInitialBoard(String[][] playerInfo, int worldSize){
    return false;
    }
    public String getImagePng(int nrSquare){
    return "";
    }
    public String[] getProgrammerInfo(int id){
    return null;
    }
    public String getProgrammerInfoAsStr(int id){
    return "";
    }
    public String[] getSlotInfo(int position){
    return null;
    }
    public int getCurrentPlayerID(){
    return 0;
    }
    public boolean moveCurrentPlayer(int nrSpaces){
        return false;
    }
    public boolean gameIsOver(){
        return false;
    }
    public ArrayList<String> getGameResults(){
        return null;
    }
    public JPanel getAuthorsPanel(){
        return null;
    }
    public HashMap<String, String> customizeBoard(){
        return null;
    }
}
