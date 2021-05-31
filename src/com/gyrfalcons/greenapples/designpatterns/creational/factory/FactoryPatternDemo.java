package com.gyrfalcons.greenapples.designpatterns.creational.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape(ShapeFactory.Shapes.SQUARE.name());
        square.draw();

        Shape rectangle = shapeFactory.getShape(ShapeFactory.Shapes.RECTANGLE.name());
        rectangle.draw();

        Shape circle = shapeFactory.getShape(ShapeFactory.Shapes.CIRCLE.name());
        circle.draw();
    }
}
