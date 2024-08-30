package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void calcAreaTest(){
    Rectangle myRectangle = new Rectangle(1, 1);
    assertEquals(1, myRectangle.calcArea(), 0.001);

    myRectangle = new Rectangle(8, 4);
    assertEquals(32, myRectangle.calcArea(), 0.001);

    myRectangle = new Rectangle(3.5, 2);
    assertEquals(7, myRectangle.calcArea(),0.001);
    }
}
