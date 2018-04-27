package com.endava.coffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    private final BufferedReader bufferedReader;

    public UserInput() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }


    public double getDouble() {
        try {
            String input = bufferedReader.readLine();
            input = input.trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid double. Try again.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new RuntimeException("invalid user input");
    }

}
