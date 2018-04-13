package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.Cappuccino;
import com.endava.coffeeMachine.coffeeTypes.Coffee;

import java.math.BigDecimal;

public class CoffeeFactory {

    public Coffee makeCoffee(String coffeeType) {
        if (coffeeType.equals("cappuccino")) {
            return new Cappuccino("cappuccino", BigDecimal.valueOf(10));
        }

        return null;
    }
}
