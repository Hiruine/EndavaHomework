package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.Americano;
import com.endava.coffeeMachine.coffeeTypes.Coffee;
import com.endava.coffeeMachine.coffeeTypes.components.Ingredients;

import java.math.BigDecimal;

public class CoffeeFactory {

    public Coffee createCoffee(String coffeeType) {
        switch (coffeeType) {
            case "americano": {
                return new Americano(
                        new Ingredients(120, 30, 0, 0, 0),
                        BigDecimal.valueOf(10));
            }


        }
        return null;
    }
}
