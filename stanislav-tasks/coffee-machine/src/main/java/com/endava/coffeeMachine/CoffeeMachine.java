package com.endava.coffeeMachine;

import com.endava.coffeeMachine.aTrash.CoffeeFactory;
import com.endava.coffeeMachine.coffeeTypes.Coffee;
import com.endava.coffeeMachine.coffeeTypes.CoffeeType;
import com.sun.jdi.InvalidTypeException;

public class CoffeeMachine {
    private CoffeeFactory factory;

    public CoffeeMachine(Factory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(CoffeeType type) {

        Coffee coffee = null;

        try {
            coffee = factory.createCoffee(type);
        } catch (InvalidTypeException e) {
            e.printStackTrace();
        }

        coffee.prepare();

//        System.out.println(coffee.getPrice());
//        System.out.println(String.valueOf(coffee.hasIngredients()));


//        if (MoneyValidator.hasEnoughMoney(coffee.getPrice())) {
//            coffee.prepare();
//        }
//        else {
//            throw new RuntimeException("not enogh money");
//        }

        return coffee;
    }
}
