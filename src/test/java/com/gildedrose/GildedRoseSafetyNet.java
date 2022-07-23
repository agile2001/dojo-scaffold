package com.gildedrose;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;

import static com.google.common.base.Charsets.UTF_8;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GildedRoseSafetyNet {

    @Test
    public void should_always_generate_output_identical_to_baseline() throws IOException {
        String baseline = Files.asCharSource(new File("src/test/baseline.txt"), UTF_8).read();
        assertThat(TextTestFixture.generateBaselineOutput(), is(baseline));
    }
}
