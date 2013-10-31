abstract public class Command {
    abstract public Vector execute(Vector vector);

    public static Command create(String commandAsString) {
        if (commandAsString.equals("l"))
            return new RotateLeft();

        if (commandAsString.equals("r"))
            return new RotateRight();

        if (commandAsString.equals("b"))
            return new MoveBackward();

        return new MoveForward();
    }
}
