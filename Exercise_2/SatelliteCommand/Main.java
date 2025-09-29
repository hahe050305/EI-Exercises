import commands.*;
import core.Satellite;
import invoker.CommandInvoker;

public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        CommandInvoker invoker = new CommandInvoker();

        // Adding commands in sequence
        invoker.addCommand(new RotateCommand(satellite, "South"));
        invoker.addCommand(new ActivatePanelsCommand(satellite));
        invoker.addCommand(new CollectDataCommand(satellite));
        invoker.addCommand(new DeactivatePanelsCommand(satellite));
        invoker.addCommand(new CollectDataCommand(satellite)); // will log error

        // Execute commands
        invoker.executeCommands();

        // Print final status
        satellite.printStatus();
    }
}
