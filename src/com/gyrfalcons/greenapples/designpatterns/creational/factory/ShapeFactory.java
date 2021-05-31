package com.gyrfalcons.greenapples.designpatterns.creational.factory;

public class ShapeFactory {

    public enum Shapes {
        SQUARE,
        CIRCLE,
        RECTANGLE
    }

    public Shape getShape(String shape) {
        if(null == shape) {
            return null;
        } else if(Shapes.SQUARE.name().equalsIgnoreCase(shape)) {
            return new Square();
        } else if(Shapes.CIRCLE.name().equalsIgnoreCase(shape)) {
            return new Circle();
        } else if(Shapes.RECTANGLE.name().equalsIgnoreCase(shape)) {
            return new Rectangle();
        }
        return null;
    }

}
