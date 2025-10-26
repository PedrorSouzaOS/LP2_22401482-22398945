package pt.ulusofona.lp2.greatprogrammingjourney;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class GameManager {
    Tabuleiro tabuleiro;
    public Player[] jogadores;
    final int jogadoresMinimos = 2;
    final int jogadoresMaximos = 4;
    public boolean createInitialBoard(String[][] playerInfo, int worldSize){
        if (playerInfo.length< jogadoresMinimos || playerInfo.length> jogadoresMaximos){
            return false;
        }
        if(worldSize>=(2*playerInfo.length) ){
            this.tabuleiro.tamanho = worldSize;
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
    public String getImagePng(int nrSquare) {
        if (nrSquare < 1 || nrSquare > this.tabuleiro.tamanho) {
            return null;
        }

        if (nrSquare == this.tabuleiro.tamanho) {
            return "glory.png";
        }

        switch (nrSquare) {
            case 1: return "dice_1.png";
            case 2: return "dice_2.png";
            case 3: return "dice_3.png";
            case 4: return "dice_4.png";
            case 5: return "dice_5.png";
            case 6: return "dice_6.png";
            default: return null;
        }
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
