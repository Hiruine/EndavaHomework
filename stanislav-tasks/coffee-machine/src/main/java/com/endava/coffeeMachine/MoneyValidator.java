package com.endava.coffeeMachine;

import java.math.BigDecimal;

public class MoneyValidator {
    public static boolean hasEnoughMoney(BigDecimal coffeePrice) {

        System.out.println("intro money");
        UserInput userInput = new UserInput();

        return (BigDecimal.valueOf(userInput.getDouble()).compareTo(coffeePrice)) >= 0;

    }
}
