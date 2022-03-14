package com.patterns.decorator.pizza;

public class CheeseAddIngredientDecorator extends AbstractPizzaOrderDecorator{
    protected CheeseAddIngredientDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public Long getCost() {
        return super.getCost() + 3L;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + additional cheese";
    }
}
