package com.endava.coffeeMachine;


import com.endava.coffeeMachine.components.IngredientsResupplier;
import com.endava.coffeeMachine.factory.Factory;

public class tempMain {
    public static void main(String[] args) {

        IngredientsResupplier.resupply();

        CoffeeMachine coffeeMachine = new CoffeeMachine(new Factory());
        coffeeMachine.orderCoffee("americano");



    }

}



//    public static void main(String[] args) {
//
//}