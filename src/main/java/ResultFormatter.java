import java.text.NumberFormat;
import java.util.Locale;

public class ResultFormatter {

    String getResult(Invoice invoice, int totalAmount, int volumeCredits) {
        var result = String.format("Statement for %s\n", invoice.customer);
        result += String.format("Amount owed is %s\n", NumberFormat.getCurrencyInstance(Locale.US)
            .format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }
}
