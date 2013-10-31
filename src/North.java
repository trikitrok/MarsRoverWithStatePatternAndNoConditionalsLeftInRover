public class North extends Direction {

    public Direction rotateRight() {
        return new East();
    }

    public Direction rotateLeft() {
        return new West();
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX(), position.getY() + displacement);
    }
}
