// Class Purpose :- "Execution of deactivation part of satellite "

package commands;

import core.Satellite;

public class DeactivatePanelsCommand implements Command {
    private Satellite satellite;

    public DeactivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.deactivatePanels();
    }

    @Override
    public void undo() {
        satellite.activatePanels();
    }

    @Override
    public String getName() {
        return "Deactivate Panels";
    }
}
