public class Vector {

    private Direction direction;
    private Position position;

    public Vector(Direction direction, Position position) {
        this.direction = direction;
        this.position = position;
    }

    public Vector rotateRight() {
        return new Vector(direction.rotateRight(), position);
    }

    public Vector rotateLeft() {
        return new Vector(direction.rotateLeft(), position);
    }

    public Vector displace(int displacement) {
        return new Vector(direction, direction.applyDisplacement(displacement,
                position));
    }

    public static Vector create(int x, int y, String direction) {
        return new Vector(Direction.create(direction), new Position(x, y));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vector other = (Vector) obj;
        if (!direction.equals(other.direction))
            return false;
        if (!position.equals(other.position))
            return false;
        return true;
    }
}
