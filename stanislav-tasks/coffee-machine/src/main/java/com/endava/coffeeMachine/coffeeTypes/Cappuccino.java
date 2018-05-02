package com.endava.coffeeMachine.coffeeTypes;

import com.endava.coffeeMachine.components.Ingredients;


import java.math.BigDecimal;

public class Cappuccino implements Coffee {

    private Ingredients ingredients;
    private BigDecimal price;

    public Cappuccino(Ingredients ingredients, BigDecimal price) {
        this.ingredients = ingredients;
        this.price = price;
    }


    @Override
    public void prepare() {

    }
}
