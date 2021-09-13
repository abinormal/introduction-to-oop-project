package com.siddy.app;

public class Pigeon extends Bird {
    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Pigeon(String name, String color) {
        super(name, color);
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }
}
