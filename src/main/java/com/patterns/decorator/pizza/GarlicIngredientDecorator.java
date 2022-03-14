package com.patterns.decorator.pizza;

public class GarlicIngredientDecorator extends AbstractPizzaOrderDecorator {
    protected GarlicIngredientDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public Long getCost() {
        return super.getCost() + 3L;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " olives";
    }
}
