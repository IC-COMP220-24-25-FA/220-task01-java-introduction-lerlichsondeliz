package edu.ithaca.dragon.practice;

import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third<0){
            throw new IllegalArgumentException("Numbers are not allowed to be negative");
        }

        if (first >= second && first >= third)
            return first;
        
        else if (second >= first && second >= third)
            return second;
        else 
            return third;
        
        
    }
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    // assuming 17% would be entered as 17
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double price = originalPrice * (1 - discountPercent * 0.01) * (1 + salesTax * 0.01);
        return Math.round(price * 100) / 100; 
        
        // BigDecimal originalPriceBig = new BigDecimal(originalPrice);
        // BigDecimal discountDecimal = new BigDecimal(1 - (discountPercent / 100));
        // BigDecimal salesTaxDecimal = new BigDecimal((salesTax / 100) + 1 );
        // BigDecimal discountedPrice = (discountDecimal.multiply(originalPriceBig));
        // BigDecimal finalUnrounded = discountedPrice.multiply(salesTaxDecimal);
        // BigDecimal finalNumber = finalUnrounded.setScale(2, RoundingMode.HALF_UP);
        // return finalNumber;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        return true;
        // all dogs are good dogs
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.isEmpty()){
            return -1;
        }
        int largest = numbers.get(0);
        int index = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
                index = i;
            }
        }
        return index;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.isEmpty()){
            return -1;
        }
        int largest = numbers.get(0);
        int index = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) >= largest) {
                largest = numbers.get(i);
                index = i;
            }
        }
        return index;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        String mostOccurrencesWord = words.get(0);
        int maxOccurrences = 0;

        for (String word : words) {
            int occurrences = 0;
            for (char c : word.toCharArray()) {
                if (c == letter) {
                    occurrences++;
                }
            }
            if (occurrences > maxOccurrences) {
                maxOccurrences = occurrences;
                mostOccurrencesWord = word;
            }
        }

        return mostOccurrencesWord;
    }


}
