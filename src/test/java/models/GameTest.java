package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void newGame_instatiatesCorrectly() throws Exception {
        Game testGame = new Game ();
        assertEquals(true, testGame instanceof Game);
    }
}