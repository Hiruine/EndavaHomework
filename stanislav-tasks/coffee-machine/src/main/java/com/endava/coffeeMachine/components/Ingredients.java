package com.endava.coffeeMachine.components;

public class Ingredients {

    public final double water;
    public final double coffee;
    public final double milk;
    public final double chocolate;
    public final double cream;

    public static class Builder {
        private final double water;
        private final double coffee;

        private double milk = 0.0;
        private double chocolate = 0.0;
        private double cream = 0.0;

        public Builder(double water, double coffee) {
            this.water = water;
            this.coffee = coffee;
        }

        public Builder milk(double val) {
            milk = val;
            return this;
        }
        public Builder chocolate(double val) {
            chocolate = val;
            return this;
        }
        public Builder cream(double val) {
            cream = val;
            return this;
        }

        public Ingredients build() {
            return new Ingredients(this);
        }
    }

    private Ingredients(Builder builder) {
        water = builder.water;
        coffee = builder.coffee;
        milk = builder.milk;
        chocolate = builder.chocolate;
        cream = builder.cream;
    }


  /*      public boolean isLessOrEqualTo(Ingredients ingredients) {
        return this.water <= ingredients.water &&
                this.coffee <= ingredients.coffee &&
                this.milk <= ingredients.milk &&
                this.chocolate <= ingredients.chocolate &&
                this.cream <= ingredients.cream;
    }
*/

//    public Ingredients withdrawIngredients(Ingredients ingredients) {
//        return new Ingredients(
//            ingredients.water - this.water,
//            ingredients.coffee - this.coffee,
//            ingredients.chocolate - this.chocolate,
//            ingredients.milk - this.milk,
//            ingredients.cream - this.cream
//        );
//    }


}
