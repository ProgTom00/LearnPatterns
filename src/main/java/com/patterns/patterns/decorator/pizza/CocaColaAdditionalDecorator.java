package com.patterns.patterns.decorator.pizza;

public class CocaColaAdditionalDecorator extends AbstractPizzaOrderDecorator{
    protected CocaColaAdditionalDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public Long getCost() {
        return super.getCost() + 5L;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + coca-cola 0.5L";
    }
}
