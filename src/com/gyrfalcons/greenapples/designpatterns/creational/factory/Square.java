package com.gyrfalcons.greenapples.designpatterns.creational.factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("[Square.draw] Drawing Square.");
    }
}
