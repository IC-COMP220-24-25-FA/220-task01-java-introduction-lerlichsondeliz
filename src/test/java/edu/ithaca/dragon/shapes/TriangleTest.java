package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(3,4,5);
        assertEquals(6, myTriangle.calcArea(), 0.001);
    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(3, 4, 5);
        myTriangle.doubleSize();
        assertEquals(24, myTriangle.calcArea(), 0.001);
    }
    
    @Test void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(3, 4, 5);
        assertEquals(4.272, myTriangle.longestLineWithin(), 0.001);
    }
}
