package com.agile2001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaleIT {

    @Test
    public void sale() {

        // Given
        Item itemA = new Item("A", 10);
        Item itemB = new Item("B", 25);
        Item itemC = new Item("C", 9.99);

        // When
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.add(new ShoppingCarItem(itemA, 5));
        shoppingCar.add(new ShoppingCarItem(itemB, 2));
        shoppingCar.add(new ShoppingCarItem(itemC, 6));

        Order order = new Order();
        double discount = order.caculate(shoppingCar);

        // Then
        Assertions.assertEquals(151.94f, discount, 0.001);

    }

}
