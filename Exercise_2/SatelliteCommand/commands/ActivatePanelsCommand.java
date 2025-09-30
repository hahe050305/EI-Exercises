// Class Purpose :- " Activating the panels "


package commands;

import core.Satellite;

public class ActivatePanelsCommand implements Command {
    private Satellite satellite;

    public ActivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.activatePanels();
    }

    @Override
    public void undo() {
        satellite.deactivatePanels();
    }

    @Override
    public String getName() {
        return "Activate Panels";
    }
}
