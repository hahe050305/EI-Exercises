// This class purpose :- " Satellite operations execution and handling the failure state and edge cases "

package core;

import utils.InvalidOperationException;
import utils.LoggerUtility;

public class Satellite 
{
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;
    private String mode; // NORMAL or FAILURE

    public Satellite() 
    {
        this.orientation = "North";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
        this.mode = "NORMAL"; // default
    }

    public void rotate(String direction) 
    {
        if (isFailure()) 
        {
            LoggerUtility.log("Rotation blocked. Satellite in FAILURE mode. Remedy: recover system.");
            return;
        }

        this.orientation = direction;
        LoggerUtility.log("Satellite rotated to " + direction);
    }

    public void activatePanels() 
    {
        if (isFailure()) 
        {
            LoggerUtility.log("Cannot activate panels in FAILURE mode. Remedy: recover system.");
            return;
        }

        this.solarPanelsActive = true;
        LoggerUtility.log("Solar panels activated.");
    }

    public void deactivatePanels() 
    {
        if (isFailure()) {
            LoggerUtility.log("Cannot deactivate panels in FAILURE mode. Remedy: recover system.");
            return;
        }
        this.solarPanelsActive = false;
        LoggerUtility.log("Solar panels deactivated.");
    }

    public void collectData() throws InvalidOperationException 
    {
        if (isFailure()) 
        {
            LoggerUtility.log("Data collection blocked. Satellite in FAILURE mode. Remedy: recover system.");
            return;
        }

        if (!solarPanelsActive) 
        {
            // Panels inactive → don’t allow data collection
            throw new InvalidOperationException("Data collection failed. Panels must be activated first.");
        }

        dataCollected += 10;
        LoggerUtility.log("Data collected. Total = " + dataCollected);
    }

    public void printStatus() 
    {
        System.out.println("=== Satellite Status ===" + "\n");
        System.out.println("Orientation: " + orientation);
        System.out.println("Solar Panels: " + (solarPanelsActive ? "Active" : "Inactive"));
        System.out.println("Data Collected: " + dataCollected);
        System.out.println("Mode: " + mode);
    }

    // Mode controls
    public void triggerFailure() 
    {
        this.mode = "FAILURE";
        LoggerUtility.log("Satellite has entered FAILURE mode!");
    }

    public void recover() 
    {
        this.mode = "NORMAL";
        LoggerUtility.log("Satellite recovered. Back to NORMAL mode.");
    }

    private boolean isFailure() 
    {
        return mode.equals("FAILURE");
    }
}
