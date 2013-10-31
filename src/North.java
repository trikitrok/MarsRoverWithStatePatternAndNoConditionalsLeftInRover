public class North extends Direction {

    public Direction rotateRight() {
        return create("E");
    }

    public Direction rotateLeft() {
        return create("W");
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX(), position.getY() + displacement);
    }
}
