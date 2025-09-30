// Class Purpose :- " Handling the run-time exceptions "

package utils;

public class ErrorHandler {
    public static void handle(Exception e) {
        System.err.println("[ERROR] " + e.getMessage());
    }
}
