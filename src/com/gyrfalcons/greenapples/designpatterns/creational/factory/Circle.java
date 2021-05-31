package com.gyrfalcons.greenapples.designpatterns.creational.factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("[Circle.draw] Drawing Circle.");
    }
}
