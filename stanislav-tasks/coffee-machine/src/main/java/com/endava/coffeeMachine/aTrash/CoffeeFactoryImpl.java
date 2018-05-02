package com.endava.coffeeMachine.aTrash;

import com.endava.coffeeMachine.coffeeTypes.Americano;
import com.endava.coffeeMachine.coffeeTypes.Coffee;
import com.endava.coffeeMachine.coffeeTypes.CoffeeType;
import com.endava.coffeeMachine.components.Ingredients;
import com.sun.jdi.InvalidTypeException;

import java.math.BigDecimal;

public class CoffeeFactoryImpl implements CoffeeFactory{
    @Override
    public Coffee createCoffee(CoffeeType coffeeType) throws InvalidTypeException {
        switch (coffeeType) {
            case AMERICANO:
                return new Americano(
                        new Ingredients.Builder(180, 30).build(),
                        BigDecimal.valueOf(10)
                );

                default:
                    throw new InvalidTypeException(coffeeType.toString());
        }


    }

}
