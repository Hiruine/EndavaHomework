package com.endava.coffeeMachine.coffeeTypes.components;

import com.endava.coffeeMachine.CoffeeTypeComponents;
import com.endava.coffeeMachine.coffeeTypes.Coffee;

public class Ingredients {
    public double water;
    public double espresso;
    public double milk;
    public double chocolate;
    public double cream;

    public Ingredients() {
    }

    public Ingredients(double water, double espresso,
                       double milk, double chocolate, double cream) {
        this.water = water;
        this.espresso = espresso;
        this.milk = milk;
        this.chocolate = chocolate;
        this.cream = cream;
    }
}
