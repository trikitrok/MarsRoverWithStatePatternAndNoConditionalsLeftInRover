public class West extends Direction {

    public Direction rotateRight() {
        return create("N");
    }

    public Direction rotateLeft() {
        return create("S");
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX() - displacement, position.getY());
    }
}
