package edu.ithaca.dragon.shapes;

public class Circle implements Shape{
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if (radius <= 0){
            throw new IllegalArgumentException("radius must be positive");
        }
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    @Override
    public double calcArea(){
        return Math.PI * radius *radius;
    }

    /**
     * @post doubles the size of this circle
     * assuming this means doubling the radius not the area
     */
    @Override
    public void doubleSize(){
        radius *= 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    @Override
    public double longestLineWithin(){
        return radius * 2;
    }
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}
