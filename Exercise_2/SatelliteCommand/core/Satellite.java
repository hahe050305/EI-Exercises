package core;

import utils.LoggerUtility;
import utils.InvalidOperationException;

public class Satellite {
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";   // initial state
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    public void rotate(String direction) {
        this.orientation = direction;
        LoggerUtility.log("Satellite rotated to " + direction);
    }

    public void activatePanels() {
        this.solarPanelsActive = true;
        LoggerUtility.log("Solar panels activated.");
    }

    public void deactivatePanels() {
        this.solarPanelsActive = false;
        LoggerUtility.log("Solar panels deactivated.");
    }

    public void collectData() throws InvalidOperationException {
        if (solarPanelsActive) {
            dataCollected += 10;
            LoggerUtility.log("Data collected. Total = " + dataCollected);
        } else {
            throw new InvalidOperationException("Cannot collect data. Solar panels are inactive.");
        }
    }

    public void printStatus() {
        System.out.println("=== Satellite Status ===");
        System.out.println("Orientation: " + orientation);
        System.out.println("Solar Panels: " + (solarPanelsActive ? "Active" : "Inactive"));
        System.out.println("Data Collected: " + dataCollected);
    }
}
