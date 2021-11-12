package edu.isu.cs.cs2263;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private Tile tile;
    private String hotel;

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
        assertNotNull(classUnderTest.checkHotelSize(hotel));
    }
    @Test void boardHasAGiveBonus(){
        Board classUnderTest = Board.getInstance();
        assertNotNull(classUnderTest.giveBonus());
    }

}
