package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import java.util.List;

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
        assertEquals(100.00, FunctionPractice.calcSalePrice(100.00, 0, 0));
        assertEquals(90.00, FunctionPractice.calcSalePrice(100.00, 10, 0));
        assertEquals(108.00, FunctionPractice.calcSalePrice(100.00, 0, 8));
        assertEquals(178.50, FunctionPractice.calcSalePrice(200.00, 15, 5), 0.5);
        assertEquals(116.33, FunctionPractice.calcSalePrice(123.45, 12.5, 7.75), 0.5);
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
            assertEquals(8, FunctionPractice.findFirstLargest(List.of(1,1,1,1,2,2,2,2,3)));
            assertEquals(0, FunctionPractice.findFirstLargest(List.of(1,1,1,1)));
            assertEquals(0, FunctionPractice.findFirstLargest(List.of(1)));
            assertEquals(4, FunctionPractice.findFirstLargest(List.of(1,2,7,4,9)));
            assertEquals(4, FunctionPractice.findFirstLargest(List.of(-1,-2,-3,-4,5)));
    }

    @Test
    public void findLastLargestTest(){
        assertEquals(-1, FunctionPractice.findLastLargest(List.of()));
        assertEquals(3, FunctionPractice.findLastLargest(List.of(1,2,3,4)));
        assertEquals(3, FunctionPractice.findLastLargest(List.of(1,1,1,1)));
        assertEquals(8, FunctionPractice.findLastLargest(List.of(2, 1, 3, 4, 5, 4, 5, 4, 5, 4, 4, 4)));
        assertEquals(1, FunctionPractice.findLastLargest(List.of(-1, -1, -2, -3)));
    }

    @Test
    public void findFirstMostOccurencesOfLetterTest(){
        assertEquals("fennec", FunctionPractice.findFirstMostOccurencesOfLetter(List.of("octane","merc", "dominus", "cyclone", "fennec", "scarab", "ripper"), 'n'));
        assertEquals("octane", FunctionPractice.findFirstMostOccurencesOfLetter(List.of("octane","merc", "dominus", "cyclone", "fennec", "scarab", "ripper"), 'o'));
        assertEquals("scarab", FunctionPractice.findFirstMostOccurencesOfLetter(List.of("octane","merc", "dominus", "cyclone", "fennec", "scarab", "ripper"), 'a'));
        assertEquals("cyclone", FunctionPractice.findFirstMostOccurencesOfLetter(List.of("octane","merc", "dominus", "cyclone", "fennec", "scarab", "ripper"), 'c'));

    }
}
