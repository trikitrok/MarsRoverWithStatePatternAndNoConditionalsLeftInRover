import static org.junit.Assert.*;

import org.junit.Test;

public class RoverPositionTests {
    @Test
    public void facingNorthMoveForward() {
        Rover rover = new Rover(0, 0, Directions.NORTH);

        rover.receive("f");

        assertEquals(new Rover(0, 1, Directions.NORTH), rover);
    }

    @Test
    public void facingNorthMoveBackward() {
        Rover rover = new Rover(0, 0, Directions.NORTH);

        rover.receive("b");

        assertEquals(new Rover(0, -1, Directions.NORTH), rover);
    }

    @Test
    public void facingSouthMoveForward() {
        Rover rover = new Rover(0, 0, Directions.SOUTH);

        rover.receive("f");

        assertEquals(new Rover(0, -1, Directions.SOUTH), rover);
    }

    @Test
    public void facingSouthMoveBackward() {
        Rover rover = new Rover(0, 0, Directions.SOUTH);

        rover.receive("b");

        assertEquals(new Rover(0, 1, Directions.SOUTH), rover);
    }

    @Test
    public void facingWestMoveForward() {
        Rover rover = new Rover(0, 0, Directions.WEST);

        rover.receive("f");

        assertEquals(new Rover(-1, 0, Directions.WEST), rover);
    }

    @Test
    public void facingWestMoveBackward() {
        Rover rover = new Rover(0, 0, Directions.WEST);

        rover.receive("b");

        assertEquals(new Rover(1, 0, Directions.WEST), rover);
    }

    @Test
    public void facingEastMoveForward() {
        Rover rover = new Rover(0, 0, Directions.EAST);

        rover.receive("f");

        assertEquals(new Rover(1, 0, Directions.EAST), rover);
    }

    @Test
    public void facingEastMoveBackward() {
        Rover rover = new Rover(0, 0, Directions.EAST);

        rover.receive("b");

        assertEquals(new Rover(-1, 0, Directions.EAST), rover);
    }
}
