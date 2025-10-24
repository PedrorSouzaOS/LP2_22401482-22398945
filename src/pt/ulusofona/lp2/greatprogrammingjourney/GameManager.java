package pt.ulusofona.lp2.greatprogrammingjourney;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class GameManager {
    public int tabuleiro;
    public String[][] jogadores;
    public GameManager(){

    }
    public boolean createInitialBoard(String[][] playerInfo, int worldSize){
        if (playerInfo.length< 2 || playerInfo.length>4){
            return false;
        }
        if(worldSize>=(2*playerInfo.length) ){
            this.tabuleiro = worldSize;
        }
        String[][] testeId = new String[playerInfo.length][4];
    for(int i= 0; i<playerInfo.length; i++ ){
        for(int j= 0;j<=i; j++){
            if(Objects.equals(testeId[j][1], playerInfo[i][1])){
                return false;
            }
        }
        testeId[i] = playerInfo[i];
        if (Objects.equals(playerInfo[i][2], "")||Objects.equals(playerInfo[i][2], null)){
            return false;
        }
    }


        return true;
    }
    public String getImagePng(int nrSquare){
    return "";
    }
    public String[] getProgrammerInfo(int id){

        for (String[] strings : jogadores) {
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
