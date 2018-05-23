package models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void newGame_instatiatesCorrectly() throws Exception {
        Game testGame = new Game ();
        assertEquals(true, testGame instanceof Game);
    }
    @Test
    public void returnWord_checksForRandomWordChoice_true() throws Exception {
        Game testGame = new Game ();
        boolean expected = true;
        assertEquals(true, testGame.generateWord() instanceof String);
    }
    @Test
    public void letterCheck_checksIfCharacterIsInWord_true() throws Exception {
        Game testGame = new Game ();
        testGame.setWordChoice("apple");
        boolean expected = true;
        assertEquals(true, testGame.letterCheck('a') );
    }
    @Test
    public void lossCheck_checksIfPlayerLoses_true() throws Exception {
        Game testGame = new Game ();
        testGame.setWordChoice("apple");
        testGame.letterCheck('d');
        testGame.letterCheck('f');
        testGame.letterCheck('g');
        testGame.letterCheck('m');
        testGame.letterCheck('h');
        testGame.letterCheck('i');
        boolean expected = true;
        assertEquals(true, testGame.lossCheck());
    }
}