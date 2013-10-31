public class East extends Direction {

    public Direction rotateRight() {
        return new South();
    }

    public Direction rotateLeft() {
        return new North();
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX() + displacement, position.getY());
    }
}
