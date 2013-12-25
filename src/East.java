public class East extends Direction {

    public East(Directions directions) {
        super(directions);
    }

    public Direction rotateRight() {
        return directions.get(Directions.SOUTH);
    }

    public Direction rotateLeft() {
        return directions.get(Directions.NORTH);
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX() + displacement, position.getY());
    }
}
