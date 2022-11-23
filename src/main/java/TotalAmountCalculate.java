public class TotalAmountCalculate {

    int calculateTotalAmount(Invoice invoice) {
        var totalAmount = 0;
        for (var perf : invoice.performances) {
            totalAmount = getTotalAmount(totalAmount, perf);
        }
        return totalAmount;
    }

    private int getTotalAmount(int totalAmount, Performance perf) {
        var thisAmount = 40000;
        if (perf.audience > 30) {
            thisAmount += 1000 * (perf.audience - 30);
        }
        totalAmount += thisAmount;
        return totalAmount;
    }

}
