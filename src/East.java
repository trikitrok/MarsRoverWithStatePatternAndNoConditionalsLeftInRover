public class East extends Direction {

    public Direction rotateRight() {
        return create("S");
    }

    public Direction rotateLeft() {
        return create("N");
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX() + displacement, position.getY());
    }
}
