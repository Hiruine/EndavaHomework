package com.endava.coffeeMachine.coffeeFactory;

import com.endava.coffeeMachine.coffeeTypes.Coffee;
import com.endava.coffeeMachine.coffeeTypes.CoffeeType;

import java.util.HashMap;
import java.util.Map;

public interface CoffeeFactory {

    Coffee createCoffee(String coffeeType) ;

}





//    private static final Map<String, Class<? extends CoffeeFactory>> coffees =
//            new HashMap<>();


//    public CoffeeFactory(String coffeeName, Coffee coffeeType) {
//        coffees.put(coffeeName, coffeeType);
//    }
