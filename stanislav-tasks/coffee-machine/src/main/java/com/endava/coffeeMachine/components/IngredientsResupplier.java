package com.endava.coffeeMachine.components;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IngredientsResupplier {
    public static void resupply() {

        Ingredients ingredients = new Ingredients.Builder(1000, 1000)
                .chocolate(1000).cream(1000).milk(1000).build();

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
