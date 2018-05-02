package com.endava.coffeeMachine.coffeeTypes;

import com.endava.coffeeMachine.components.Ingredients;
<<<<<<< HEAD
import com.endava.coffeeMachine.components.IngredientsDeserializer;
import com.endava.coffeeMachine.components.IngredientsSerializer;
=======

>>>>>>> 05ccf2af92c771048e2c011fc7710c697218b066

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
