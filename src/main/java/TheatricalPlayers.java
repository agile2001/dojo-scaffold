public class TheatricalPlayers {

    private final InvoiceFormatter invoiceFormatter;

    public TheatricalPlayers(InvoiceFormatter invoiceFormatter1) {
        invoiceFormatter = invoiceFormatter1;
    }

    public String print(Invoice invoice) {

        int totalAmount = invoice.calculateTotalAmount();
        int volumeCredits = invoice.calculateVolumeCredits();

        return invoiceFormatter.print(invoice, totalAmount, volumeCredits);
    }

}