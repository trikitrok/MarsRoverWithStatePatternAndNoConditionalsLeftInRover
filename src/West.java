public class West extends Direction {

    public Direction rotateRight() {
        return new North();
    }

    public Direction rotateLeft() {
        return new South();
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX() - displacement, position.getY());
    }
}
