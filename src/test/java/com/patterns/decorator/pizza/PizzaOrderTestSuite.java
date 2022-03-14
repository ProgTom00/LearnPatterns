package com.patterns.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        Long cost = pizzaOrder.getCost();
        // Then
        assertEquals(15,cost);
    }
    @Test
    void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // Then
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Pizza dough with tomato sauce and cheese", description);
    }
    @Test
    void testBasicPizzaOrderWithCheeseAdditionalGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseAddIngredientDecorator(pizzaOrder);
        // then
        Long cost = pizzaOrder.getCost();
        // Then
        assertEquals(18, cost);
    }
    @Test
    void testBasicPizzaOrderWithCheeseAdditionalGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseAddIngredientDecorator(pizzaOrder);
        // Then
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Pizza dough with tomato sauce and cheese + additional cheese", description);
    }
    @Test
    void testBasicPizzaOrderWithAllIngredientsAndSaucesGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseAddIngredientDecorator(pizzaOrder);
        pizzaOrder = new GreenOlivesIngredientDecorator(pizzaOrder);
        pizzaOrder = new HamIngredientDecorator(pizzaOrder);
        pizzaOrder = new GarlicIngredientDecorator(pizzaOrder);
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new CocaColaAdditionalDecorator(pizzaOrder);
        // Then
        Long cost = pizzaOrder.getCost();
        // Then
        assertEquals(34,cost);
    }
    @Test
    void testBasicPizzaOrderWithAllIngredientsAndSaucesGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseAddIngredientDecorator(pizzaOrder);
        pizzaOrder = new GreenOlivesIngredientDecorator(pizzaOrder);
        pizzaOrder = new HamIngredientDecorator(pizzaOrder);
        pizzaOrder = new GarlicIngredientDecorator(pizzaOrder);
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new CocaColaAdditionalDecorator(pizzaOrder);
        // Then
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Pizza dough with tomato sauce and cheese + additional cheese + green olives + ham olives + garlic sauce + coca-cola 0.5L", description);
    }
}
