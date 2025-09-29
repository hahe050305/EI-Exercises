package utils;

import java.time.LocalDateTime;

public class LoggerUtility {
    public static void log(String message) {
        System.out.println(LocalDateTime.now() + " [LOG]: " + message);
    }
}
