package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.Coffee;

public class CoffeeMachine {
    CoffeeFactory factory;

    public CoffeeMachine(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee;
        coffee = factory.makeCoffee(type);
    }
}
