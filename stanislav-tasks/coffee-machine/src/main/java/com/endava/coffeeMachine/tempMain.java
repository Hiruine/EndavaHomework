package com.endava.coffeeMachine;


import com.endava.coffeeMachine.coffeeTypes.components.Ingredients;
import com.endava.coffeeMachine.coffeeTypes.components.IngredientsResupplier;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

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