import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class CanaryTest {

    @Test
    public void should_be_able_to_run_a_trivial_test_case() {
        assertThat(1 + 2, is(3));
    }

    @Test
    public void should_be_able_to_use_guava_capabilities() throws IOException {
        List<Integer> numbers = newArrayList(1, 2, 3, 4, 5);
        List<Integer> doubled = numbers.stream().map(x -> x * 2).collect(toList());
        assertThat(doubled, is(newArrayList(2, 4, 6, 8, 10)));

        String src = Files.asCharSource(new File("src/test/java/CanaryTest.java"), UTF_8).read();
        assertThat(src.length(), is(980));
    }
}
