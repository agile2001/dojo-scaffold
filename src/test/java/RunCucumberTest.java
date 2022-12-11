import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
    monochrome = true,
    plugin = {"pretty"}
)
public class RunCucumberTest {
    // this is the adapter/bridge code
    // between cucumber jvm and junit
    // you do not need to edit this
}
