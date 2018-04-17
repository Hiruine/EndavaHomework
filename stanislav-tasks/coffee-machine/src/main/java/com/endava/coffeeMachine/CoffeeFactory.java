package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.Americano;
import com.endava.coffeeMachine.coffeeTypes.Coffee;

import java.math.BigDecimal;

public class CoffeeFactory {

    public Coffee createCoffee(CoffeeTypeComponents coffeeType) {
        switch (coffeeType) {
            case AMERICANO: {
                return new Americano();
            }


        }
        return null;
    }
}
