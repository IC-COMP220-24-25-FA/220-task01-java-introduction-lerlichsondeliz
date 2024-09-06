package edu.ithaca.dragon.shapes;

public class Triangle implements Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("All sides must be positive");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("The given sides do not satisfy the triangle inequality theorem");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calcArea(){
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public void doubleSize(){
        sideA *= 2;
        sideB *= 2;
        sideC *= 2;
    }

    public double longestLineWithin(){
        double medianA = 0.5 * Math.sqrt(2 * sideB * sideB + 2 * sideC * sideC - sideA * sideA);
        double medianB = 0.5 * Math.sqrt(2 * sideA * sideA + 2 * sideC * sideC - sideB * sideB);
        double medianC = 0.5 * Math.sqrt(2 * sideA * sideA + 2 * sideB * sideB - sideC * sideC);
        return Math.max(medianA, Math.max(medianB, medianC));
    }
}
