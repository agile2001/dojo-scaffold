package com.gildedrose;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GildedRoseSafetyNet {

    public void should_always_generate_the_same_output() throws IOException {
        File baselineFile = new File("src/test/baseline.txt");
        String baseline = Files.asCharSource(baselineFile, UTF_8).read();
        assertThat(TextTestFixture.overallTestResult(3), is(baseline));
    }
}
