package org.example;

import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Square;

public class ShapeFactory {

    public Shape getShape(Shape shapeType){
        if(shapeType instanceof Circle){
            return new Circle();
        } else if (shapeType instanceof Rectangle) {
            return new Rectangle();
        }
        else if(shapeType instanceof Square){
            return new Square();
        }
        return null;
    }
}
