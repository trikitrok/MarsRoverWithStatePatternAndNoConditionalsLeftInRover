abstract public class Direction {

    abstract public Direction rotateRight();

    abstract public Direction rotateLeft();

    abstract public Position applyDisplacement(int displacement,
            Position position);

    Directions directions;

    public Direction(Directions directions) {
        this.directions = directions;
    }

    public static Direction create(String direction) {
        return new Directions().get(direction);
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}
