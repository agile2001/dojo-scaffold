import java.text.NumberFormat;
import java.util.Locale;

public class InvoiceFormatter {

    public String print(Invoice invoice, int totalAmount, int volumeCredits) {
        return String.format("""
            Statement for %s
            Amount owed is %s
            You earned %s credits
            """, invoice.getCustomer(), usd(totalAmount / 100), volumeCredits);
    }


    private String usd(int number) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(number);
    }
}
