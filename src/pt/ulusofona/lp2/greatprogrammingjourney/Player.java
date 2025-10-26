package pt.ulusofona.lp2.greatprogrammingjourney;

import java.util.ArrayList;
import java.util.Objects;

public class Player {

    public static Cores Cores;

    public enum Cores {
        PURPLE,
        GREEN,
        BROWN,
        BLUE
    }

    int id;
    String nome;
    ArrayList<String> linguagem;
    Cores cor;
    String posicao;
    boolean estado;

    public Player(int id, String nome, ArrayList<String> linguagem, Cores cor, String posicao, boolean estado) {
        this.id = id;
        this.nome = nome;
        this.linguagem = linguagem;
        this.cor = cor;
        this.posicao = posicao;
        this.estado = estado;
    }

    @Override
    public String toString() {
        if (estado) {
            return id + " | " + nome + " | " + posicao + " | " + linguagem + " | Em jogo";
        }
        return id + " | " + nome + " | " + posicao + " | " + linguagem + " | Derrotado";
    }


    public String[] getInfoArray() {
        String linguagensStr = String.join(";", linguagem);
        return new String[]{
                String.valueOf(id),
                nome,
                linguagensStr,
                cor.name(),
                posicao
        };
    }

    public boolean recebePlayer(String[][] playerInfo) {
        if (playerInfo.length < 2 || playerInfo.length > 4) {
            return false;
        }

        String[][] testeId = new String[playerInfo.length][4];

        for (int currentPlayer = 0; currentPlayer < playerInfo.length; currentPlayer++) {

            for (int previousPlayer = 0; previousPlayer <= currentPlayer; previousPlayer++) {
                if (Objects.equals(testeId[previousPlayer][1], playerInfo[currentPlayer][1])) {
                    return false; // Nome repetido
                }
            }

            testeId[currentPlayer] = playerInfo[currentPlayer];

            if (playerInfo[currentPlayer][2] == null || playerInfo[currentPlayer][2].isEmpty()) {
                return false;
            }
        }

        return true;
    }

    public boolean guardaPlayer(String[][] playerInfo) {
        for (int playerIndex = 0; playerIndex < playerInfo.length; playerIndex++) {

        }
        return true;
    }
}
