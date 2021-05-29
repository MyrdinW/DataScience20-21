package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private final List<ICommand> commandList = new ArrayList<>();

    public void setCommand(ICommand command) {
        commandList.add(command);
    }

    public void executeCommand() {
        for (ICommand command : commandList) {
            command.execute();
        }
        commandList.clear();
    }


}
