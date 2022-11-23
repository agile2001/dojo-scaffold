package type;

abstract public class AbstractPlay {

    public int calculateCredits(int audience) {
        return calculateCredits(Math.max(audience - 30, 0), audience);
    }

    protected abstract int calculateCredits(int thisCredits, int audience);
}
