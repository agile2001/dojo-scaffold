package com.agile2001;

import com.google.common.util.concurrent.AtomicDouble;
import java.util.Iterator;

public class Order {

    public double caculate(ShoppingCar shoppingCar) {

        Iterator<ShoppingCarItem> iterator = shoppingCar.iterator();
        AtomicDouble totalSum = new AtomicDouble(0);
        iterator.forEachRemaining(item -> {
            double price = item.getItem().getPrice();
            int count = item.getCount();
            System.out.println("price = " + price);
            System.out.println("count = " + count);
            totalSum.addAndGet(+price * count);
        });
        return totalSum.get();
    }
}
