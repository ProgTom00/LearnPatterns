package com.patterns.patterns.decorator.taxiportal;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiOrderTestSuite {


    @Test
    void testBasicTaxiOrderGetCost() {
        // Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        // When
        BigDecimal theCost = taxiOrder.getCost();
        // Then
        assertEquals(new BigDecimal(5), theCost);
    }
    @Test
    void testBasicTaxiOrderGetDescription() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course", description);
    }
    @Test
    void testTaxiNetworkGetCost() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(40), theCost);
    }
    @Test
    void testTaxiNetworkGetDescription() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course by Taxi Network", description);
    }
    @Test
    void testMyTaxiWithChildSeatGetCost() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder =  new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(37), theCost);

    }
    @Test
    void testMyTaxiWithChildSeatGetDescription() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course by MyTaxi Network + child seat", description);

    }
    @Test
    void testVipTaxiWithChildSeatExpressGetCost() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        // When
        BigDecimal theCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(57), theCost);
    }
    @Test
    void testVipTaxiWithChildSeatExpressGetDescription() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        // Then
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course by Taxi Network express service variant VIP + child seat", description);
    }
}
