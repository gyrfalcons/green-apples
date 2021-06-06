package com.gyrfalcons.greenapples.designpatterns.creational.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        System.out.println("=== Class Singleton ===");
        Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();

        System.out.println(car1.getMake());
        System.out.println(car2.getMake());

        car1.setMake("Jeep");

        System.out.println(car1.getMake());
        System.out.println(car2.getMake());

        System.out.println("=== Enum Singleton ===");

        MotorCycle motorCycle1 = MotorCycle.INSTANCE.getInstance();
        MotorCycle motorCycle2 = MotorCycle.INSTANCE.getInstance();

        System.out.println(motorCycle1.getMake());
        System.out.println(motorCycle2.getMake());

        motorCycle1.setMake("Hero");

        System.out.println(motorCycle1.getMake());
        System.out.println(motorCycle2.getMake());


    }

}
