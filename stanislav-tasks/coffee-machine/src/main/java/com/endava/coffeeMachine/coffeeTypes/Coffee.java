package com.endava.coffeeMachine.coffeeTypes;

import java.math.BigDecimal;

public interface Coffee {

    boolean hasIngredients();
    BigDecimal getPrice();
    void prepareCoffee();

}
