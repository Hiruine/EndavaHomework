package com.endava.coffeeMachine;


import com.endava.coffeeMachine.components.IngredientsResupplier;

public class tempMain {
    public static void main(String[] args) {

        IngredientsResupplier.resupply();

        CoffeeMachine coffeeMachine = new CoffeeMachine(new CoffeeFactory());
        coffeeMachine.orderCoffee("americano");



    }

}



//    public static void main(String[] args) {
//
//}