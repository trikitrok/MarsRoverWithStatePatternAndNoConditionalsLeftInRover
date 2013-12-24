public class West extends Direction {

    public West(Directions directions) {
        super(directions);
    }
    
    public Direction rotateRight() {
        return directions.get(Directions.NORTH);
    }

    public Direction rotateLeft() {
        return directions.get(Directions.SOUTH);
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX() - displacement, position.getY());
    }
}
