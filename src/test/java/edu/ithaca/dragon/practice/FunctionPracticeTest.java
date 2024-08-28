package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(100, FunctionPractice.calcSalePrice(100, 0, 0));
        assertEquals(90, FunctionPractice.calcSalePrice(100, 10, 0));
        assertEquals(108, FunctionPractice.calcSalePrice(100, 0, 8));
        assertEquals(178.50, FunctionPractice.calcSalePrice(200, 15, 5));
        assertEquals(116.33, FunctionPractice.calcSalePrice(123.45, 12.5, 7.75));
    }
    
    @Test
    public void isGoodDogTest(){
        assertEquals(true, FunctionPractice.isGoodDog(1, 2, false));
        assertEquals(true, FunctionPractice.isGoodDog(890, 27, true));
        assertEquals(true, FunctionPractice.isGoodDog(1, 2, true));
        assertEquals(true, FunctionPractice.isGoodDog(17, 0, false));
        //forgot about asserttrue below just shows I know how to use it
        assertTrue(FunctionPractice.isGoodDog(0, 0, false));
    }

    @Test
    public void findFirstLargestTest(){

    }
}
