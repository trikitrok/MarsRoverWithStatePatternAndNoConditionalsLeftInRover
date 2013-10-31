abstract public class Direction {

    abstract public Direction rotateRight();

    abstract public Direction rotateLeft();

    abstract public Position applyDisplacement(int displacement, Position position);

    public static Direction create(String direction) {
        if (direction.equals("N"))
            return new North();

        if (direction.equals("S"))
            return new South();

        if (direction.equals("W"))
            return new West();

        return new East();
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}
