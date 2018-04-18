package com.endava.coffeeMachine.coffeeTypes.components;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IngredientsSerializer {
    public static void serializeIngredients(Ingredients ingredients) {
        try (Jsonb jsonb = JsonbBuilder.create()) {

             jsonb.toJson(
                     ingredients, Ingredients.class,
                     Files.newOutputStream(Paths.get(
                            "stanislav-tasks\\" +
                                    "coffee-machine\\src\\main\\resources\\" +
                                    "Ingredients.json"))
                     );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
