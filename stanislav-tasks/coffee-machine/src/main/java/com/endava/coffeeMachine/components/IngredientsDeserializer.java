package com.endava.coffeeMachine.components;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IngredientsDeserializer {
    public static Ingredients deserializeIngredients() {
        try (Jsonb jsonb = JsonbBuilder.create()) {

             return jsonb.fromJson(
                    Files.newInputStream(Paths.get(
                            "stanislav-tasks\\" +
                                    "coffee-machine\\src\\main\\resources\\" +
                                    "Ingredients.json")),
                    Ingredients.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
