package com.endava.coffeeMachine.factory;

import com.endava.coffeeMachine.coffeeTypes.Coffee;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

interface CoffeeFactory {

    Coffee createCoffee(String coffeeType);

    static CoffeeFactory factory(Consumer<Builder> consumer) {
        Map<String, Supplier<Coffee>> map = new HashMap<>();
        consumer.accept(map::put);
        return coffeeType -> map.getOrDefault(coffeeType, () -> {
            throw new IllegalArgumentException("Unknown coffee type.");
        }).get();
    }

    interface Builder {
        void register(String name, Supplier<Coffee> supplier);
    }
}


/*static Coffee createCoffee(String coffeeType) {
        switch (coffeeType) {
            case "americano": {
                return new Americano(
                        new Ingredients.Builder(180, 30).build(),
                        BigDecimal.valueOf(10));
            }
            case "cappuccino": {
                return new Americano(
                        new Ingredients
                                .Builder(60, 30)
                                .milk(60)
                                .cream(60)
                                .build(),
                        BigDecimal.valueOf(10));
            }
        }
        return null;
    }*/