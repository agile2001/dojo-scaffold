package com.agile2001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void should_return_0_given_empty_when_calculate() {
        Order order = new Order();
        double caculate = order.caculate(new ShoppingCar());
        Assertions.assertEquals(0, caculate, 0.001);
    }

    @Test
    void should_return_50_given_50_when_calculate() {
        // Given
        Item itemA = new Item("A", 50.0d);
        // When
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.add(new ShoppingCarItem(itemA, 1));

        Order order = new Order();
        double caculate = order.caculate(shoppingCar);
        Assertions.assertEquals(50, caculate, 0.001);
    }

}