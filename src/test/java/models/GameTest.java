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
    public void letterCheck_checksIfCharacterIsInWord_false() throws Exception {
        Game testGame = new Game ();
        testGame.setWordChoice("apple");
        assertEquals(false, testGame.letterCheck('v') );
    }
    @Test
    public void lossCheck_checksIfPlayerLoses_true() throws Exception {
        Game testGame = new Game ();
        testGame.setWordChoice("apple");
        testGame.charArrayListAdd('d');
        testGame.charArrayListAdd('f');
        testGame.charArrayListAdd('g');
        testGame.charArrayListAdd('m');
        testGame.charArrayListAdd('h');
        testGame.charArrayListAdd('i');
        assertEquals(true, testGame.lossCheck());
    }

    @Test
    public void lossCheck_checksIfPlayerLoses_false() throws Exception {
        Game testGame = new Game ();
        testGame.setWordChoice("apple");
        testGame.charArrayListAdd('d');
        testGame.charArrayListAdd('f');
        testGame.charArrayListAdd('g');
        testGame.charArrayListAdd('m');
        testGame.charArrayListAdd('h');
        assertEquals(false, testGame.lossCheck());
    }

    @Test
    public void setUsedLettersArrayLength_setsLengthOfUsedLettersWithZeroes_5() throws Exception{
        Game testGame = new Game ();
        assertEquals(5, testGame.setUsedLettersArrayLength("apple"));

    }
    @Test
    public void winCheck_checksIfPlayerwins_true() throws Exception {
        Game testGame = new Game ();
        testGame.setWordChoice("cat");
        testGame.setUsedLettersArrayLength("cat");
        testGame.charArrayListAdd('c');
        testGame.charArrayListAdd('a');
        testGame.charArrayListAdd('t');
        assertEquals(true, testGame.winCheck("cat"));
    }
}