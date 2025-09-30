// Class Purpose :- " Data collection execution on panel activation else blocking beacause of deactivating the panels "


package commands;

import core.Satellite;
import utils.InvalidOperationException;
import utils.LoggerUtility;

public class CollectDataCommand implements Command {
    private Satellite satellite;

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

    @Override
    public void undo() {
        LoggerUtility.log("Undo not supported for data collection.");
    }

    @Override
    public String getName() {
        return "Collect Data";
    }
}
