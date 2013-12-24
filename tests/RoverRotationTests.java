import static org.junit.Assert.*;

import org.junit.Test;

public class RoverRotationTests {
    @Test
    public void facingNorthRotateLeft() {
        Rover rover = new Rover(0, 0, Directions.NORTH);

        rover.receive(CommandsTable.LEFT);

        assertEquals(new Rover(0, 0, Directions.WEST), rover);
    }

    @Test
    public void facingNorthRotateRight() {
        Rover rover = new Rover(0, 0, Directions.NORTH);

        rover.receive(CommandsTable.RIGHT);

        assertEquals(new Rover(0, 0, Directions.EAST), rover);
    }

    @Test
    public void facingSouthRotateLeft() {
        Rover rover = new Rover(0, 0, Directions.SOUTH);

        rover.receive(CommandsTable.LEFT);

        assertEquals(new Rover(0, 0, Directions.EAST), rover);
    }

    @Test
    public void facingSouthRotateRight() {
        Rover rover = new Rover(0, 0, Directions.SOUTH);

        rover.receive(CommandsTable.RIGHT);

        assertEquals(new Rover(0, 0, Directions.WEST), rover);
    }

    @Test
    public void facingWestRotateLeft() {
        Rover rover = new Rover(0, 0, Directions.WEST);

        rover.receive(CommandsTable.LEFT);

        assertEquals(new Rover(0, 0, Directions.SOUTH), rover);
    }

    @Test
    public void facingWestRotateRight() {
        Rover rover = new Rover(0, 0, Directions.WEST);

        rover.receive(CommandsTable.RIGHT);

        assertEquals(new Rover(0, 0, Directions.NORTH), rover);
    }

    @Test
    public void facingEastRotateLeft() {
        Rover rover = new Rover(0, 0, Directions.EAST);

        rover.receive(CommandsTable.LEFT);

        assertEquals(new Rover(0, 0, Directions.NORTH), rover);
    }

    @Test
    public void facingEastRotateRight() {
        Rover rover = new Rover(0, 0, Directions.EAST);

        rover.receive(CommandsTable.RIGHT);

        assertEquals(new Rover(0, 0, Directions.SOUTH), rover);
    }
}
