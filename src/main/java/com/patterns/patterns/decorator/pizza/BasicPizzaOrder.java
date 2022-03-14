package com.patterns.patterns.decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public Long getCost() {
        return 15L;
    }

    @Override
    public String getDescription() {
        return "Pizza dough with tomato sauce and cheese";
    }
}
