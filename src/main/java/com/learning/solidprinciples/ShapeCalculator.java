package com.learning.solidprinciples;

public class ShapeCalculator {
    double calculateTotalArea = 0;

    private double calculateTotalArea(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            calculateTotalArea = calculateTotalArea + shapes[i].calculateArea();
        }
        return calculateTotalArea;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(5);

        Shape[] shapes = {rectangle, square};
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Total Area : " + shapeCalculator.calculateTotalArea(shapes));
    }
}
