package com.endava.coffeeMachine.coffeeTypes;

import com.endava.coffeeMachine.components.Ingredients;
import com.endava.coffeeMachine.components.IngredientsDeserializer;
import com.endava.coffeeMachine.components.IngredientsSerializer;

import java.math.BigDecimal;

public class Americano implements Coffee {

    private Ingredients ingredients;
    private BigDecimal price;

    public Americano(Ingredients ingredients, BigDecimal price) {
        this.ingredients = ingredients;
        this.price = price;
    }


    public boolean hasIngredients() {
        return false;/*this.ingredients
                .isLessOrEqualTo(IngredientsDeserializer
                        .deserializeIngredients());*/
    }


    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void prepare() {



//        IngredientsSerializer
//                .serializeIngredients(this.ingredients
//                        .withdrawIngredients(IngredientsDeserializer
//                                .deserializeIngredients()));
    }

}
