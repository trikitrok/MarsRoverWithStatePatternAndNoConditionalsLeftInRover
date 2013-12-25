import java.util.HashMap;

public class Directions {
    public final static String NORTH = "N";
    public final static String SOUTH = "S";
    public final static String EAST = "E";
    public final static String WEST = "W";

    private HashMap<String, Direction> directions;
    
    public Directions() {
        directions = new HashMap<String, Direction>();
        directions.put(NORTH, new North(this));
        directions.put(SOUTH, new South(this));
        directions.put(EAST, new East(this));
        directions.put(WEST, new West(this));
    }
    
    public Direction get(String direction) {
        return directions.get(direction);
    }
}