// Class Purpose :- " To display the history of latest commands inputed and display it "

package invoker;

import commands.Command;
import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> history = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        history.add(command);
    }

    public void undoLast() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }
        Command last = history.remove(history.size() - 1);
        last.undo();
        System.out.println("Undid: " + last.getName());
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("No commands executed yet.");
            return;
        }
        System.out.println("Command History:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + history.get(i).getName());
        }
    }
}
