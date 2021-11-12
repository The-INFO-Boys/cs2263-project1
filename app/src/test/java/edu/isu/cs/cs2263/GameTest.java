package edu.isu.cs.cs2263;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameTest {
    Tile tile;
    @Test
    void GameHasADetermineFirst(){
        Game classUnderTest = new Game();
        assertNotNull(classUnderTest.determineFirst());
    }
    void GameHasAPlayTile(){
        Game classUnderTest = new Game();

        assertNotNull(classUnderTest.playTile(tile));
    }
    void GameHasABuyStock() {
        Game classUnderTest = new Game();
        assertTrue(classUnderTest.buyStock(1, 2, 3));
    }
}