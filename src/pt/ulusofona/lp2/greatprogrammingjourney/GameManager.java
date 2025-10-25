package pt.ulusofona.lp2.greatprogrammingjourney;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class GameManager {
    Tabuleiro tabuleiro;
    public Player[] jogadores;
    public GameManager(){

    }
    public boolean createInitialBoard(String[][] playerInfo, int worldSize){

        if(worldSize>=(2*playerInfo.length) ){
            this.tabuleiro.tamanho = worldSize;
        }



        return true;
    }
    public String getImagePng(int nrSquare){
    return "";
    }
    public String[] getProgrammerInfo(int id){
        for (Player p : jogadores) {
            if (Objects.equals(p.id, id)) {

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
