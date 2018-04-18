package com.endava.coffeeMachine.coffeeTypes.components;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IngredientsResupplier {
    public static void resupply() {

        Ingredients ingredients = new Ingredients(1000.0, 1000.0,
                1000.0, 1000.0, 1000.0);

        JsonbConfig config = new JsonbConfig()
                .withFormatting(true);

        try (Jsonb jsonb = JsonbBuilder.create(config)) {

            jsonb.toJson(
                    ingredients, Ingredients.class,
                    Files.newOutputStream(Paths.get(
                            "stanislav-tasks\\coffee-machine\\" +
                                    "src\\main\\resources\\Ingredients.json"))
            );


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
