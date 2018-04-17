package com.endava.coffeeMachine.coffeeTypes.components;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IngredientsDeserializer {
    public static Ingredients deserializeIngredients() {
        try (Jsonb jsonb = JsonbBuilder.create()) {

            return jsonb.fromJson(
                    Files.newInputStream(Paths.get(
                            "/home/hiruine/programing/endava_internship2018/homework/EndavaHomework"
                                    + "/stanislav-tasks/coffee-machine/src/main/resources/Ingredients.json")),
                    Ingredients.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
