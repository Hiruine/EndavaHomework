package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.components.Ingredients;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;

public enum CoffeeTypeComponents {
    //espresso ratio coffee-water 1:2

    //water, espresso, milk, chocolate, cream
    ESPRESSO(0, 60, 0, 0, 0),
    CAPPUCCINO(0, 60, 60, 0, 60),
    AMERICANO(120, 60, 0, 0, 0),
    MOCHA(0, 72, 36, 72, 0),
    LATTE(0, 110, 55, 0, 15);

    private final double water;
    private final double espresso;
    private final double milk;
    private final double chocolate;
    private final double cream;

    CoffeeTypeComponents(double water, double espresso,
                         double milk, double chocolate, double cream) {
        this.water = water;
        this.espresso = espresso;
        this.milk = milk;
        this.chocolate = chocolate;
        this.cream = cream;
    }

    public boolean hasIngredients() {

        try (Jsonb jsonb = JsonbBuilder.create()) {

            Ingredients ingredients = jsonb.fromJson(
                    Files.newInputStream(Paths.get(
                            "/home/hiruine/programing/endava_internship2018/homework/EndavaHomework"
                                    + "/stanislav-tasks/coffee-machine/src/main/resources/Ingredients.json")),
                    Ingredients.class);

            System.out.println(ingredients.toString());

            System.out.println(this.isLessOrEqualTo(ingredients));

            return this.isLessOrEqualTo(ingredients);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }


    private boolean isLessOrEqualTo(Ingredients ingredients) {
        if(
                water <= ingredients.water &&
                        (espresso / 2) <= ingredients.espresso &&
                milk <= ingredients.milk &&
                        chocolate <= ingredients.chocolate &&
                        cream <= ingredients.cream
        ) {
            return true;
        }
        return false;
    }


}
