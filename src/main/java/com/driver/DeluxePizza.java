package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
    }

    @Override
    public void addExtraCheese() {
        return;
    }

    @Override
    public void addExtraToppings() {
        return;
    }
}
