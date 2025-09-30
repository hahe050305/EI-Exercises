import commands.*;
import core.Satellite;
import invoker.CommandInvoker;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(" !!!!!! ====== Welcome to Satellite Launch Simulation ====== !!!!!!");

        Satellite satellite = new Satellite();
        CommandInvoker invoker = new CommandInvoker();
        Scanner scanner = new Scanner(System.in);

                            // ... Show initial status ...
        System.out.println("\nInitial Satellite Status:");
        satellite.printStatus();

                            // ... Showing commands once at the beginning for user understanding ...
        System.out.println("\nAvailable Commands:");
        System.out.println("  rotate       -> rotate satellite");
        System.out.println("  activate     -> activate solar panels");
        System.out.println("  deactivate   -> deactivate solar panels");
        System.out.println("  collect      -> collect data");
        System.out.println("  status       -> show current status");
        System.out.println("  history      -> show executed commands");
        System.out.println("  undo         -> undo last command");
        System.out.println("  failure      -> simulate a failure state");
        System.out.println("  recover      -> recover from failure state");
        System.out.println("  exit         -> quit simulation");

        boolean running = true;
        while (running) 
        {
            System.out.print("\n> Enter command: ");
            String input = scanner.nextLine().trim().toLowerCase();

                                //... Using switch case to make the user interaction to be felt dynamic ...
            switch (input) 
            {
                case "exit":
                    running = false;
                    System.out.println("Shutting down satellite control. Goodbye!");
                    break;

                case "rotate":
                    System.out.print("  Enter direction (North/South/East/West): ");
                    String dir = scanner.nextLine().trim();
                    invoker.executeCommand(new RotateCommand(satellite, dir));
                    break;

                case "activate":
                    invoker.executeCommand(new ActivatePanelsCommand(satellite));
                    break;

                case "deactivate":
                    invoker.executeCommand(new DeactivatePanelsCommand(satellite));
                    break;

                case "collect":
                    invoker.executeCommand(new CollectDataCommand(satellite));
                    break;

                case "status":
                    satellite.printStatus();
                    break;

                case "history":
                    invoker.printHistory();
                    break;

                case "undo":
                    invoker.undoLast();
                    break;

                case "failure":
                    satellite.triggerFailure();
                    break;

                case "recover":
                    satellite.recover();
                    break;

                default:
                    System.out.println("Invalid command. Try again.");
            }
        }

        scanner.close();
    }
}
