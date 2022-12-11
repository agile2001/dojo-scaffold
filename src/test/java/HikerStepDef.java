import org.junit.*;
import static org.junit.Assert.*;
import io.cucumber.java.en.*;


public class HikerStepDef {

    private int answer;

    @Given("the hitch-hiker selects some tiles")
    public void theHitchHikerSelectsSomeTiles() throws Throwable {
    }

    @When("they spell {int} times {int}")
    public void theySpellTimes(int arg1, int arg2) throws Throwable {
        answer = Hiker.answer(arg1,arg2);
    }

    @Then("the score is {int}")
    public void theScoreIs(int expected) throws Throwable {
        assertEquals(expected, answer);
    }
}
