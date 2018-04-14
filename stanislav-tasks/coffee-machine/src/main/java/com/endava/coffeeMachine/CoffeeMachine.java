package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.Coffee;

public class CoffeeMachine {
    CoffeeFactory factory;

    public CoffeeMachine(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(CoffeeTypeComponents type) {
        Coffee coffee;
        coffee = factory.createCoffee(type);


        coffee.prepareCoffee();

        return coffee;

    }
}
