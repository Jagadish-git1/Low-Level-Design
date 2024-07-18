package org.example.shapes;

import org.example.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method...");
    }
}
