package com.gildedrose;

import static com.gildedrose.Item.createNormalItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[]{createNormalItem("foo", 1, 5)};
        GildedRose app = new GildedRose(items);
        app.passOneDay();
        assertEquals("foo", app.items[0].name);
        assertThat(app.items[0].quality, is(4));
        assertThat(app.items[0].sellIn, is(0));
    }

}
