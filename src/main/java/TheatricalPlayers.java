import java.text.NumberFormat;
import java.util.Locale;

public class TheatricalPlayers {

    public String print(Invoice invoice) {
        int totalAmount = calculateTotalAmount(invoice);
        int volumeCredits = calculateVolumeCredits(invoice);
        return print(invoice, totalAmount, volumeCredits);
    }

    private int calculateVolumeCredits(Invoice invoice) {
        var volumeCredits = 0;
        for (var perf : invoice.performances) {
            volumeCredits = getVolumeCredits(volumeCredits, perf);
        }
        return volumeCredits;
    }

    private int calculateTotalAmount(Invoice invoice) {
        var totalAmount = 0;
        for (var perf : invoice.performances) {
            totalAmount = getTotalAmount(totalAmount, perf);
        }
        return totalAmount;
    }

    private int getVolumeCredits(int volumeCredits, Performance perf) {
        var thisCredits = Math.max(perf.audience - 30, 0);
        if ("comedy".equals(perf.play.type)) {
            thisCredits += Math.floor((double) perf.audience / 5);
        }

        volumeCredits += thisCredits;
        return volumeCredits;
    }

    private int getTotalAmount(int totalAmount, Performance perf) {
        var thisAmount = 40000;
        if (perf.audience > 30) {
            thisAmount += 1000 * (perf.audience - 30);
        }
        totalAmount += thisAmount;
        return totalAmount;
    }

    private String print(Invoice invoice, int totalAmount, int volumeCredits) {
        var result = String.format("Statement for %s\n", invoice.customer);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        result += String.format("Amount owed is %s\n", format.format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }

}