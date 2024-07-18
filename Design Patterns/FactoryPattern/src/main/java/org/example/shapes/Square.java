package org.example.shapes;

import org.example.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method...");
    }
}
