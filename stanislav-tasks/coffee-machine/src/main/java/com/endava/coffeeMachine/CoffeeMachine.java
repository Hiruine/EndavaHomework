package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.Coffee;

public class CoffeeMachine {
    CoffeeFactory factory;

    public CoffeeMachine(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee;
        coffee = factory.createCoffee(type);

        System.out.println(coffee.getPrice());

        System.out.println(String.valueOf(coffee.hasIngredients()));

        coffee.prepareCoffee();

        return coffee;

    }
}
