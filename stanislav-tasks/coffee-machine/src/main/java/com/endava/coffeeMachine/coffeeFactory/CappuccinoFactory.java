package com.endava.coffeeMachine.coffeeFactory;

import com.endava.coffeeMachine.coffeeTypes.Americano;
import com.endava.coffeeMachine.coffeeTypes.Cappuccino;
import com.endava.coffeeMachine.coffeeTypes.Coffee;
import com.endava.coffeeMachine.coffeeTypes.CoffeeType;
import com.endava.coffeeMachine.components.Ingredients;

import java.math.BigDecimal;

public class CappuccinoFactory extends CoffeeFactory {


    @Override
    public Coffee createCoffee(String coffeeType) {
        return new Cappuccino(
                new Ingredients.Builder(60, 30)
                        .milk(60).cream(60).build(),
                BigDecimal.valueOf(10)
        );
    }
}
