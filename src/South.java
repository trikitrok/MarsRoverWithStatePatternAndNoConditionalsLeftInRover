public class South extends Direction {

    public Direction rotateRight() {
        return create("W");
    }

    public Direction rotateLeft() {
        return create("E");
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX(), position.getY() - displacement);
    }
}
