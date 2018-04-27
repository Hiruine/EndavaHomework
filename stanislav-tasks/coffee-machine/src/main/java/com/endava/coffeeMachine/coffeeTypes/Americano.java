package com.endava.coffeeMachine.coffeeTypes;

import com.endava.coffeeMachine.coffeeTypes.components.Ingredients;
import com.endava.coffeeMachine.coffeeTypes.components.IngredientsDeserializer;
import com.endava.coffeeMachine.coffeeTypes.components.IngredientsSerializer;

import java.math.BigDecimal;

public class Americano implements Coffee {

    private Ingredients ingredients;
    private BigDecimal price;

    public Americano(Ingredients ingredients, BigDecimal price) {
        this.ingredients = ingredients;
        this.price = price;
    }

    @Override
    public boolean hasIngredients() {
        return false;/*this.ingredients
                .isLessOrEqualTo(IngredientsDeserializer
                        .deserializeIngredients());*/
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void prepareCoffee() {

        IngredientsSerializer
                .serializeIngredients(this.ingredients
                        .updateIngredients(IngredientsDeserializer
                                .deserializeIngredients()));

    }

}
