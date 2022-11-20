public class TheatricalPlayers {
    private final ResultFormatter resultFormatter;

    public TheatricalPlayers(ResultFormatter resultFormatter) {
        this.resultFormatter = resultFormatter;
    }

    public String print(Invoice invoice) {
        int totalAmount = invoice.calculateTotalAmount();
        int volumeCredits = invoice.calculateCredits();
        return resultFormatter.getResult(invoice, totalAmount, volumeCredits);
    }

}