package com.gyrfalcons.greenapples.designpatterns.creational.factory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("[Rectangle.draw] Drawing Rectangle.");
    }
}
