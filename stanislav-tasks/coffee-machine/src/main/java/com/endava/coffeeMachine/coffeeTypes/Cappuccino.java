package com.endava.coffeeMachine.coffeeTypes;

import java.math.BigDecimal;

public class Cappuccino implements Coffee {
    private String coffeeType;
    private BigDecimal price;

    public Cappuccino(String coffeeType, BigDecimal price) {
        this.coffeeType = coffeeType;
        this.price = price;
    }

    @Override
    public void prepareCoffee() {

    }

    @Override
    public void getPrice() {

    }
}
