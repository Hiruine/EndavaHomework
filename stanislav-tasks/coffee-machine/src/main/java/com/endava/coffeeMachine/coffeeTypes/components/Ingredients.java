package com.endava.coffeeMachine.coffeeTypes.components;

import com.endava.coffeeMachine.coffeeTypes.Coffee;

import java.util.Comparator;

public class Ingredients {
    private double water;
    private double coffee;
    private double milk;
    private double chocolate;
    private double cream;

    public Ingredients() {
    }

    public Ingredients(double water, double coffee,
                       double milk, double chocolate, double cream) {
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
        this.chocolate = chocolate;
        this.cream = cream;
    }



    private boolean isGreaterOrEqualTo(Ingredients ingredients) {
        if(
                water >= ingredients.water &&
                        (coffee / 2) >= ingredients.coffee &&
                        milk >= ingredients.milk &&
                        chocolate >= ingredients.chocolate &&
                        cream >= ingredients.cream
                ) {
            return true;
        }
        return false;
    }






    @Override
    public String toString() {
        return "Ingredients{" +
                "water=" + water +
                ", espresso=" + coffee +
                ", milk=" + milk +
                ", chocolate=" + chocolate +
                ", cream=" + cream +
                '}';
    }
}
