package com.patterns.patterns.decorator.pizza;

public class HamIngredientDecorator extends AbstractPizzaOrderDecorator{
    protected HamIngredientDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public Long getCost() {
        return super.getCost() + 3L;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + ham";
    }
}
