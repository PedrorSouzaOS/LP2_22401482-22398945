package pt.ulusofona.lp2.greatprogrammingjourney;

import java.util.ArrayList;

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
}
