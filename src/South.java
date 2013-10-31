public class South extends Direction {

    public Direction rotateRight() {
        return new West();
    }

    public Direction rotateLeft() {
        return new East();
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX(), position.getY() - displacement);
    }
}
