// Class Purpose :- " To display the logs of user actions in a sequential manner after each command executions "

package utils;

import java.time.LocalDateTime;

public class LoggerUtility 
{
    public static void log(String message) 
    {
        System.out.println(LocalDateTime.now() + " [LOG]: " + message);
    }
}
