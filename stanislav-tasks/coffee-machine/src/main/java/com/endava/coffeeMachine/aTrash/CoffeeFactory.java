package com.endava.coffeeMachine.aTrash;

import com.endava.coffeeMachine.coffeeTypes.Americano;
import com.endava.coffeeMachine.coffeeTypes.Coffee;
import com.endava.coffeeMachine.coffeeTypes.CoffeeType;
import com.endava.coffeeMachine.components.Ingredients;
import com.sun.jdi.InvalidTypeException;

import java.math.BigDecimal;

public interface CoffeeFactory {

    public Coffee createCoffee(CoffeeType coffeeType) throws InvalidTypeException;

}

