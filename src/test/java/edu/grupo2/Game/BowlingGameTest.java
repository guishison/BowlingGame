package edu.grupo2.Game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BowlingGameTest {

    @Test
    public void testInitialGameWithScoreZero() throws Exception{
        Game g = new Game();
        InitiateGame initiator = new InitiateSingleGame();
        g.addNewPlayer("Juan");
        g.addRolls("Juan",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        initiator.start(g);
        g.calculatePuntuation();
        assertEquals(0,g.getLines().get(0).getScores()[9]);
    }
    @Test
    public void testOneSpareGame() throws Exception{
        Game g = new Game();
        InitiateGame initiator = new InitiateSingleGame();
        g.addNewPlayer("Juan");
        g.addRolls("Juan",5,5,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        initiator.start(g);
        g.calculatePuntuation();
        assertEquals(16,g.getLines().get(0).getScores()[9]);
    }
    @Test
    public void testOneStrikeGame() throws Exception{
        Game g = new Game();
        InitiateGame initiator = new InitiateSingleGame();
        g.addNewPlayer("Juan");
        g.addRolls("Juan",10,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        initiator.start(g);
        g.calculatePuntuation();
        assertEquals(24,g.getLines().get(0).getScores()[9]);
    }
    @Test
    public void testPerfectGame() throws Exception{
        Game g = new Game();
        InitiateGame initiator = new InitiateSingleGame();
        g.addNewPlayer("Juan");
        g.addRolls("Juan",10,10,10,10,10,10,10,10,10,10,10,10);
        initiator.start(g);
        g.calculatePuntuation();
        assertEquals(300,g.getLines().get(0).getScores()[9]);
    }
    @Test
    public void testNearPerfectGameWithZero() throws Exception{
        Game g = new Game();
        InitiateGame initiator = new InitiateSingleGame();
        g.addNewPlayer("Juan");
        g.addRolls("Juan",10,10,10,10,10,10,10,10,10,0,0);
        initiator.start(g);
        g.calculatePuntuation();
        assertEquals(240,g.getLines().get(0).getScores()[9]);
    }
}
