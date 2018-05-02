package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.Coffee;

public class CoffeeMachine {
    private CoffeeFactory factory;

    public CoffeeMachine(Factory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee = factory.createCoffee(type);
        coffee.prepare();

//        System.out.println(coffee.getPrice());
//        System.out.println(String.valueOf(coffee.hasIngredients()));


        if (MoneyValidator.hasEnoughMoney(coffee.getPrice())) {
            coffee.prepare();
        }
        else {
            throw new RuntimeException("not enogh money");
        }

        return coffee;
    }
}
