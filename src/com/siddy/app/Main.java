package com.siddy.app;

public class Main {
    public static void main(String[] args) {
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();

        Parrot polly = new Parrot("Polly", "so many colours");
        polly.speak();
    }
}
