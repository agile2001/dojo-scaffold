package type;

public class Comedy extends AbstractPlay {

    protected int calculateCredits(int thisCredits, int audience) {
        return (int) (thisCredits + Math.floor((double) audience / 5));
    }
}
