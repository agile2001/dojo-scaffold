package com.agile2001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCar {

    private List<ShoppingCarItem> shoppingCarItemList;

    public ShoppingCar() {
        shoppingCarItemList = new ArrayList<>();
    }

    public void add(ShoppingCarItem shoppingCarItem) {
        shoppingCarItemList.add(shoppingCarItem);
    }

    public Iterator<ShoppingCarItem> iterator() {
        System.out.println("shoppingCarItemList.size() = " + shoppingCarItemList.size());
        return shoppingCarItemList.iterator();
    }
}
