public class MoveBackward extends Command {
    public Vector execute(Vector vector) {
        return vector.displace(-1);
    }
}
