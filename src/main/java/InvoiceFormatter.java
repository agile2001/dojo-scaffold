import java.text.NumberFormat;
import java.util.Locale;

public class InvoiceFormatter {

    public String print(Invoice invoice, int totalAmount, int volumeCredits) {
        var result = String.format("Statement for %s\n", invoice.customer);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        result += String.format("Amount owed is %s\n", format.format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }
}
