public class South extends Direction {

    public South(Directions directions) {
        super(directions);
    }

    public Direction rotateRight() {
        return directions.get(Directions.WEST);
    }

    public Direction rotateLeft() {
        return directions.get(Directions.EAST);
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX(), position.getY() - displacement);
    }
}
