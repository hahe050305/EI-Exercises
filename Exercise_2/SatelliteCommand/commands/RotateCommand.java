// Class Purpose :- " To set the orientation of the satellite by rotatating to desired position after the intial preset"


package commands;

import core.Satellite;

public class RotateCommand implements Command {
    private Satellite satellite;
    private String direction;
    private String previousDirection;

    public RotateCommand(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }

    @Override
    public void execute() {
        previousDirection = "North"; 
        satellite.rotate(direction);
    }

    @Override
    public void undo() {
        satellite.rotate(previousDirection);
    }

    @Override
    public String getName() {
        return "Rotate to " + direction;
    }
}
