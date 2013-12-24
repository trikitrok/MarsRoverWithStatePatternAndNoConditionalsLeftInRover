import static org.junit.Assert.*;

import org.junit.Test;

public class RoverEqualityTests {
    @Test
    public void equalRovers() {
        assertEquals(new Rover(1, 1, Directions.NORTH), 
                new Rover(1, 1, Directions.NORTH));
    }

    @Test
    public void notEqualRovers() {
        assertNotEquals(new Rover(1, 1, Directions.NORTH), 
                new Rover(1, 1, Directions.SOUTH));
        
        assertNotEquals(new Rover(1, 1, Directions.NORTH), 
                new Rover(1, 1, Directions.SOUTH));
        
        assertNotEquals(new Rover(1, 1, Directions.NORTH), 
                new Rover(1, 2, Directions.NORTH));
        
        assertNotEquals(new Rover(1, 1, Directions.NORTH), 
                new Rover(0, 1, Directions.NORTH));
    }
}
