public class North extends Direction {

    public North(Directions directions) {
        super(directions);
    }
    
    public Direction rotateRight() {
        return directions.get(Directions.EAST);
    }

    public Direction rotateLeft() {
        return directions.get(Directions.WEST);
    }

    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX(), position.getY() + displacement);
    }
}
