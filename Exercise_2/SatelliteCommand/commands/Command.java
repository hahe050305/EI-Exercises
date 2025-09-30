// Class Purpose :- " Defines a contract for all the methods and is opened for extension "


package commands;

public interface Command {
    void execute();
    void undo();       // for undo functionality
    String getName();  // for history tracking
}
