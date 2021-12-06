package edu.isu.cs.cs2263;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests in a test class for Hotel class.
 */
class HotelTest {
    Player player1;
    String hotel;
    @Test
    void HotelHasAFound() {
        Hotel classUnderTest = new Hotel(1, hotel, 3);
        assertTrue(classUnderTest.found(player1));
    }
}
