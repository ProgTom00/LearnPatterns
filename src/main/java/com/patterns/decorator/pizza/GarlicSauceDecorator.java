package com.patterns.decorator.pizza;

public class GarlicSauceDecorator extends AbstractPizzaOrderDecorator {
    protected GarlicSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public Long getCost() {
        return super.getCost() + 2L;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + garlic sauce";
    }
}
