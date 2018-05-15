package com.endava.coffeeMachine.factory;

import com.endava.coffeeMachine.coffeeTypes.Americano;
import com.endava.coffeeMachine.coffeeTypes.Coffee;
import com.endava.coffeeMachine.components.Ingredients;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

interface CoffeeFactory {


    static Coffee createCoffee(String coffeeType) {
        switch (coffeeType) {
            case "americano": {
                return new Americano(
                        new Ingredients.Builder(180, 30).build(),
                        BigDecimal.valueOf(10));
            }
            case "cappuccino": {
                return new Capucino(
                        new Ingredients
                                .Builder(60, 30)
                                .milk(60)
                                .cream(60)
                                .build(),
                        BigDecimal.valueOf(10));
            }
        }
        return null;
    }

}

