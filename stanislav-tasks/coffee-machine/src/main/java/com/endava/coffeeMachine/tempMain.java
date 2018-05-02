package com.endava.coffeeMachine;


import com.endava.coffeeMachine.aTrash.CoffeeFactoryImpl;
import com.endava.coffeeMachine.coffeeTypes.CoffeeType;
import com.endava.coffeeMachine.components.IngredientsResupplier;

public class tempMain {
    public static void main(String[] args) {

        IngredientsResupplier.resupply();

        CoffeeMachine coffeeMachine = new CoffeeMachine(new CoffeeFactoryImpl());
        coffeeMachine.orderCoffee(CoffeeType.AMERICANO);



    }

}



//    public static void main(String[] args) {
//
//}