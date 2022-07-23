package org.codingdojo.kata;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class MissionTest {
    @Test
    public void should_create_mission_with_text() {
        String missionText = "10 20\n" + "3 5 w\n" + "FFLFLLFFFFFRFFRRFFRRF";
        Mission mission = new Mission(missionText);
        assertThat(mission.report(), is("2 9 e"));
    }
}
