package commands;

import core.Satellite;
import utils.InvalidOperationException;
import utils.LoggerUtility;

public class CollectDataCommand implements Command {
    private final Satellite satellite;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        try {
            satellite.collectData();
        } catch (InvalidOperationException e) {
            LoggerUtility.log("Error: " + e.getMessage());
        }
    }
}
