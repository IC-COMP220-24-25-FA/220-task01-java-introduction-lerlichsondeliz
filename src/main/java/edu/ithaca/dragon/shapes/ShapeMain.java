package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){
    //     //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
    //     //Allow the user to choose one, double the size of that one, and print them all again
    //     //Use a loop to repeat the process 5 times

    //     List<Rectangle> rectangles = new ArrayList<>();
    //     Random random = new Random();

    //     for (int i = 0; i < 5; i++) {
    //         double length = 1 + random.nextDouble() * 9; // This can be changed later for longer range
    //         double width = 1 + random.nextDouble() * 9;  
    //         rectangles.add(new Rectangle(length, width));
    //     }

    //     Scanner scanner = new Scanner(System.in);

    //     // System.out.println("Initial Rectangles:");
    //     // printAllRectangles(rectangles);
        
    //     for (int i = 0; i < rectangles.size(); i++) {
    //         Rectangle rect = rectangles.get(i);
    //         System.out.printf("Rectangle %d:\n", i);
    //         System.out.println("  Area: " + rect.calcArea());
    //         System.out.println("  Longest line: " + rect.longestLineWithin());
    //     }
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println("Enter the number of the rectangle you want to double (0 to 4):");
    //         int choice = scanner.nextInt();
            
    //         if (choice < 0 || choice >= rectangles.size()) {
    //             System.out.println("Invalid choice. Please choose a number between 0 and 4.");
    //             i--; 
    //             continue;
    //         }
            
    //         rectangles.get(choice).doubleSize();
    //         System.out.println(rectangles);
    //     }
        
    //     System.out.println("Updated Rectangles:");
    //     for (int i = 0; i < rectangles.size(); i++) {
    //         System.out.println("Rectangle " + i + ":");
    //         printRectangleDetails(rectangles.get(i));
    //     }
        
    //     scanner.close();
    // }

    // private static void printRectangleDetails(Rectangle rectangle) {
    //     System.out.println("Area: " + rectangle.calcArea());
    //     System.out.println("Longest line: " + rectangle.longestLineWithin());
    // }


        List<Shape> shapes = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3); 
            switch (shapeType) {
                case 0:
                    double radius = 1 + random.nextDouble() * 9;
                    shapes.add(new Circle(radius));
                    break;
                case 1:
                    double length = 1 + random.nextDouble() * 9;
                    double width = 1 + random.nextDouble() * 9;
                    shapes.add(new Rectangle(length, width));
                    break;
                case 2:
                    double sideA = 1 + random.nextDouble() * 9;
                    double sideB = 1 + random.nextDouble() * 9;
                    double sideC = 1 + random.nextDouble() * 9;
                    shapes.add(new Triangle(sideA, sideB, sideC));
                    break;
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Initial Shapes:");
        printAllShapes(shapes);

        for (int i = 0; i < 9; i++) {
            System.out.println("Enter the number of the shape you want to double (0 to 10):");
            int choice = scanner.nextInt();

            if (choice < 0 || choice >= shapes.size()) {
                System.out.println("Invalid choice. Please choose a number between 0 and 10.");
                i--; 
                continue;
            }

            shapes.get(choice).doubleSize();
            System.out.println("Shapes after doubling:");
            printAllShapes(shapes);
        }

        scanner.close();
    }

    private static void printAllShapes(List<Shape> shapes) {
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            System.out.println("Shape " + i + ": " + shape.toString());
            System.out.println("  Area: " + shape.calcArea());
            System.out.println("  Longest line: " + shape.longestLineWithin());
        }
    }
}
