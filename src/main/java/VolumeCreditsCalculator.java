public class VolumeCreditsCalculator {

    public int calculateVolumeCredits(Invoice invoice) {
        var volumeCredits = 0;
        for (var perf : invoice.performances) {
            volumeCredits = getVolumeCredits(volumeCredits, perf);
        }
        return volumeCredits;
    }

    private int getVolumeCredits(int volumeCredits, Performance perf) {
        var thisCredits = Math.max(perf.audience - 30, 0);
        if ("comedy".equals(perf.play.type)) {
            thisCredits += Math.floor((double) perf.audience / 5);
        }

        volumeCredits += thisCredits;
        return volumeCredits;
    }

}
