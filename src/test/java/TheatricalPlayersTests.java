import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;

import java.util.List;
import org.junit.jupiter.api.Test;
import type.Comedy;
import type.Tragedy;

import static org.approvaltests.Approvals.verify;

@UseReporter(JunitReporter.class)
public class TheatricalPlayersTests {

    @Test
    public void exampleStatement() {

        List<Performance> performances = List.of(
            new Performance(new Play("Hamlet", new Tragedy()), 55),
            new Performance(new Play("As You Like It", new Comedy()), 35),
            new Performance(new Play("Othello", new Tragedy()), 40));

        Invoice invoice = new Invoice("BigCo", performances);

        TheatricalPlayers theatricalPlayers = new TheatricalPlayers(new InvoiceFormatter());
        var result = theatricalPlayers.print(invoice);

        verify(result);
    }

}