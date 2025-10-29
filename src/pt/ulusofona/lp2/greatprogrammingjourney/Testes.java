package pt.ulusofona.lp2.greatprogrammingjourney;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testes {
    GameManager testaGame = new GameManager();
    void resetagame (){
        this.testaGame.jogadores=null;
        this.testaGame.JOGADORATUAL=0;
        this.testaGame.tabuleiro=null;
    }
    @Test
     void create(){
        resetagame();
        String[][] teste = new String[4][];
        teste[0] = new String[]{"1", "Joshua Bloch", "Java", "Purple"};
        teste[1] = new String[]{"2", "Guido van Rossum", "Python", "Blue"};
        teste[2] = new String[]{"3", "Ada Lovelace", "Ada", "Green"};
        teste[3] = new String[]{"4", "John McCarthy", "Lisp", "Brown"};
        assertTrue(testaGame.createInitialBoard(teste,8), "");
        assertFalse(testaGame.createInitialBoard(null,8),"jogadores nulos");
        assertFalse(testaGame.createInitialBoard(teste,7),"worldsize inferior");

    }
}
