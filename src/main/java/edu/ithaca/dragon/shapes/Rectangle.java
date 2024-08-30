package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0){
            throw new IllegalArgumentException("Both length and with must be positive");
        }
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       return length * width;
    }

    public void doubleSize(){
        length *= 2;
        width *= 2;
    }

    public double longestLineWithin(){
        return Math.sqrt(length*length + width*width);
    }
    
}
