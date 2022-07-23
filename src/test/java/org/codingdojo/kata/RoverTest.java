package org.codingdojo.kata;


import static org.codingdojo.kata.Direction.NORTH;
import static org.codingdojo.kata.Direction.SOUTH;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class RoverTest {
    @Test
    public void should_move_forward() {
        Area area = new Area(3, 5);

        Rover firstRover = area.deploy(2, 1, NORTH);
        firstRover.moveForward();
        assertThat(firstRover.report(), is("2 2 N"));

        Rover secondRover = area.deploy(1, 3, SOUTH);
        secondRover.moveForward();
        assertThat(secondRover.report(), is("1 2 S"));
    }
}