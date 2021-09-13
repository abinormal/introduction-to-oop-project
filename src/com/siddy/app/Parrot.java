package com.siddy.app;

public class Parrot extends Bird{

    public Parrot(String name, String color){
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Bwaaaak! *Ahem* I mean.. allo, ooze a pwetty boi then?");
    }
}
