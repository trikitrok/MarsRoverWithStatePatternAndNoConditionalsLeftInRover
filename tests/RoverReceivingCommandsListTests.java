import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoverReceivingCommandsListTests {
    @Test
    public void noCommands() {
        Rover rover = new Rover(0, 0, Directions.NORTH);

        rover.receive("");

        assertEquals(new Rover(0, 0, Directions.NORTH), rover);
    }

    @Test
    public void twoCommands() {
        Rover rover = new Rover(0, 0, Directions.NORTH);

        rover.receive("lf");

        assertEquals(new Rover(-1, 0, Directions.WEST), rover);
    }

    @Test
    public void manyCommands() {
        Rover rover = new Rover(0, 0, Directions.NORTH);

        rover.receive("ffrbbrfflff");

        assertEquals(new Rover(0, 0, Directions.EAST), rover);
    }
}
