package com.patterns.patterns.decorator.pizza;

public class GreenOlivesIngredientDecorator extends AbstractPizzaOrderDecorator{
    protected GreenOlivesIngredientDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public Long getCost() {
        return super.getCost() + 3L;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + green olives";
    }
}
