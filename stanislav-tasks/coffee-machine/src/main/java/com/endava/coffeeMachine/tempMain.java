package com.endava.coffeeMachine;

import com.endava.coffeeMachine.coffeeTypes.components.Ingredients;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class tempMain {
    public static void main(String[] args) {
        Ingredients ingredients = new Ingredients(10, 100, 10, 100, 100);

        JsonbConfig config = new JsonbConfig()
                .withFormatting(true);

        try(Jsonb jsonb = JsonbBuilder.create(config)) {

            jsonb.toJson(
                    ingredients,
                    Files.newOutputStream(Paths.get(
                            "stanislav-tasks\\coffee-machine"
                                    + "\\src\\main\\resources\\Ingredients.json"))
                    );


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
