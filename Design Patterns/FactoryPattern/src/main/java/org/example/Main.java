package org.example;

import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println("Shape Factory...");
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(new Circle());
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(new Rectangle());
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(new Square());
        shape3.draw();
    }
}