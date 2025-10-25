package pt.ulusofona.lp2.greatprogrammingjourney;

import java.util.ArrayList;
import java.util.Objects;
//r1 firsfit mallocs falhados r2worst fit fragmentos maiores r3 ff menos fragmentos r4 bestfit
public class Player {
    public enum cores {
        PURPLE,
        GREEN,
        BROWN,
        BLUE
    }
    int id;
    String nome;
    ArrayList<String> linguagem;
    cores cor;
    String posicao;
    boolean estado;

    public Player(int id, String nome, ArrayList<String> linguagem, cores cor, String posicao, boolean estado) {
        this.id = id;
        this.nome = nome;
        this.linguagem = linguagem;
        this.cor = cor;
        this.posicao = posicao;
        this.estado = estado;
    }

    @Override
    public String toString() {
        if(estado) {
            return id + " | " + nome + " | " + posicao + " | " + linguagem + " | Emo jogo";
        }
        return id + " | " + nome + " | " + posicao + " | " + linguagem + " | Derrotado";
    }
    public boolean recebePlayer(String[][] playerInfo){
        if (playerInfo.length< 2 || playerInfo.length>4){
            return false;
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
    public boolean guardaPlayer(String[][] playerInfo){
        for(int i= 0; i<playerInfo.length; i++ ){

        }
        return true;
    }

}
