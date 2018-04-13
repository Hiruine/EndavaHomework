package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.Cappuccino;
import com.endava.coffeeMachine.coffeeTypes.Coffee;

import java.math.BigDecimal;

public class CoffeeFactory {

    public Coffee makeCoffee(CoffeeTypeComponents coffeeType) {
        switch (coffeeType) {
            case CAPPUCCINO: {
                return new Cappuccino(CoffeeTypeComponents.CAPPUCCINO.toString(),
                        BigDecimal.valueOf(10));
            }


        }
        return null;
    }
}
