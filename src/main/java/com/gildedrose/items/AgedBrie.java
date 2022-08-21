package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            increaseQuality();
        }
    }

    @Override
    protected void updateQualityAfterExpiration() {
        if (quality < 50) {
            increaseQuality();
        }
    }
}
