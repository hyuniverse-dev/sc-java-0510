package part2.section19_exception;

public class UserIdException extends Exception {
    public UserIdException() {
    }

    public UserIdException(String message) {
        super(message);
    }
}
