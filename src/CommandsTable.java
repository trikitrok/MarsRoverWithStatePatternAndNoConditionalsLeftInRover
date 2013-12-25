import java.util.ArrayList;
import java.util.HashMap;

public class CommandsTable {

    public final static String FORWARD = "f";
    public final static String BACKWARD = "b";
    public final static String LEFT = "l";
    public final static String RIGHT = "r";

    private HashMap<String, Command> commandsTable;

    public CommandsTable() {
        commandsTable = new HashMap<String, Command>();
        commandsTable.put(FORWARD, new MoveForward());
        commandsTable.put(BACKWARD, new MoveBackward());
        commandsTable.put(LEFT, new RotateLeft());
        commandsTable.put(RIGHT, new RotateRight());
    }

    public Commands createCommands(String commandSequence) {
        ArrayList<Command> commands = new ArrayList<Command>();

        for (int i = 0; i < commandSequence.length(); ++i)
            commands.add(createCommand(commandSequence.substring(i, i + 1)));

        return new Commands(commands);
    }

    private Command createCommand(String command) {
        return commandsTable.get(command);
    }
}
