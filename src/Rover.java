public class Rover {

    private Vector vector;

    public Rover(int x, int y, String direction) {
        this.vector = Vector.create(x, y, direction);
    }

    public void receive(String commandSequence) {
        executeCommandsIn(commandSequence);
    }

    private void executeCommandsIn(String commandSequence) {
        for (int i = 0; i < commandSequence.length(); ++i) {
            Command command = createCommand(commandSequence.substring(i, i + 1));
            vector = command.execute(vector);
        }
    }

    private Command createCommand(String commandAsString) {
        return Command.create(commandAsString);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rover other = (Rover) obj;
        if (!vector.equals(other.vector))
            return false;
        return true;
    }
}
