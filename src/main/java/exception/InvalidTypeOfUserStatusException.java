package exception;

public class InvalidTypeOfUserStatusException extends RuntimeException {

    public InvalidTypeOfUserStatusException(String message) {
        super(message);
    }
}
