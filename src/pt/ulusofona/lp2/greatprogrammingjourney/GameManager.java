package pt.ulusofona.lp2.greatprogrammingjourney;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class GameManager {
    public String[] tabuleiro;
    public String[][] jogadores;
    public GameManager(){
        this.jogadores = new String[4][];
        jogadores[0] = new String[]{"2", "Guido van Rossum", "Python", "Blue"};
        jogadores[1] = new String[]{"3", "Ada Lovelace", "Ada", "Green"};
        jogadores[2] = new String[]{"4", "John McCarthy", "Lisp", "Brown"};
        jogadores[3] = new String[]{"1", "Joshua Bloch", "Java", "Purple"};
    }
    public boolean createInitialBoard(String[][] playerInfo, int worldSize){
        if (playerInfo.length!= 2 && playerInfo.length!=4){
            return false;
        }
        String[] testeId = new String[playerInfo.length];
    for(int i= 0; i<playerInfo.length; i++ ){
        for(int j= 0;j<=i; j++){
            if(Objects.equals(testeId[j], playerInfo[i][1])){
                return false;
            }
            testeId[i] = playerInfo[i][1];
        }
    }

        return true;
    }
    public String getImagePng(int nrSquare){
    return "";
    }
    public String[] getProgrammerInfo(int id){
          String[][] var0 = new String[4][];
            var0[0] = new String[]{"2", "Guido van Rossum", "Python", "Blue"};
            var0[1] = new String[]{"3", "Ada Lovelace", "Ada", "Green"};
            var0[2] = new String[]{"4", "John McCarthy", "Lisp", "Brown"};
            var0[3] = new String[]{"1", "Joshua Bloch", "Java", "Purple"};
        for (String[] strings : var0) {
            if (Integer.parseInt(strings[1]) == id) {
                return strings;
            }
        }
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
        return new HashMap<>();
    }
}
