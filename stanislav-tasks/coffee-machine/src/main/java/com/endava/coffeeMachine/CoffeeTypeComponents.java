package com.endava.coffeeMachine;

public enum CoffeeTypeComponents {
    //espresso ratio coffee-water 1:2

    //water, espresso, milk, chocolate, foam
    ESPRESSO(0, 60, 0, 0, 0),
    CAPPUCCINO(0, 60, 60, 0, 60),
    AMERICANO(120, 60, 0, 0, 0),
    MOCHA(0, 72, 36, 72, 0),
    LATTE(0, 110, 55, 0, 15);

    private final double water;
    private final double espresso;
    private final double milk;
    private final double chocolate;
    private final double milkFoam;

    CoffeeTypeComponents(double water, double espresso,
                         double milk, double chocolate, double milkFoam) {
        this.water = water;
        this.espresso = espresso;
        this.milk = milk;
        this.chocolate = chocolate;
        this.milkFoam = milkFoam;
    }


}
