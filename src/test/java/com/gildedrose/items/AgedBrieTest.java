package com.gildedrose.items;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class AgedBrieTest {
    @Test
    public void quality_should_never_exceed_50() {
        AgedBrie agedBrie = new AgedBrie(0, 48);
        agedBrie.passOneDay();
        assertThat(agedBrie.quality, is(50));
        agedBrie.passOneDay();
        assertThat(agedBrie.quality, is(50));
    }
}