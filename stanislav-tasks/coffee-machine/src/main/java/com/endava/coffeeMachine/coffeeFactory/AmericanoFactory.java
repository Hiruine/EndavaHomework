package com.endava.coffeeMachine.coffeeFactory;

import com.endava.coffeeMachine.coffeeTypes.Americano;
import com.endava.coffeeMachine.coffeeTypes.Coffee;
import com.endava.coffeeMachine.coffeeTypes.CoffeeType;
import com.endava.coffeeMachine.components.Ingredients;

import java.math.BigDecimal;

public class AmericanoFactory implements CoffeeFactory{


    @Override
    public Coffee createCoffee(String coffeeType) {
        return new Americano(
                new Ingredients.Builder(180, 30).build(),
                BigDecimal.valueOf(10)
        );
    }
}
