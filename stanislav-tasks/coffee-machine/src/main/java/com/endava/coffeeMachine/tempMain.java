package com.endava.coffeeMachine;


import com.endava.coffeeMachine.aTrash.CoffeeFactoryImpl;
import com.endava.coffeeMachine.coffeeTypes.CoffeeType;
import com.endava.coffeeMachine.components.IngredientsResupplier;
import com.endava.coffeeMachine.factory.Factory;

public class tempMain {
    public static void main(String[] args) {

        IngredientsResupplier.resupply();

<<<<<<< HEAD
        CoffeeMachine coffeeMachine = new CoffeeMachine(new Factory());
        coffeeMachine.orderCoffee("americano");
=======
        CoffeeMachine coffeeMachine = new CoffeeMachine(new CoffeeFactoryImpl());
        coffeeMachine.orderCoffee(CoffeeType.AMERICANO);
>>>>>>> 05ccf2af92c771048e2c011fc7710c697218b066



    }

}



//    public static void main(String[] args) {
//
//}