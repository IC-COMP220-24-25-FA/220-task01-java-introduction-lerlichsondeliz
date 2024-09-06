package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0){
            throw new IllegalArgumentException("Both length and with must be positive");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea(){
       return length * width;
    }
    @Override
    public void doubleSize(){
        length *= 2;
        width *= 2;
    }
    @Override
    public double longestLineWithin(){
        return Math.sqrt(length*length + width*width);
    }

    @Override
    public String toString() {
        return "Rectangle with length: " + length + " and width: " + width;
    }
    
}
