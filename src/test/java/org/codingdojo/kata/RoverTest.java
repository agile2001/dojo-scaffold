package org.codingdojo.kata;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoverTest {

    private Rover rover;

    @BeforeEach
    public void setUp() {
        rover = new Rover("3 5 w");
    }

    @Test
    public void should_create_rover_with_initial_coordinate() {
        assertRoverStatus(rover, "3 5 w");
    }

    @Test
    public void should_move_forward_and_turn() {
        rover.on("f");
        assertRoverStatus(rover, "2 5 w");
        rover.on("l");
        assertRoverStatus(rover, "2 5 s");
        rover.on("f");
        assertRoverStatus(rover, "2 4 s");
        rover.on("l");
        assertRoverStatus(rover, "2 4 e");
        rover.on("f");
        assertRoverStatus(rover, "3 4 e");
        rover.on("l");
        assertRoverStatus(rover, "3 4 n");
        rover.on("f");
        assertRoverStatus(rover, "3 5 n");
        rover.on("l");
        assertRoverStatus(rover, "3 5 w");
        rover.on("r");
        assertRoverStatus(rover, "3 5 n");
        rover.on("r");
        assertRoverStatus(rover, "3 5 e");
        rover.on("r");
        assertRoverStatus(rover, "3 5 s");
        rover.on("r");
        assertRoverStatus(rover, "3 5 w");
    }

    private void assertRoverStatus(Rover rover, String status) {
        assertThat(rover.status(), is(status));
    }
}