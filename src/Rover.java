public class Rover {

    private Vector vector;

    public Rover(int x, int y, String direction) {
        this.vector = Vector.create(x, y, direction);
    }

    public void receive(String commandSequence) {
        Commands commands = createCommands(commandSequence);
        execute(commands);
    }

    private void execute(Commands commands) {
        vector = commands.execute(vector);
    }

    private Commands createCommands(String commandSequence) {
        return new CommandsTable().createCommands(commandSequence);
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
