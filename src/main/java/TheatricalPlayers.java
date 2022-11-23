public class TheatricalPlayers {

    private final TotalAmountCalculate totalAmountCalculate;
    private final VolumeCreditsCalculator volumeCreditsCalculator;
    private final InvoiceFormatter invoiceFormatter;

    public TheatricalPlayers(TotalAmountCalculate totalAmountCalculate,
        VolumeCreditsCalculator volumeCreditsCalculator, InvoiceFormatter invoiceFormatter) {
        this.totalAmountCalculate = totalAmountCalculate;
        this.volumeCreditsCalculator = volumeCreditsCalculator;
        this.invoiceFormatter = invoiceFormatter;
    }

    public String print(Invoice invoice) {

        int totalAmount = totalAmountCalculate.calculateTotalAmount(invoice);
        int volumeCredits = volumeCreditsCalculator.calculateVolumeCredits(invoice);

        return invoiceFormatter.print(invoice, totalAmount, volumeCredits);
    }

}