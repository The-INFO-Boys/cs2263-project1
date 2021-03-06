package edu.isu.cs.cs2263;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests in a test class for the Board class.
 */
class BoardTest {
    private Tile tile = new Tile(1,1);
    private Hotel hotel;

    @Test void boardHasACheckAdjacent(){
        Board classUnderTest = Board.getInstance();
        assertNotNull(classUnderTest.checkAdjacent(tile));
    }
    @Test void boardHasACheckPresentHotels(){
        Board classUnderTest = Board.getInstance();
        assertNotNull(classUnderTest.checkPresentHotels());
    }
    @Test void boardHasAGetHotels(){
        Board classUnderTest = Board.getInstance();
        assertNotNull(classUnderTest.getHotels());
    }
    @Test void boardHasACheckHotelSize(){
        Board classUnderTest = Board.getInstance();
        assertEquals(classUnderTest.getHotelSize(hotel), 0);
    }
}
