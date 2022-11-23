public class Performance {

    private static final int THIS_AMOUNT = 40000;
    private static final int INT_2 = 1000;
    private static final int INT_3 = 30;
    private Play play;
    private int audience;

    public Performance(Play play, int audience) {
        this.play = play;
        this.audience = audience;
    }

    int calculateAmount() {
        var thisAmount = THIS_AMOUNT;
        if (audience > INT_3) {
            thisAmount += INT_2 * (audience - INT_3);
        }
        return thisAmount;
    }

    int calculateVolumeCredits() {
        return play.calculateVolumeCredits(audience);
    }

}