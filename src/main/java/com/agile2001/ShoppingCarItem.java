package com.agile2001;

public class ShoppingCarItem {
    private Item item;
    private int count;

    public ShoppingCarItem(Item item, int count) {

        this.item = item;
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
