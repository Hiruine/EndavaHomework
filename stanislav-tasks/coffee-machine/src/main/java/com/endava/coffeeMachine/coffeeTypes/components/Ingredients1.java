package com.endava.coffeeMachine.coffeeTypes.components;

public class Ingredients1 {
    public double water;
    public double milk;
    public double chocolate;
    public double cream;
    public double coffee;


    public Ingredients1() {
    }

    public Ingredients1(double water, double coffee,
                        double milk, double chocolate,
                        double cream) {
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
        this.chocolate = chocolate;
        this.cream = cream;
    }

//    public boolean isLessOrEqualTo(Ingredients ingredients) {
//        return this.water <= ingredients.water &&
//                this.coffee <= ingredients.coffee &&
//                this.milk <= ingredients.milk &&
//                this.chocolate <= ingredients.chocolate &&
//                this.cream <= ingredients.cream;
//    }


    public Ingredients1 updateIngredients(Ingredients1 ingredients) {
        ingredients.water -= this.water;
        ingredients.coffee -= this.coffee;
        ingredients.chocolate -= this.chocolate;
        ingredients.milk -= this.milk;
        ingredients.cream -= this.cream;
        return ingredients;
    }




    @Override
    public String toString() {
        return "Ingredients{" +
                "water=" + water +
                ", coffee=" + coffee +
                ", milk=" + milk +
                ", chocolate=" + chocolate +
                ", cream=" + cream +
                '}';
    }
}
