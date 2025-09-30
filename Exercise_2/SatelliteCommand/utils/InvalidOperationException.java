// Class Purpose :- " Handling out of bounds operations that are out of scope "

package utils;

public class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}
