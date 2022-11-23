import type.AbstractPlay;

public class Play {

    private String name;
    private AbstractPlay abstractPlay;

    public Play(String name, AbstractPlay abstractPlay) {
        this.name = name;
        this.abstractPlay = abstractPlay;
    }

    public int calculateVolumeCredits(int audience) {
        return abstractPlay.calculateCredits(audience);
    }
}